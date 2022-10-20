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

        for (int num2 = 2; num2 <= first_d; num2++) {
            System.out.print("   ");
        }

        while (num3 <= days) {

            while (num1 <= 7 && num3 <= days) {


                if (num3 < 10) {
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



    public static void guessingGame(int x) {
        int num = 0;
        Scanner var = new Scanner(System.in);


        for (int y = 0; y <= 9; y++) {
            System.out.print("Guess number " + (y + 1) + ": ");
            num = var.nextInt();

            if (num == x) {
                System.out.println("You won wisenheimer!");
                y = 10;
            } else if (num < x && y != 9) {
                System.out.println("The number AI picked is higher than your guess.");
            } else if (num > x && y != 9) {
                System.out.println("The number AI picked is lower than your guess.");
            } else if (y == 9) {
                System.out.println("You lost! Have you ever heard of divide & conquer?");
            }
        }
    }

    public static int randomNumberBetweenOneAndHundred() {
        Random num = new Random();
        return num.ints(1, 101).findAny().getAsInt();
    }

    public static long[] lcg(long seed) {
        long[] array = new long[10];
        long x;
        long m = (long) Math.pow(2, 31);
        int c = 12345;
        long a = 1103515245;


        for (int y = 0; y < array.length; y++) {
            if (y == 0) {
                x = seed;
            } else {
                x = array[y - 1];
            }
            array[y] = (a * x + c) % m;
        }
        return array;
    }

    public static boolean swapArrays(int[] array1, int[] array2) {
        int x;

        if (array1.length != array2.length) {
            return false;
        }

        for (int y = 0; y < array1.length; y++) {
            x = array1[y];
            array1[y] = array2[y];
            array2[y] = x;
        }

        return true;
    }

    public static int checkDigit(int[] array1) {
        int gewichtung = 2;
        int x;
        int sum = 0;
        int psum = 0;

        for (int y = 0; y + 1 <= array1.length; y++) {
            gewichtung = y + 2;
            x = gewichtung * array1[y];
            sum += x;

        }
        sum = sum % 11;

        psum = 11 - sum;

        if (psum == 10) {
            psum = 0;
        }

        if (psum == 11) {
            psum = 5;
        }


        return psum;
    }

    public static String camelCase(String text) {
        int char_diff = 32;
        String smallchar= "";
        String camelcase= "";

        String[] arrayWords = text.split(" ");
        char[] arrayStringChars;

        for (String words : arrayWords) {
            arrayStringChars = words.toCharArray();
            boolean notFirstChar = false;
            for (char x : arrayStringChars) {
                if (x >= 'a' && x <= 'z') {
                    smallchar += x;
                }
                else if(x >= 'A' && x <= 'Z') {
                    smallchar += (char) (x + char_diff);
                }
            }

            arrayStringChars = smallchar.toCharArray();

            for (char y : arrayStringChars) {
                if (y >= 'a' && y <= 'z') {
                    if (notFirstChar) {
                        camelcase += y;
                    } else {
                        camelcase += (char) (y - char_diff);
                        notFirstChar = true;
                    }
                }
            }
            smallchar = "";
        }
        return camelcase;
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

        System.out.println();
        //lcg(0);

        long[] array = lcg(0);
        for(int y = 0; y < array.length; y++)
        {
            System.out.print(array[y] + " ");
        }

        System.out.println();
        int[] array1 = new int[]{1, 2, 3, 4, 5};
        int[] array2 = new int[]{100, 99, 60, 44, 2};
        swapArrays( array1, array2 );

        System.out.println();
        int y = randomNumberBetweenOneAndHundred();
        guessingGame(y);
    }
}