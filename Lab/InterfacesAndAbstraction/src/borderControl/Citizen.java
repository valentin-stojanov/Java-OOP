package borderControl;

public class Citizen implements Identifiable {

    private String name;
    private int age;
    private String id;

    public Citizen(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String getId(){
        return this.id;
    }

    @Override
    public int identify(){
       return Integer.parseInt(this.id.substring(this.id.length()-3));
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
