/**
* Author: Kittisak Priabying
* ID: 623040130-1
* Sec: 1
* Date: January 06, 2020
 */
package priabying.kittisak.lab4;

class Person {
    // variables
    private String name;
    private double height;
    private double weight;
    private static int numberOfPerson = 0;

    // Constructor no parameter.
    public Person() {
        this.name = "unknown";
        this.height = 0.0f;
        this.weight = 0.0f;
        numberOfPerson++;
    }

    // Constructor 1 parameter.
    public Person(String newName) {
        this.name = newName;
        this.height = 0.0f;
        this.weight = 0.0f;
        numberOfPerson++;
    }

    // Constructor 3 parameter.
    public Person(String newName, double newHeight, double newWeight) {
        this.name = newName;
        this.height = newHeight;
        this.weight = newWeight;
        numberOfPerson++;
    }

    // setter for the name.
    public void setName(String newName) {
        name = newName;
    }

    // getter for the name.
    public String getName() {
        return name;
    }

    // setter for the height.
    public void setHeight(double newHeight) {
        height = newHeight;
    }

    // getter for the height.
    public double getHeight() {
        return height;
    }

    // setter for the weight.
    public void setWeight(double newWeight) {
        weight = newWeight;
    }

    // getter for the weight.
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() { // output template
        return "name = " + name + ", height = " + height + " cm. weight = " + weight + " kg.";
    }

    // getter for the NumberOfPerson.
    static int getNumberOfPerson() {
        return numberOfPerson;
    }

    // get BMI
    public String getBMI() {
        double height = this.height / 100; // cm. to m.
        double weight = this.weight;
        return String.format("%.2f", weight / (height * height)); // calculate BMI
    }
}