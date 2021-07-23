package sayHello;

public abstract class BasePerson implements Person{

    private String name;

    public BasePerson(String name){
        this.setName(name);
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public abstract String sayHello();

    public String getName(){
        return this.name;
    }
    //
}
