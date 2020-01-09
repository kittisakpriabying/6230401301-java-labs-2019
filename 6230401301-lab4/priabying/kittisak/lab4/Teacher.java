/**
* Author: Kittisak Priabying
* ID: 623040130-1
* Sec: 1
* Date: January 06, 2020
 */
package priabying.kittisak.lab4;

public class Teacher extends PersonV2 {
    // variables called teachingSubject and salary.
    private String teachingSubject;
    private int salary;

    // constructor 6 parameters.
    public Teacher(String name, double height, double weight, String dob, String newTeachingSubject, int newSalary) {
        super(name, height, weight, dob); // variables in class PersonV2.
        this.salary = newSalary;
        this.teachingSubject = newTeachingSubject;

    }

    // setter for the teachingSubject.
    public void setTeachingSubject(String newTeachingSubject) {
        teachingSubject = newTeachingSubject;
    }

    // getter for the teachingSubject.
    public String getTeachingSubject() {
        return teachingSubject;
    }

    // setter for the salary.
    public void setSalary(int newSalary) {
        salary = newSalary;
    }

    // getter for the salary.
    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() { // add teachingSubject and salary to output.
        return super.toString() + ", teachingSubject = " + teachingSubject + ", Salary = " + salary;
    }

}