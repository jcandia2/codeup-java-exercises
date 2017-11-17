import java.util.*;

public class ControlFlowExercises {
    public static void main(String[] args) {

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


        int userInput;
        String userResponse;

        Scanner sc = new Scanner(System.in);


        do {
            System.out.print("Enter an integer: ");
            userInput = sc.nextInt();

            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            int squared, cubed;

            for (int i = 1; i <= userInput; i++) {
                squared = i * i;
                cubed = i * i * i;
                System.out.printf("%-7d| %-8d| %d\n", i, squared, cubed);
            }
            System.out.println("Would you like to continue? y/n");
            userResponse = sc.next();
        } while(userResponse.equals("y"));

    }
}
