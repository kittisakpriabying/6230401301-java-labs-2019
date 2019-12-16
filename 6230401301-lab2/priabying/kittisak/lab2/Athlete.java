/**
 * This Athlete program is to accept three arguments: athlete name, the sport name 
*  that that athlete plays, and the nationality of that athlete.  Its output format is "My 
*  favorite athlete is <athlete_name> who plays <sport_name> and has 
* nationality as <athlete_nationality>"  
*
* Author: Manee Jaidee
* ID: 623040123-4
* Sec: 1
* Date: December 12, 2019
*
**/

package priabying.kittisak.lab2;
public class Athlete {
    public static void main(String[] args) {
        
        String athleteName = args[0];
        String sportName = args[1];
        String athleteNationality = args[2];
        System.out.println("My favorite athlete is " + athleteName + " who play " + sportName + " has nationality as " + athleteNationality);
    

    }

    
}