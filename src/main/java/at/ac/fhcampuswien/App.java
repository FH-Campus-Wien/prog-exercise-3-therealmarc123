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

    public static void guessingGame(int x) {
        int num = 0;
        Scanner var = new Scanner(System.in);


        for (int y = 0; y <= 9; y++){
            System.out.print("Guess number " + (y+1) + ": ");
            num = var.nextInt();

            if (num == x) {
                System.out.println("You won wisenheimer!");
                y = 10;
            }

            else if (num < x && y != 9) {
                System.out.println( "The number AI picked is higher than your guess." );
            }

            else if (num > x && y != 9) {
                System.out.println( "The number AI picked is lower than your guess." );
            }

            else if (y == 9) {
                System.out.println("You lost! Have you ever heard of divide & conquer?");
            }
        }
    }

    public static long[] lcg(long seed)
    {
        long[] array = new long[10];
        long x;
        long m = (long) Math.pow(2, 31);
        int c = 12345;
        long a = 1103515245;


        for(int y = 0; y < array.length; y++)
        {
            if( y == 0 ) {
                x = seed;
            }
            
            else {
                x = array[y - 1];
            }
            array[y] = (a * x + c) % m;
        }
        return array;
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