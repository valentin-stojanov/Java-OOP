package SalaryIncrease;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private double bonus;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.bonus = 0;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public int getAge() {
        return this.age;
    }

    private double getSalary() {
        return this.salary;
    }

    public void setSalary(){
        this.salary = this.salary * (1 + bonus);
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    private  void setBonus(double bonus){
         this.bonus = bonus / 100;
        if (this.getAge() < 30) {
            this.bonus /= 2;
        }
    }

    public void increaseSalary(double bonus) {
        this.setBonus(bonus);
        this.setSalary();
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %f leva",
                this.firstName, this.lastName, this.getSalary());
    }
}
