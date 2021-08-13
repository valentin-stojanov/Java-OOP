package aquarium.entities.aquariums;

import aquarium.entities.decorations.Decoration;
import aquarium.entities.fish.Fish;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public abstract class BaseAquarium implements Aquarium {
    private String name;
    private int capacity;
    private List<Decoration> decorations;
    private List<Fish> fish;

    protected BaseAquarium(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.decorations = new ArrayList<>();
        this.fish = new LinkedList<>();
    }

    @Override
    public int calculateComfort() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void addFish(Fish fish) {

    }

    @Override
    public void removeFish(Fish fish) {

    }

    @Override
    public void addDecoration(Decoration decoration) {

    }

    @Override
    public void feed() {

    }

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public Collection<Fish> getFish() {
        return null;
    }

    @Override
    public Collection<Decoration> getDecorations() {
        return null;
    }
}
