package sayHello;

public class European extends People {

    public European(String name){
        super(name);
    }

    @Override
    public String sayHello(){
        return "Hello";
    }
}
