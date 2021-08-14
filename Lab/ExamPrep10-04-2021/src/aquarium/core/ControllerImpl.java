package aquarium.core;

import aquarium.entities.aquariums.Aquarium;
import aquarium.entities.aquariums.FreshwaterAquarium;
import aquarium.entities.aquariums.SaltwaterAquarium;
import aquarium.entities.decorations.Decoration;
import aquarium.entities.decorations.Ornament;
import aquarium.entities.decorations.Plant;
import aquarium.entities.fish.Fish;
import aquarium.entities.fish.FreshwaterFish;
import aquarium.entities.fish.SaltwaterFish;
import aquarium.repositories.DecorationRepository;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static aquarium.common.ConstantMessages.*;
import static aquarium.common.ExceptionMessages.*;

public class ControllerImpl implements Controller {
    private DecorationRepository decorations;
    private Map<String, Aquarium> aquariums;

    public ControllerImpl() {
        this.decorations = new DecorationRepository();
        this.aquariums = new LinkedHashMap<>();
    }

    @Override
    public String addAquarium(String aquariumType, String aquariumName) {
        Aquarium aquarium;
        if (aquariumType.equals("FreshwaterAquarium")) {
            aquarium = new FreshwaterAquarium(aquariumName);
        } else if (aquariumType.equals("SaltwaterAquarium")) {
            aquarium = new SaltwaterAquarium(aquariumName);
        } else {
            throw new NullPointerException(INVALID_AQUARIUM_TYPE);
        }
        aquariums.put(aquariumName, aquarium);
        return String.format(SUCCESSFULLY_ADDED_AQUARIUM_TYPE, aquariumType);
    }

    @Override
    public String addDecoration(String type) {
        Decoration decoration;
        if (type.equals("Ornament")) {
            decoration = new Ornament();
        } else if (type.equals("Plant")) {
            decoration = new Plant();
        } else {
            throw new IllegalArgumentException(INVALID_DECORATION_TYPE);
        }
        decorations.add(decoration);
        return String.format(SUCCESSFULLY_ADDED_DECORATION_TYPE, type);
    }

    @Override
    public String insertDecoration(String aquariumName, String decorationType) {
        Decoration decoration = decorations.findByType(decorationType);
        if (decoration == null) {
            throw new IllegalArgumentException(String.format(NO_DECORATION_FOUND, decorationType));
        }

        decorations.remove(decoration);
        aquariums.get(aquariumName).addDecoration(decoration);

        return String.format(SUCCESSFULLY_ADDED_DECORATION_IN_AQUARIUM, decorationType, aquariumName);
    }

    @Override
    public String addFish(String aquariumName, String fishType, String fishName, String fishSpecies, double price) {
        Fish fish;
        if (fishType.equals("FreshwaterFish")) {
            fish = new FreshwaterFish(fishName, fishSpecies, price);
        } else if (fishType.equals("SaltwaterFish")) {
            fish = new SaltwaterFish(fishName, fishSpecies, price);
        } else {
            throw new IllegalArgumentException(INVALID_FISH_TYPE);
        }
        String typeFish = fish.getClass().getSimpleName();
        String typeAquarium = aquariums.get(aquariumName).getClass().getSimpleName();

        if (typeFish.contains("Freshwater") && typeAquarium.contains("Freshwater")) {
            aquariums.get(aquariumName).addFish(fish);
        } else if (typeFish.contains("Saltwater") && typeAquarium.contains("Saltwater")) {
            aquariums.get(aquariumName).addFish(fish);
        } else {
            return WATER_NOT_SUITABLE;
        }


        return String.format(SUCCESSFULLY_ADDED_FISH_IN_AQUARIUM, typeFish, aquariumName);
    }

    @Override
    public String feedFish(String aquariumName) {
        aquariums.get(aquariumName).feed();
        return String.format(FISH_FED, aquariums.get(aquariumName).getFish().size());
    }

    @Override
    public String calculateValue(String aquariumName) {
        Aquarium aquarium = aquariums.get(aquariumName);
        double fishPrice = aquarium.getFish().stream().mapToDouble(Fish::getPrice).sum();
        double decorationsPrice = aquarium.getDecorations().stream().mapToDouble(Decoration::getPrice).sum();
        double price = fishPrice + decorationsPrice;
        return String.format(VALUE_AQUARIUM, aquariumName, price);
    }

    @Override
    public String report() {

        return aquariums
                .values()
                .stream()
                .map(Aquarium::getInfo)
                .collect(Collectors.joining(System.lineSeparator()));
    }
}
