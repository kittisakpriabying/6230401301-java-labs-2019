package priabying.kittisak.lab10;

import java.time.*;

public class Person {
    protected String name;
    protected double weight;
    protected double height;
    protected LocalDate dob;

    public Person() {
        this.name = "";
        this.weight = 0;
        this.height = 0;
        this.dob = null;
    }

    public Person(String name, double weight, double height, LocalDate dob) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        Period age = Period.between(dob, LocalDate.now());
        return getName() + " is " + age.getYears() + " years " + age.getMonths() + " months " + age.getDays()
                + " days, has weight as " + weight + " kg., and height as " + height + " cm.";
    }

}