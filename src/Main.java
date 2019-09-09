import java.util.Random;
import java.util.Scanner;

/*
* Remember: If you use Math class, "import java.lang.Math" is implied and not necessary
* */

public class Main {
    public static void main(String [] args){
//         Generate a random number from 1 to 5

//         OPTION 1 - USING RANDOM CLASS
//         Step 1. Create a Random class variable and an Integer variable
        Random rnd = new Random();
        int a;
        
//         Step 2. Use the nextInt() function to generate a random number between 0 and 4, then add 1.
//                 This changes our range to 1 through 5.
        a = rnd.nextInt(5) + 1;
//          0 ~ 4          + 1
//          0(+1) ~ 4(+1)
//          1 ~ 5
        System.out.println("The value of 'a' is " + a);

//         Generate a random number from 1 to 20
        a = rnd.nextInt(20) + 1;
//          0 ~ 19          + 1
//          0(+1) ~ 19(+1)
//          1 ~ 20
        System.out.println("The value of 'a' is " + a);
        
//         print blank lines
        System.out.println();
        System.out.println();
        
//         ==================================================

//         OPTION 2 - USING MATH CLASS
//         Step 1. Create an Integer variable
        int b;
//         Step 2. Use the random() function to generate a decimal between 0.0000 and 0.999999, multiply it by 5, then add 1.
//                 Then cast it to 
        b = (int)((Math.random()) * 5) + 1;
//          (int)((0.000 ~ 0.999) * 5) + 1
//          (int)( 0.000 ~ 4.99999999) + 1
//          (0          ~           4) + 1
//           1             ~             5
        System.out.println("The value of 'b' is " + b);


//         Generate a random number from 1 to 20
        b = (int)((Math.random()) * 20) + 1;
//          (int)((0.000 ~ 0.999) * 20) + 1
//          (int)( 0.000 ~ 19.99999999) + 1
//          (0          ~           19) + 1
//           1             ~             20
        System.out.println("The value of 'b' is " + b);
        
//          print blank lines
        System.out.println();
        System.out.println();
        
//         ==================================================

//         COMPLEX EXERCISE - Combine While Loop and If Statement
        int num;
        Scanner sc = new Scanner(System.in);

        while (true){
            num = 1 + (int)(Math.random() * 10);
            System.out.println("Here's a random number " + num);

            System.out.println("Go again?");
            String reply = sc.nextLine();

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
