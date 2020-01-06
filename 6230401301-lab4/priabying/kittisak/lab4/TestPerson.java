package priabying.kittisak.lab4;

/**
* Author: Kittisak Priabying
* ID: 623040130-1
* Sec: 1
* Date: January 06, 2020
 */
public class TestPerson {
    public static void main(String[] args) {
        Person unknown = new Person();
        System.out.println(unknown);
        System.out.println(Person.getNumberOfPerson() + " person has been created.");
        Person sala = new Person("sala");
        Person mane = new Person("mane", 175, 65);
        System.out.println(sala);
        System.out.println(mane);
        Person henderson = new Person("henderson", 180, 100);
        System.out.println(henderson);
        System.out.println(mane.getName() + "'s BMI is " + mane.getBMI());
        System.out.println(henderson.getName() + "'s BMI is " + henderson.getBMI());
        henderson.setWeight(80);
        System.out.println(henderson.getName() + "'s BMI is " + henderson.getBMI());
        System.out.println(Person.getNumberOfPerson() + " persons have been created.");
    }

}