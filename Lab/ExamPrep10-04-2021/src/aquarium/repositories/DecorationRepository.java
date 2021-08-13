package aquarium.repositories;

import aquarium.entities.decorations.Decoration;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class DecorationRepository implements Repository {
    private Collection<Decoration> decorations;

    public DecorationRepository() {
    }

    @Override
    public void add(Decoration decoration) {

    }

    @Override
    public boolean remove(Decoration decoration) {
        return false;
    }

    @Override
    public Decoration findByType(String type) {
        return null;
    }
}
