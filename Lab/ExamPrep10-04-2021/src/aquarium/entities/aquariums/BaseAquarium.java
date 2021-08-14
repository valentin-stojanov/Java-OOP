package aquarium.entities.aquariums;

import aquarium.entities.decorations.Decoration;
import aquarium.entities.fish.Fish;

import java.util.*;
import java.util.stream.Collectors;

import static aquarium.common.ConstantMessages.*;
import static aquarium.common.ExceptionMessages.*;

public abstract class BaseAquarium implements Aquarium {

    private String name;
    private int capacity;
    private Collection<Decoration> decorations;
    private Collection<Fish> fish;

    protected BaseAquarium(String name, int capacity) {
        this.setName(name);
        this.capacity = capacity;
        this.decorations = new ArrayList<>();
        this.fish = new ArrayList<>();
    }


    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(AQUARIUM_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public int calculateComfort() {
        return decorations
                .stream()
                .mapToInt(Decoration::getComfort)
                .sum();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void addFish(Fish fish) {
        if (this.fish.size() < this.capacity) {
            this.fish.add(fish);
        } else {
            throw new IllegalStateException(NOT_ENOUGH_CAPACITY);
        }
    }

    @Override
    public void removeFish(Fish fish) {
        if (!this.fish.isEmpty()) {
            this.fish.remove(fish);
        }
    }

    @Override
    public void addDecoration(Decoration decoration) {
        this.decorations.add(decoration);
    }

    @Override
    public void feed() {
        for (Fish f : fish) {
            f.eat();
        }
    }

    @Override
    public String getInfo() {
        String fishInAquarium = this.fish.isEmpty()
                ? "none"
                : this.fish.stream().map(Fish::getName).collect(Collectors.joining(" "));

        return String.format("%s (%s):%n" +
                        "Fish: %s%n" +
                        "Decorations: %d%n" +
                        "Comfort: %d"
                , getName()
                , getClass().getSimpleName()
                , fishInAquarium
                , this.decorations.size()
                , calculateComfort());
    }

    @Override
    public Collection<Fish> getFish() {
        return this.fish;
    }

    @Override
    public Collection<Decoration> getDecorations() {
        return this.decorations;
    }
}
