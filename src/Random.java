/*
import java.util.*;
import java.util.Random;
*/
public class Random {


     // Write a program that creates a random object with seed 1000 and display the first 50 random integers between 0
     // and 100 using the nextInt(100) method.


    public Random(int i) {
    }

    public static void main(String[] args) {


        Random rand = null;

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        // int randomNum = rand.nextInt((max - min) + 1) + min;

        // System.out.println(randomNum);


        Random ran = new Random(1000);

        for (int i = 0; i <= 50; i++) {
            System.out.println(ran.nextInt(100));
        }
    }

    private int nextInt(int i) {
        return i;
    }
}



/*
import java.util.*;
public class NextInt2 {
    public static void main(String args[])
    {

        // create random object
        Random ran = new Random();

        // Print next int value
        // Returns number between 0-9
        int nxt = ran.nextInt(10);

        // Printing the random number
        // between 0 and 9
        System.out.println
        ("Random number between 0 and 10 is : " + nxt);
    }
}
 */