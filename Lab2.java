// Programmers: Claudia and Cynthia
// Course:  CS 212
// Due Date:
// Lab Assignment:
// Problem Statement:
// Data In:
// Data Out:
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person
//import the Scanner and the random
import java.util.Scanner;
import java.util.Random;


class Lab2 {
    public static void main(String[] args) {
        // initialize priza var
        long prize = 225938745L;
        // declare scanner
        Scanner input = new Scanner(System.in);
        //declare random number generator
        Random rand = new Random();

        // ask for name and store in a variable

        System.out.println("What's your name? ");

        String customerName = input.nextLine();


        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");

        //setting up a loop for the 10 lottery tickets, 6 number per line.

        // for 10 loops, iterate by 1 each line and do this
        for (int i = 1; i < 11; i++) {
            // begin by printing a blank space for aesthetic purposes
            System.out.println(" ");
            // for 6 loops, iterate by 1 each line and do this
            for (int x = 1; x < 7; x++) {
                // generate a random number between 0 and 99
                int rand_int = rand.nextInt(100);
                // print it
                System.out.print(rand_int);
                // then print a space between that and the next number
                System.out.print(" ");


            }


        }
        // printing final messages to user
        System.out.println("\n" + "Good luck " + customerName + "!");
        System.out.println("Estimated Jackpot:" + "\n" + "$" + prize);


    }
}
