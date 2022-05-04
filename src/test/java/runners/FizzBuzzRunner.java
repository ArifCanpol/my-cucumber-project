package runners;

import org.junit.Test;

import java.util.Scanner;

import static utilities.ReadTxt.*;
import static utilities.WriteToTxt.saveFizzBuzzResults;

public class FizzBuzzRunner {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        double x = 0;
//        int n = 0;
//             try {
//              do {
//                System.out.println("Please, enter an integer");
//               System.out.println("enter 0 if you want to quit");
//         x = scan.nextDouble();
//           n = (int) x;
//            System.out.println("Please, enter an integer");
//            System.out.println(n);
//            String result = (n != 0) ? ((n % 3 == 0) ?
//                    ((n % 5 == 0) ? ("FizzBuzz") : ("Fizz")) :
//                    ((n % 5 == 0) ? ("Buzz") : "" + n + " is neither Fizz nor Buzz")) : "you entered 0";
//            System.out.println(result);
//
//         } while (n != 0);
//             } catch (Exception e) {
//                System.out.println("Your input do not seem like an integer. Next time please be sure that you give an integer");
//
//             }




        try {
            System.out.println("Please, enter an integer");
            double x = scan.nextDouble();
            int n = (int) x;

            for (int i=1;i<=n;i++) {

                String result = (i % 3 == 0) ? ((i % 5 == 0) ? ("FizzBuzz") : ("Fizz")) : ((i % 5 == 0) ? ("Buzz") : ""+i);

                if( (i%3!=0) && (i%5!=0) ){
                    System.out.println(i+" = "+result);
                    saveFizzBuzzResults(""+i+" = "+result);

                }

            } System.out.println(getAllData());
        }catch (Exception e) {
            System.out.println("Your input do not seem like a positive integer. Next time please be sure that you give an integer");

        }
        scan.close();



    }

    @Test
    public void fizzBuzzTest() {

        int n = 0;

        for (n=1;n<=100000;n++) {
            System.out.println(n);
            String result = (n != 0) ? ((n % 3 == 0) ?
                    ((n % 5 == 0) ? ("FizzBuzz") : ("Fizz")) :
                    ((n % 5 == 0) ? ("Buzz") : ""+n)) : "you entered 0";
            System.out.println(result);
            saveFizzBuzzResults(""+n+" = "+result);
        }

    }

    @Test
    public void getFizzBuzzList(){

        System.out.println( getFizzs() );
        System.out.println( getBuzzs() );
        System.out.println( getFizzBuzzs() );

    }


}

