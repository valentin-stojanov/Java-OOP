package animals;


public class Animal {

    private String name;
    private int age;
    private Gender gender;

    public Animal(String name, int age, Gender gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    private void setName(String name) {
        if (name.trim().isEmpty()){
            throw new IllegalStateException("Invalid input!");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age < 0){
            throw new IllegalStateException("Invalid input!");
        }
        this.age = age;
    }

    private void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s %d %s",
                this.getClass().getSimpleName(),
                this.name,
                this.age,
                this.gender.toString());
    }

    public String produceSound(){
        return "";
    }

}
