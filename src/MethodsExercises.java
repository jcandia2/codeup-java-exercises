import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter another number: ");
        int number2 = sc.nextInt();

        System.out.println("%d + %d = %d", number1, number2, sum(number1, number2));





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

}
