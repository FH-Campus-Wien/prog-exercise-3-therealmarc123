package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    // Implement all methods as public static

    public static void oneMonthCalendar(int days, int first_d) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
int num1 = first_d;
int num3 = 1;

for(int num2=2; num2 <= first_d;num2++){
    System.out.print("   ");
}

        while(num3 <= days){

            while (num1 <= 7 && num3 <= days ) {



                if(num3 < 10) {
                    System.out.print(" ");
                }
                System.out.print(num3);
                System.out.print(" ");
                num3++;

                num1++;


            }
            System.out.println();
            num1 = 1;
        }
    }

    /*public static boolean swapArrays(int[] numbers1, int[] numbers2){
            if(numbers1.length != numbers2.length)
                return false;
        return true;
    }

*/

    public static void guessingGame() {
        double x = 0;
        double y = 0;
        int count = 0;
        Scanner var = new Scanner(System.in);

        System.out.print("Number 1: ");
        y = var.nextInt();
    }

    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
           // App exercise3 = new App();

        //System.out.println("Task 1: Largest Number");
        //exercise3.largestNumber();
       /*

       for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }

        int []numbers1 = new int[10];
        numbers1[0] = 44;
        int x = numbers2[9];
        int []numbers2 = {4,3,2};
        boolean returnValue = swapArrays(new int[] {4,3,2}, new int[]{4});

       */
        oneMonthCalendar(31,7);

    }
}