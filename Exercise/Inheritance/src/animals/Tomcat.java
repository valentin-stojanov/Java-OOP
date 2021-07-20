package animals;

public class Tomcat extends Cat {
    public static final Gender GENDER = Gender.MALE;

    public Tomcat(String name, int age) {
        super(name, age, GENDER);
    }

    @Override
    public String produceSound(){
        return "MEOW";
    }
}
