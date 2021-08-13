package aquarium.core;

import aquarium.entities.aquariums.Aquarium;
import aquarium.repositories.DecorationRepository;

import java.util.List;

public class ControllerImpl implements Controller{

    private DecorationRepository decorations;
    private List<Aquarium> aquariums;

    public ControllerImpl() {

    }

    @Override
    public String addAquarium(String aquariumType, String aquariumName) {
        return null;
    }

    @Override
    public String addDecoration(String type) {
        return null;
    }

    @Override
    public String insertDecoration(String aquariumName, String decorationType) {
        return null;
    }

    @Override
    public String addFish(String aquariumName, String fishType, String fishName, String fishSpecies, double price) {
        return null;
    }

    @Override
    public String feedFish(String aquariumName) {
        return null;
    }

    @Override
    public String calculateValue(String aquariumName) {
        return null;
    }

    @Override
    public String report() {
        return null;
    }
}
