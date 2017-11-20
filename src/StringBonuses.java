import java.util.Scanner;

public class StringBonuses {
    public static void main(String[] args) {
//        ================================= STRING BONUSES
//        ----BONUS 1
//        Create date format converter application.
//        Take in the following format:
//        MM/DD/YYYY

//        Output the following:
//        MonthName DD, YYYY
//
//        Example:
//        input - 12/01/1999
//        output - December 12, 1999

        System.out.print("Enter a date in this forma MM/DD/YYYY: ");

        Scanner sc = new Scanner(System.in);

        String userInput = sc.next();

        String monthInput = userInput.substring(0,userInput.indexOf("/"));

        String dayInput = userInput.substring(userInput.indexOf("/")+1,userInput.lastIndexOf("/"));

        String yearInput = userInput.substring(userInput.lastIndexOf("/")+1);

        System.out.println(monthInput);
        System.out.println(dayInput);
        System.out.println(yearInput);

        String monthName;

        String color = "red";

        switch (monthInput) {
            case "01":
                monthName = "January";
                break;
            case "02":
                monthName = "February";
                break;
            case "03":
                monthName = "March";
                break;
            case "04":
                monthName = "April";
                break;
            case "05":
                monthName = "May";
                break;
            case "06":
                monthName = "June";
                break;
            case "07":
                monthName = "July";
                break;
            case "08":
                monthName = "August";
                break;
            case "09":
                monthName = "September";
                break;
            case "10":
                monthName = "October";
                break;
            case "11":
                monthName = "November";
                break;
            case "12":
                monthName = "December";
                break;
            default:
                System.out.println("Color not found");
        }








//
//        ----BONUS 2
//        Create an application that allows the user to enter a sentence
//        and tells them how many vowels and consonants were used.
//
//        Example:
//        input - "The hill are alive."
//        output - 5 vowels and 10 consonants
//
//        ----BONUS 3
//        Create a command line calculator application.
//
//        The program should welcome the user, prompt them for a calculation,
//        and give the result. The user should be prompted after each result is
//        outputted if they want to enter another calculation. When they
//        say no, give them an exit message. Allow the user first to specify
//        how many operands they will enter. Do not worry about
//        input validation (assume user enters correct data type).
//
//        Example program:
//
//...
//
//        WELCOME TO THE CALCULATOR APP!!! (program output)
//
//        Do you wish to enter a new calculation? (program output)
//        yes (user inputs this)
//
//        How many operands will you calculate? (program output)
//        2 (user inputs this)
//
//        Please enter a calculation: (program output)
//        2 + 2 (user enters this or something like this)
//        The output of 2 + 2 is 4. (program outputs this)
//
//        Do you wish to enter a new calculation? (program outputs this)
//        no (user enters this)
//
//        GOODBYE!!!
    }
}
