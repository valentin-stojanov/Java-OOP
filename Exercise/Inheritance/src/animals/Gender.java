package animals;

public enum Gender {

    FEMALE ("Female"),
    MALE ("Male");

    private final String genderAsString;

    Gender(String gender){
        this.genderAsString = gender;
    }

    @Override
    public String toString() {
        return this.genderAsString;
    }
}
