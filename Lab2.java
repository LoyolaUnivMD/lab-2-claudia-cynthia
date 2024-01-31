// Programmers: Claudia and Cynthia
// Course:  CS 212
// Due Date: 02/03/23
// Lab Assignment: Lab 2
// Problem Statement: To create a lottery generator that'll print out the lottery tickets to the user, and the estimated prize.
// Data In: User's name
// Data Out: The lottery tickets number, your name with a good luck, and the estimated prize.
// Credits: Note #4 and Note #5



//import the Scanner and the random
import java.util.Scanner;
import java.util.Random;


class Lab2 {
    public static void main(String[] args) {
        long prize = 225938745L;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("What's your name? ");

        String customerName = input.nextLine();


        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");

        //setting up a loop for the 10 lottery tickets, 6 number per line.


        for (int i = 1; i < 11; i++) {
            System.out.println(" ");
            for (int x = 1; x < 7; x++) {
                int rand_int = rand.nextInt(100);
                System.out.print(rand_int);
                System.out.print(" ");


            }


        }

        System.out.println("\n" + "Good luck " + customerName + "!");
        System.out.println("Estimated Jackpot:" + "\n" + "$" + prize);


    }
}