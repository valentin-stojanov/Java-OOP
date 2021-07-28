package Ferrari;

public class Ferrari implements Car{
    private String driverName;
    private String model;

    public Ferrari (String driverName){
        this.driverName = driverName;
        this.model = "488-Spider";
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "brum-brum-brum-brrrrr";
    }

    @Override
    public String print() {
        return String.format(this.model + "/" + this.brakes()
                + "/" + this.gas() + "/" + this.driverName);
    }


}