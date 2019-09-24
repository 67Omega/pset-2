/**
 * Problem Set 2.
 * 
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 * 
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Exercise 1.
         * 
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         */

        Scanner in = new Scanner(System.in);
    System.out.println("Enter your first name: ");
    String firstName = in.next();
    in.nextLine();

    System.out.println("Enter your last name:");
    String lastName = in.next();
    in.nextLine();

    System.out.println("Enter your grade:");
    int grade = in.nextInt();
    in.nextLine();

    System.out.println("Enter your age:");
    int age = in.nextInt();
    in.nextLine();

    System.out.println("Enter your hometown:");
    String hometown = in.nextLine();
    System.out.println("");
    System.out.println("NAME \t \t : " + firstName + " " + lastName);
    System.out.println("GRADE \t \t : " + grade);
    System.out.println("AGE \t \t : " + age);
    System.out.println("HOMETOWN \t : " + hometown + "\n \n");

    in.close();
        
        /*
         * Exercise 2.
         * 
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */

	Scanner in = new Scanner(System.in);
    System.out.println("Enter a dollar amount: ");
    int dollarAmountInPercent = (int) Math.round((in.nextDouble()) * 100);
    System.out.println();
    int dollarValue = 100;
    int quarterValue = 25;
    int dimeValue = 10;
    int nickelValue = 5;
    int pennyValue = 1;
    int numDollars = (int) Math.floor(dollarAmountInPercent / dollarValue);
    int percentChangeOne = dollarAmountInPercent - (numDollars * dollarValue);
    int numQuarters = (int) Math.floor(percentChangeOne / quarterValue);
    int percentChangeTwo = percentChangeOne - (numQuarters * quarterValue);
    int numDimes = (int) Math.floor(percentChangeTwo / dimeValue);
    int percentChangeThree = percentChangeTwo - (numDimes * dimeValue);
    int numNickels = (int) Math.floor(percentChangeThree / nickelValue);
    int percentChangeFour = percentChangeThree - (numNickels * nickelValue);
    int numPennies = (int) Math.floor(percentChangeFour / pennyValue);
    int percentChangeFinal = percentChangeFour - (numPennies * pennyValue);
    System.out.printf("DOLLARS \t: %d\n", numDollars);
    System.out.printf("QUARTERS \t: %d\n", numQuarters);
    System.out.printf("DIMES \t\t: %d\n", numDimes);
    System.out.printf("NICKELS \t: %d\n", numNickels);
    System.out.printf("PENNIES \t: %d\n\n", numPennies);
    in.close();

        /*
         * Exercise 3.
         * 
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */



        /*
         * Exercise 4.
         * 
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */


        
        /*
         * Exercise 5.
         * 
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */
        

        
        /*
         * Exercise 6.
         * 
         * Given a diameter, print the area and circumference of the corresponding circle.
         */
        


        /*
         * Exercise 7.
         * 
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */
        

        
        /*
         * Exercise 8.
         * 
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */
        

        
        /*
         * Exercise 9.
         * 
         * Given a string, reverse and print the first and second halves of that string.
         */
        

        
        /*
         * Exercise 10.
         * 
         * Given a first, middle, and last name, print the corresponding initials.
         */
        

        
        in.close();
    }
}