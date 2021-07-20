package animals;

public class Kitten extends Cat {

    private static final Gender GENDER = Gender.FEMALE;

    public Kitten(String name, int age) {
        super(name, age, GENDER);
    }

    @Override
    public String produceSound(){
        return "Meow";
    }
}
