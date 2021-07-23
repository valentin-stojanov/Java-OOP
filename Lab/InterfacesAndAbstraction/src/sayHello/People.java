package sayHello;

public abstract class People implements Person{

    private String name;

    public People(String name){
        this.name = name;
    }

    @Override
    public abstract String sayHello();

    public String getName(){
        return this.name;
    }
}
