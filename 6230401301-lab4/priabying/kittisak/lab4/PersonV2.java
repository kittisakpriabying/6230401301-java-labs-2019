/**
* Author: Kittisak Priabying
* ID: 623040130-1
* Sec: 1
* Date: January 06, 2020
*/

package priabying.kittisak.lab4;

import java.time.LocalDate;
import java.time.Period;

public class PersonV2 extends Person {
    private LocalDate dob;

    public PersonV2(String name, double height, double weight, String newDob) {
        super(name, height, weight); // variables in class Person.
        this.dob = LocalDate.parse(newDob);
    }

    // setters for variable dob.
    public void setDob(String newDob) {
        dob = LocalDate.parse(newDob);

    }

    // getters for variable dob.
    public LocalDate getDob() {
        return dob;

    }

    // method called Birthday
    public void isBirthday() {
        LocalDate nowBirthDay = LocalDate.now();

        int day = dob.getDayOfYear();
        int month = dob.getMonthValue();
        int nowDay = nowBirthDay.getDayOfYear();
        int nowMonth = nowBirthDay.getMonthValue();

        // check birthday
        if (day == nowDay && month == nowMonth) {
            System.out.println("Today is " + this.getName() + "'s birthday. ");

        } else {
            System.out.println("Today is NOT " + this.getName() + "'s birthday. ");

        }

    }

    // method called howOld
    public void howOld() {
        Period distance = Period.between(this.dob, LocalDate.now()); 

        int distanceDay = distance.getDays();
        int distanceMonth = distance.getMonths();
        int distanceYear = distance.getYears();

        System.out.println(this.getName() + " is " + distanceYear + " years " + distanceMonth + " months and "
                + distanceDay + " days old.");
    }

    // method called compareAge
    public void compareAge(PersonV2 another) {
        LocalDate myBirthDay = this.dob;
        LocalDate yourBirthDay = another.getDob();

        Period distanceAge = Period.between(yourBirthDay, myBirthDay);
        // Convert value to a positive integer.
        int distanceDay = Math.abs(distanceAge.getDays()); // Days
        int distanceMonth = Math.abs(distanceAge.getMonths()); // Months
        int distanceYear = Math.abs(distanceAge.getYears()); // Years

        // compare yourBirthDay and myBirthDay
        if (yourBirthDay.isAfter(myBirthDay)) { // youBirthDay is after myBirthDay.

            System.out.println(this.getName() + " is " + distanceYear + " years " + distanceMonth + " months and "
                    + distanceDay + " day older than " + another.getName());
        }
        // youBirthDay is before myBirthDay.
        if (yourBirthDay.isBefore(myBirthDay)) {

            System.out.println(another.getName() + " is " + distanceYear + " years " + distanceMonth + " months and "
                    + distanceDay + " day older than " + this.getName());
        }
        // youBirthDay is equal myBirthDay.
        if (yourBirthDay.isEqual(myBirthDay)) {
            System.out.println(this.getName() + " and " + another.getName() + " are the same age.");

        }

    }

    @Override
    public String toString() {
        return super.toString() + ", Birthday = " + this.dob; // Add Birthday to output.
    }

}
