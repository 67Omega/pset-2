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
    System.out.print("Enter your first name: ");
    String firstName = in.next();
    in.nextLine();

    System.out.print("Enter your last name:");
    String lastName = in.next();
    in.nextLine();

    System.out.print("Enter your grade:");
    int grade = in.nextInt();
    in.nextLine();

    System.out.print("Enter your age:");
    int age = in.nextInt();
    in.nextLine();

    System.out.print("Enter your hometown:");
    String hometown = in.nextLine();
    System.out.println();
    System.out.print("NAME \t \t : " + firstName + " " + lastName);
    System.out.print("GRADE \t \t : " + grade);
    System.out.print("AGE \t \t : " + age);
    System.out.print("HOMETOWN \t : " + hometown + "\n \n");
        
        /*
         * Exercise 2.
         * 
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */

	Scanner in = new Scanner(System.in);
    System.out.print("Enter a dollar amount: ");
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

        /*
         * Exercise 3.
         * 
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */

System.out.print("Enter a dollar amount: ");
    int newDollarAmountInPercent = (int) Math.round((in.nextDouble()) * 100);
    System.out.println();
    int twentyBillValue = 2000;
    int tenBillValue = 1000;
    int fiveBillValue = 500;
    int numTwentyBills = (int) Math.floor(newDollarAmountInPercent / twentyBillValue);
    int percentChangeTwenty = newDollarAmountInPercent - (numTwentyBills * twentyBillValue);
    int numTenBills = (int) Math.floor(percentChangeTwenty / tenBillValue);
    int percentChangeTen = percentChangeTwenty - (numTenBills * tenBillValue);
    int numFiveBills = (int) Math.floor(percentChangeTen / fiveBillValue);
    int percentChangeFive = percentChangeTen - (numFiveBills * fiveBillValue);
    int numDollarBills = (int) Math.floor(percentChangeFive / dollarValue);
    int percentChangeDollar = percentChangeFive - (numDollarBills * dollarValue);
    int newNumQuarters = (int) Math.floor(percentChangeDollar / quarterValue);
    int percentChangeQuarter = percentChangeDollar - (newNumQuarters * quarterValue);
    int newNumDimes = (int) Math.floor(percentChangeQuarter / dimeValue);
    int percentChangeDime = percentChangeQuarter - (newNumDimes * dimeValue);
    int newNumNickels = (int) Math.floor(percentChangeDime / nickelValue);
    int percentChangeNickel = percentChangeDime - (newNumNickels * nickelValue);
    int newNumPennies = (int) Math.floor(percentChangeNickel / pennyValue);
    int percentChangePenny = percentChangeNickel - (newNumPennies * pennyValue);
    int numBills = (numTwentyBills + numTenBills + numFiveBills + numDollarBills);
    int numCoins = (newNumQuarters + newNumDimes + newNumNickels + newNumPennies);
    System.out.printf("BILLS : %d\n", numBills);
    System.out.printf("COINS : %d\n\n", numCoins);

        /*
         * Exercise 4.
         * 
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */

Scanner in = new Scanner(System.in);
    System.out.print("Enter a number of inches: ");
    System.out.println();
    int numInches = in.nextInt();
    int inchesPerMile = 63360;
    int inchesPerYard = 36;
    int inchesPerFoot = 12;
    int numMiles = (int) Math.floor(numInches / inchesPerMile);
    int inchesNoMiles = numInches - (numMiles * inchesPerMile);
    int numYards = (int) Math.floor(inchesNoMiles / inchesPerYard);
    int inchesNoYards = (inchesNoMiles - (numYards * inchesPerYard));
    int numFeet = (int) Math.floor(inchesNoYards / inchesPerFoot);
    int remainingInches = (inchesNoYards - (numFeet * inchesPerFoot));
    System.out.printf("MILES : %d\n", numMiles);
    System.out.printf("YARDS : %d\n", numYards);
    System.out.printf("FEET  : %d\n", numFeet);
    System.out.printf("INCHES: %d\n\n", remainingInches);
        
        /*
         * Exercise 5.
         * 
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */
        
    Scanner in = new Scanner (System.in);
    System.out.print("Enter a number of centimeters: ");
    int numCentimeters = in.nextInt();
    System.out.println();
    int centimetersPerMeter = 100;
    int centimetersPerKilometer = 100000;
    int numKilometers = (int) Math.floor(numCentimeters / centimetersPerKilometer);
    int centimetersNoKilometers = numCentimeters - (numKilometers * centimetersPerKilometer);
    int numMeters = (int) Math.floor(centimetersNoKilometers / centimetersPerMeter);
    int remainingCentimeters = (centimetersNoKilometers - (numMeters * centimetersPerMeter));
    System.out.printf("KILOMETERS  : %d\n", numKilometers);
    System.out.printf("METERS      : %d\n", numMeters);
    System.out.printf("CENTIMETERS : %d\n\n", remainingCentimeters);
        
        /*
         * Exercise 6.
         * 
         * Given a diameter, print the area and circumference of the corresponding circle.
         */
        
Scanner in = new Scanner (System.in);
    System.out.print("Enter a diameter: ");
    int diameter = in.nextInt();
    System.out.println();
    double radius = (diameter * 0.5);
    double circleArea = (radius * radius) * Math.PI;
    double circumference = Math.PI * diameter;
    System.out.printf("AREA          : %.2f\n", circleArea);
    System.out.printf("CIRCUMFERENCE : %.2f\n\n", circumference);

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