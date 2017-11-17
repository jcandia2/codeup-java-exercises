import java.util.*;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        1). Loop Basics
//
//        a) While
//
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//
//        while (i <= 15) {
//            System.out.printf("%d ",i);
//            i++;
//        }

//        b) Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number
//        with a new line.
//

//        int i = 0;
//
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i<=100);

//        Alter your loop to count backwards by 5's from 100 to -10.

//        i = 100;
//
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i>=-10);

//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number
//        is less than 1,000,000. Output should equal:
//        2
//        4
//        16
//        256
//        65536

        long j = 2;

        do {
            System.out.println(j);
            j *= j;
        } while (j < 1000000);

//        c) For loop
//        refactor the previous two exercises to use a for loop instead

        // 5 6 7 8 9 10 11 12 13 14 15
//        int i;
//
//        for (i = 5; i <= 15; i++) {
//            System.out.printf("%d ",i);
//
//        }

//        2
//        4
//        16
//        256
//        65536

        long i;

        for (i = 2; i <= 1000000; i *= i) {
            System.out.println(i);
        }

//        Display a table of powers.
//
//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output
//
//
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//        number | squared | cubed
//        ------ | ------- | -----
//        1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125


//        int userInput;
//        String userResponse;
//
        Scanner sc = new Scanner(System.in);
//
//
//        do {
//            System.out.print("Enter an integer: ");
//            userInput = sc.nextInt();
//
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            int squared, cubed;
//
//            for (int i = 1; i <= userInput; i++) {
//                squared = i * i;
//                cubed = i * i * i;
//                System.out.printf("%-7d| %-8d| %d\n", i, squared, cubed);
//            }
//            System.out.println("Would you like to continue? y/n");
//            userResponse = sc.next();
//        } while(userResponse.equals("y"));


//        Convert given number grades into letter grades.
//
//                Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0
//        Bonus
//
//        Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).

//        int numericalGrade;
//
//        String userResponse;
//
//        do {
//            System.out.println("Enter a numerical grade from 0 to 100 and I will display your letter grade.");
//            System.out.println("Enter a numerical grade from 0 to 100: ");
//
//            numericalGrade = sc.nextInt();
//
//            if (numericalGrade <= 100 && numericalGrade >= 88) {
//                System.out.println("Your letter grade is: A");
//            }
//            if (numericalGrade < 88 && numericalGrade >= 80) {
//                System.out.println("Your letter grade is: B");
//            }
//            if (numericalGrade < 80 && numericalGrade >= 67) {
//                System.out.println("Your letter grade is: C");
//            }
//            if (numericalGrade < 67 && numericalGrade >= 60) {
//                System.out.println("Your letter grade is: D");
//            }
//            if (numericalGrade < 60) {
//                System.out.println("Your letter grade is: F");
//            }
//            System.out.println("Would you like to continue? y/n");
//            userResponse = sc.next();
//        } while (userResponse.equals("y"));


        }
}
