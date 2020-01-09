/**
* Author: Kittisak Priabying
* ID: 623040130-1
* Sec: 1
* Date: January 06, 2020
 */
package priabying.kittisak.lab4;

public class Student extends PersonV2 {
    // variables called major and GPA.
    private String major;
    private double GPA;

    // constructor
    public Student(String name, double height, double weight, String dob, String newMajor, double newGPA) {
        super(name, height, weight, dob); // variables in class PersonV2.
        this.major = newMajor;
        this.GPA = newGPA;

    }

    // setter for the major.
    public void setMajor(String newMajor) {
        major = newMajor;
    }

    // getter for the major.
    public String getMajor() {
        return major;
    }

    // setter for the GPA.
    public void setGPA(double newGPA) {
        GPA = newGPA;
    }

    // getter for the GPA.
    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() { // add major and GPA to output.
        return super.toString() + ", major = " + major + ", GPA = " + GPA;
    }

}