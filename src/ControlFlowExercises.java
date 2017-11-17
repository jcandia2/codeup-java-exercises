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

//        long j = 2;
//
//        do {
//            System.out.println(j*j);
//            j *= j;
//        } while (j < 1000000);

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
            System.out.println(i*i);
        }


    }
}
