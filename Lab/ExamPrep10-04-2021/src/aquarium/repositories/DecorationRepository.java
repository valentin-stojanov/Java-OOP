package aquarium.repositories;

import aquarium.entities.decorations.Decoration;

import java.util.Collection;
import java.util.LinkedList;

public class DecorationRepository implements Repository {
    private Collection<Decoration> decorations;

    public DecorationRepository() {
        this.decorations = new LinkedList<>();
    }

    @Override
    public void add(Decoration decoration) {
        this.decorations.add(decoration);
    }

    @Override
    public boolean remove(Decoration decoration) {
        return decorations.remove(decoration);
    }

    @Override
    public Decoration findByType(String type) {
        for (Decoration decoration : decorations) {
            if (decoration.getClass().getSimpleName().equals(type)){
                return decoration;
            }
        }
        return null;
    }
}
