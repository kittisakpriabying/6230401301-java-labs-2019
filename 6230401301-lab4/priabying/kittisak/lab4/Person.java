package priabying.kittisak.lab4;
class Person {
    private String name;
    private double height;
    private double weight;
    private static int numberOfPerson = 0;

    public Person() {
        this.name = "unknown";
        this.height = 0.0f;
        this.weight = 0.0f;
        numberOfPerson++;
    }

    public Person(String newName) {
        this.name = newName;
        this.height = 0.0f;
        this.weight = 0.0f;
        numberOfPerson++;
    }

    public Person(String newName, double newHeight, double newWeight) {
        this.name = newName;
        this.height = newHeight;
        this.weight = newWeight;
        numberOfPerson++;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setHeight(double newHeight) {
        height = newHeight;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double newWeight) {
        weight = newWeight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "name = " + name + ", height = " + height + " cm. weight = " + weight + " kg."; 
    }

    static int getNumberOfPerson() {
        return numberOfPerson;
    }

    public String getBMI() {
        double height = this.height / 100; // cm. to m. 
        double weight = this.weight;
        return String.format("%.2f", weight / (height * height)); //calculate BMI
    }
}