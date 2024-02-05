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
import java.text.DecimalFormat;
class Lab2 {
    public static void main(String[] args) {
        //Display program info.
        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");
        // initialize prize var
        double prize = 0.0;
        // declare scanner
        Scanner input = new Scanner(System.in);
        //declare random number generator
        Random rand = new Random();
        // Creating DecimalFormats for formatting numbers
        DecimalFormat twodigit = new DecimalFormat("00");
        DecimalFormat newprize = new DecimalFormat("$###,###,###.##");
        // ask for name and store in a variable
        System.out.println("What's your name? ");

        String customerName = input.nextLine();

        //ask for how much money to play
        System.out.println("How much money do you want to play?");

        double gamble = input.nextDouble();

        // Display the user's chosen amount to play
        System.out.println("Great! " + customerName + " wants to play " + newprize.format(gamble) + ".");

        System.out.println(); // Move to the next line
        System.out.println("Here are the tickets: ");
        System.out.println("-----------------");

        //setting up a loop for the 10 lottery tickets, 6 number per line.
        // for 10 loops, iterate by 1 each line and do this
        for (int i = 1; i < 11; i++) {
            // begin by printing a blank space for aesthetic purposes
            System.out.println(" ");
            // for 6 loops, iterate by 1 each line and do this
            for (int x = 1; x < 7; x++) {
                // generate a random number between 0 and 99
                int rand_int = rand.nextInt(100);
                // Format the number with leading zero and print.
                System.out.print(twodigit.format(rand_int) + " ");

                // Check if the generated number matches winning numbers
                if (rand_int == 3 || rand_int == 5 || rand_int == 16
                        || rand_int == 58 || rand_int == 59 || rand_int == 11){

                    gamble = Math.pow(gamble,1.75);}


            }
            System.out.println(); // Move to the next line for the next ticket
        }
        // printing final messages to user
        System.out.println("-----------------");
        System.out.println("Good luck " + customerName + "!");
        System.out.println("-----------------");
        System.out.println("Your Winnings are:");
        System.out.println(newprize.format(gamble));
        System.out.println("-----------------");



    }
}