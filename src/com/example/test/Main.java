package com.example.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* For the value of X and A, I assume they can be either hard coded or provided
        with a user input. So I provided an option for both cases */


        //I have also assumed that they are integers and not anything else such as floats
        int a = 0;
        int x = 0;

        Scanner reader = new Scanner(System.in);  // Reading from System.in

        //Simple error handling in the event an int is not entered
        try {
            System.out.println("Enter a value for A: ");
            a = reader.nextInt();

            System.out.println("Enter a value for X: ");
            x = reader.nextInt();
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

        //int x = 100; or whatever value
       //int a = 5; or whatever value


        /* I stop the loops either before a is greater than x,
            or if a equals x exactly*/

        //Iterate in multiples of A until X
        for(int i = 0; i <= x; i+=a){
            System.out.println("First loop: " + i);
        }

        //Iterate in multiples of A + 1 until 2X
        for(int i = 0; i <= x*2; i+=a+1){
            System.out.println("Second loop: " + i);
        }

        //Iterate in multiples of A + 2 until 3X
        for(int i = 0; i <= x*3; i+=a+3){
            System.out.println("Third loop: " + i);
        }


        /* I was going to use nested for loops / while loops to complete the challenge
            and had a working solution, however I do not believe it was a very efficient answer
            in terms of space and time complexity and went for the simpler answer instead for
            better readability, apologies if this is not the intended solution.
         */
    }
}
