package util;

import java.util.Scanner;

public class Input {
    private Scanner sc;


    // constructor
    public Input() {
        sc = new Scanner(System.in).useDelimiter("\n");
        //or
//        this.sc = new Scanner(System.in);
    }

    public String getString() {
        return sc.next();
    }

    //return true if the user enters y, yes...return false otherwise
    public boolean yesNo() {
        String input = sc.next();
        if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt() {
        if (sc.hasNextInt()) {
            return sc.nextInt();
        }else {
            System.out.println("not an integer");
            sc.next();
            return getInt();
        }
    }

//    prompts the user for input until they give an integer within the min and max, returns user input
    public int getInt(int min, int max) {
        int userInput = getInt();

        if(userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("not in range");
            return getInt(min,max);
        }
    }

    public double getDouble() {
        if (sc.hasNextDouble()) {
            return sc.nextDouble();
        }else {
            System.out.println("not an integer");
            sc.next();
            return getDouble();
        }
    }

    //    prompts the user for input until they give an integer within the min and max, returns user input
    public double getDouble(double min, double max) {
        double userInput = getDouble();

        if(userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("not in range");
            return getDouble(min,max);
        }
    }

}
