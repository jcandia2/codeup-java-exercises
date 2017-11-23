import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter a number: ");
//        double number1 = sc.nextDouble();
//
//        System.out.print("Enter another number: ");
//        double number2 = sc.nextDouble();

//        System.out.println(number1 + " + " + number2 + "= " + sum(number1, number2));
//        System.out.println(number1 + " - " + number2 + "= " + difference(number1, number2));
//        System.out.println(number1 + " * " + number2 + "= " + multiply(number1, number2));
//
//        if (number2 == 0) {
//            System.out.println("cannot divide by zero!");
//        } else {
//            System.out.println(number1 + " / " + number2 + "= " + divide(number1, number2));
//            System.out.println(number1 + " % " + number2 + "= " + modulus(number1, number2));
//        }

//        System.out.println("using multiplacationLoop " + number1 + " * " + number2 + "= " + multiplicationLoop(number1,number2));
//        System.out.println("using multiplicationLoopRecursion " + number1 + " * " + number2 + "= " + multiplicationLoopRecursion(number1,number2));

//        System.out.print("Enter another number between 1 and 10: ");
//        int secondNumber = getInteger(1, 10);
//
//        System.out.println(firstNumber + " + " + secondNumber + " = " + firstNumber + secondNumber);

        String response = "y";

        while (response.equalsIgnoreCase("y")) {
            System.out.print("Enter a number between 1 and 10: ");
            int firstNumber = getInteger(1, 10);
            System.out.println(factorial(firstNumber));
            System.out.println("Would you like to do another number? [y/n]");
            response = sc.nextLine();
        }
    }

    public static String factorial(int number) {
        long result = 1;
        int i;
        String output = number + "! = ";
        for (i = 1; i < number; i++) {
            result *= i;
            output += i + " x ";
        }

        result *= i;
        output += i;

        output += " = " + result;
        return output;
    }

    public static int getInteger(int min, int max) {

        Scanner sc = new Scanner(System.in);
        int numberEntered = sc.nextInt();
        if (numberEntered < min || numberEntered > max) {
            System.out.print("Please enter a number between 1 and 10: ");
            return getInteger(1, 10);
        } else
            return numberEntered;
    }

    public static double multiplicationLoop(double num1, double num2) {
        double total = 0;

        if (num1 < 0) {
            for (int i = 1; i <= Math.abs(num1); i++) {
                total += num2;
            }
            total *= -1;
        }

        for (int i = 1; i <= num1; i++) {
            total += num2;
        }
        return total;
    }

    public static double multiplicationLoopRecursion(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        } else if (num2 > 0) {
            return num1 + multiply(num1, num2 - 1);
        }
        return -multiply(num1, -num2);


    }


    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static int difference(int num1, int num2) {
        return num1 - num2;
    }

    public static double difference(double num1, double num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }

    public static double divide(double dividend, double divisor) {
        return dividend / divisor;
    }

    public static double modulus(double dividend, double divisor) {
        return dividend % divisor;
    }


}
