package animals;

public abstract class Animal {
    private String name;
    private String favouriteFood;

    protected Animal(String name, String favouriteFood){
        this.name = name;
        this.favouriteFood = favouriteFood;
    }

   protected abstract String explainSelf();

    protected String getName() {
        return name;
    }

    protected String getFavouriteFood() {
        return favouriteFood;
    }
}
