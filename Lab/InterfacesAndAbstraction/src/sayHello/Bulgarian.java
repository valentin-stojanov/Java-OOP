package sayHello;

public class Bulgarian extends People {

    public Bulgarian(String name){
        super(name);
    }

    @Override
    public String sayHello(){
        return "Здравей";
    }

}
