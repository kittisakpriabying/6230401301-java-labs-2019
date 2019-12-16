/**
* Author: Kittisak Priabying
* ID: 623040130-1
* Sec: 1
* Date: December 15, 2019
*
**/

package priabying.kittisak.lab2;

public class VowelsCounter {

    public static void main(String args[]) {
        int count = 0;
        String word = args[0];
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'A' || word.charAt(i) == 'a' ||
                word.charAt(i) == 'E' || word.charAt(i) == 'e' ||
                word.charAt(i) == 'I' || word.charAt(i) == 'i' ||
                word.charAt(i) == 'O' || word.charAt(i) == 'o' ||
                word.charAt(i) == 'U' || word.charAt(i) == 'u')
                {
                    count++ ; 
            }
        }
    System.out.println("Total number of towels is " + count);
    }
}