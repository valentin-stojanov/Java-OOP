package birthdayCelebrations;

public class Pet implements Birthable{
    private String name;
    private String birthDate;

    public Pet(String name, String birthdate){
        this.name = name;
        this.birthDate = birthdate;
    }

    public String getName(){
        return this.name;
    }

    public String getBirthDate() {
        return birthDate;
    }
}
