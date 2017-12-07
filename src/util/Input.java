package util;

import java.util.Scanner;

public class Input {
    private Scanner sc;

    // constructor
    public Input() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        //or
//        this.sc = new Scanner(System.in);
    }

    public String getString() {
        return this.sc.next();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return this.sc.next();
    }

    //return true if the user enters y, yes...return false otherwise
    public boolean yesNo() {
        String input = sc.next();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String input = this.sc.next();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt() {
        String userInput = this.sc.next();

        try {
            return Integer.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("input is not an integer");
            System.out.println(e.getMessage());
            return getInt();
        }
    }

    //    prompts the user for input until they give an integer within the min and max, returns user input
    public int getInt(int min, int max) {
        int userInput = getInt();

        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("not in range");
            return getInt(min, max);
        }
    }

    public double getDouble() {
        String userInput = this.sc.next();

        try {
            return Double.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("input is not a double");
            System.out.println(e.getMessage());
            return getDouble();
        }
    }


    //    prompts the user for input until they give an integer within the min and max, returns user input
    public double getDouble(double min, double max) {
        double userInput = getDouble();

        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("not in range");
            return getDouble(min, max);
        }
    }

}
