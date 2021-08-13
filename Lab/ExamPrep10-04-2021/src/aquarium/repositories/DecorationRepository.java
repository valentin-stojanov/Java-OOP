package aquarium.repositories;

import aquarium.entities.decorations.Decoration;

import java.util.List;

public abstract class DecorationRepository implements Repository {

    private List<Decoration> decorations;

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
