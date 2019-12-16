/**
* Author: Kittisak Priabying
* ID: 623040130-1
* Sec: 1
* Date: December 15, 2019
*
**/

package priabying.kittisak.lab2;
import java.text.DecimalFormat ;
public class Calculator {
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        if (args[0].equals("q") || args[0].equals("Q")) {
            System.out.println("Quitting the program");
            System.exit(1);

        }else if (args[0].equals("/") && args[2].equals(("0"))) {
            System.out.println("The second operand cannot be zero");
            System.exit(1);
        }

        String aon = args[0];
        String num_1 = args[1];
        String num_2 = args[2];
        double num_3 = Double.parseDouble(num_1);
        double num_4 = Double.parseDouble(num_2);
        double result = 0 ;
        


        if (aon.equals("+")) {
            result = num_3 + num_4 ;

        } else if (aon.equals("-")) {
            result = num_3 - num_4 ;

        } else if (aon.equals("x")) {
            result = num_3 * num_4 ;

        }else if (aon.equals("/")) {
            result = num_3 / num_4 ;
             
        }

        System.out.println(num_3 + " " + aon +" "+ num_4 + " = " + df.format(result) );
        

        
        
    }

    
}