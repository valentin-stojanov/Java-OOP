package ValidationData;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private double bonus;

    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
        this.bonus = 0;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() >= 3) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
    }

    public void setLastName(String lastName) {
        if (lastName.length() >= 3) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
    }

    private void setSalary() {
        this.salary = this.salary * (1 + bonus);
    }

    private void setSalary(double salary) {
        if (salary >= 460) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    private void setBonus(double bonus) {
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
