package WildFarm.foods;

public abstract class Food {
    public int getQuantity() {
        return quantity;
    }

    private int quantity;

    protected Food(int quantity){
        this.quantity = quantity;
    }

}
