import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExercises {

//     # additional java array exercises
//
//        Make a file inside of your src file named "ArrayExercises.java"
//
//        1. Write a method named getRandomIntBetween that returns a random integer between a provided min and max
//          value.
//
//        2. In the main method, generate 100 random integers and store them in an array.
//
//        3. Write a method named countOdds that returns a count of all the odd numbers in that array.
//
//        4. Write a method named average that returns the average of every integer in that array.
//
//        5. Write a method named FizzBuzzify that takes in the array of integers and returns a new array of strings.
//          In the output array of strings, numbers that are evenly divisible by both 3 and 5 should be replaced with
//          "FizzBuzz", numbers evenly divizible by 3 should be replaced with "Fizz", numbers evenly divisible by 5
//          should be replaced with "Buzz", and all other numbers should be stored as a string version.
//        Example:
//        // input (generated by exercise #2 above)
//        int[] randomInts = {2, 37, 6, 15, 10, 1, 4};
//
//        // output
//        String[] fizzBuzzedArray = {"2", "37", Fizz", "FizzBuzz", "Buzz", "1", "4"};

    public static void main(String[] args) {

        int[] randomNumbers = new int[100];

//        int i = 0;
//
//        for (int randomNumber: randomNumbers) {
//            randomNumbers[i] = getRandomIntBetween(0,100);
//            i++;
//        }

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = getRandomIntBetween(0, 100);
        }

        System.out.println("randomNumbers array = " + Arrays.toString(randomNumbers));

//        System.out.println("the number of odd numbers in your array of random numbers is: " + countOdds(randomNumbers));
//        System.out.println("the number of even numbers in your array of random numbers is: " + countEvens(randomNumbers));
//
//        System.out.println("the average of your random numbers array is: " + findAverage(randomNumbers));


        String[] fizzBuzzifiedArray = new String[100];
        fizzBuzzifiedArray = fizzBuzzify(randomNumbers);

        System.out.println();
        System.out.println("the random numbers array fizzbuzzified is: " + Arrays.toString(fizzBuzzifiedArray));

    }

    public static int getRandomIntBetween(int min, int max) {

        return (int) (Math.random() * ((max - min) + 1) + min);

    }

    public static int countOdds(int[] someArray) {
        int counter = 0;
        for (int element : someArray) {
            if (element % 2 == 1) {
                counter++;
            }
        }
        return counter;
    }

    public static int countEvens(int[] someArray) {
        int counter = 0;
        for (int element : someArray) {
            if (element % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static double findAverage(int[] someArray) {
        int sum = 0;
        double avg = 0;

        for (int element : someArray) {
            sum += element;
        }
        avg = (double) (sum / someArray.length);
        return avg;
    }

    public static String[] fizzBuzzify(int[] someArray) {
        String[] newArray = new String[someArray.length];
        for (int i = 0; i < someArray.length; i++) {
            if (someArray[i] % 3 == 0 && someArray[i] % 5 == 0) {
                newArray[i] = "\"FizzBuzz\"";
            } else if (someArray[i] % 3 == 0) {
                newArray[i] = "\"Fizz\"";
            } else if (someArray[i] % 5 == 0) {
                newArray[i] = "\"Buzz\"";
            } else {
                newArray[i] = "\"" + Integer.toString(someArray[i]) + "\"";
            }
        }
        return newArray;
    }

}
