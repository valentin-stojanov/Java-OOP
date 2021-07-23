package sayHello;

public class Chinese extends People implements Person{

    public Chinese(String name){
        super(name);
    }

    @Override
    public String sayHello(){
        return "Djydjybydjy";
    }
}
