package borderControl;


public class Robot implements Identifiable{
    private String model;
    private String id;

    public Robot(String model, String id){
        this.id = id;
        this.model = model;
    }

    @Override
    public String getId(){
        return this.id;
    }

    @Override
    public int identify(){
        return Integer.parseInt(this.id.substring(this.id.length()-3));
    }

    public String getModel() {
        return model;
    }
}
