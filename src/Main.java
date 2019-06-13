import java.util.Random;
import java.util.Scanner;

/*
* Remember: If you use Math class, import java.lang.Math is implied and not necessary
* */

public class Main {
    public static void main(String [] args){
        // generate a random number from 1 to 5

        // option 1 - using Random class
        Random rnd = new Random();
        int a;
        a = rnd.nextInt(5) + 1;

        // let's try 1 to 20
        a = rnd.nextInt(20) + 1;
        System.out.println("The value of 'a' is " + a);

        // option 2 - using Math class range 1-5
        int b;
        b = (int)((Math.random()) *5) + 1;

        // let's try 1 to 30
        b = (int)(Math.random()*30) + 1;
        System.out.println("The value of 'b' is " + b);

        // blank lines
        System.out.println();
        System.out.println();

        // complex exercise - combine while loop and if statement
        int num;
        while (true){
            num = 1 + (int)(Math.random()*10);
            System.out.println("Here's a random number " + num);

            System.out.println("Go again?");
            Scanner keybd = new Scanner(System.in);
            String reply = keybd.nextLine();

            // commented out because we found a better way below
//            if (reply.equalsIgnoreCase("Y") || reply.equalsIgnoreCase("Yes")){
//                continue;
//            } else {
//                break;
//            }

            // let's make var "reply" all lowercase
            reply = reply.toLowerCase();
            // this way, we don't have to worry about "n" and "N" registering differently
            if (reply.charAt(0)=='n'){
                break;
            }
            // end of if
        }
        // end of while
        System.out.println("I've exited my while loop " + "\n" + "Goodbye!");
    }
}
