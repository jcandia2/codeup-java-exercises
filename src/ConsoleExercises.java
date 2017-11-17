import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        int userInput;
        String wordOne;
        String wordTwo;
        String wordThree;
//
//
        Scanner sc = new Scanner(System.in);
////        System.out.print("Enter an integer ");
//        System.out.print("Enter 3 words ");
//        wordOne = sc.nextLine();
//        wordTwo = sc.nextLine();
//        wordThree = sc.nextLine();
//////
//        System.out.println("wordOne is \"" + wordOne + "\" <--");
//        System.out.println("wordTwo is \"" + wordTwo + "\" <--");
//        System.out.println("wordThree is \"" + wordThree + "\" <--");

//        System.out.println("Enter a sentence:");
//
//        String mySentence;
//
////        mySentence = sc.next(); //only captures the first word in the sentence
//        mySentence = sc.nextLine();
//
//        System.out.println(mySentence);

        System.out.println("Enter length, width and height of the room:");

//        int length;
//        int width;

//        length = sc.nextInt();
//        width = sc.nextInt();

        float length;
        float width;
        float height;

        length = Float.parseFloat(sc.nextLine());
        width = Float.parseFloat(sc.nextLine());
        height = Float.parseFloat(sc.nextLine());

        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("height = " + height);
//
//
//        System.out.println("area = " + length * width);
//
//        int perimeter = (int)(2 * length + 2 * width);
//
//        System.out.println("perimter = " + (2 * length + 2 * width));
//
//        System.out.println("perimter = " + perimeter);
//
//        System.out.println("volume = " + length * width * height);

        System.out.print("Please enter an integer: ");
        int userInt = sc.nextInt();

        System.out.printf("You entered %d%n", userInt);

        System.out.print("Please enter two words: ");
        String first, second;
        first = sc.nextLine();
        second = sc.nextLine();

        System.out.println("first word: " + first + "\nsecond word: " + second);

        // ========== Explanation of why first word is blank after running the above code
//        previous sout was a print and not a printLine so it read the rest of the line from the previous sout

        // total example user input a user will enter throughout the execution of the above
        String totalExampleUserInput = "5\none\ntwo\n";

        System.out.println(totalExampleUserInput);

        // nextInt() or next() just takes the 5...
        int resultOfNextInt = 5;
        // leaving...
        String afterNextInt = "\none\ntwo\n";

        // first nextLine() takes the new line character only
        String resultOfFirstNextLine = "\n";
        // leaving...
        String afterfirstNextLine = "one\ntwo\n"; // storing only a seemingly empty string

        // second nextLine() takes the one and new line character
        String resultOfSecondNextLine = "one\n";
        // leaving...
        String aftersecondNextLine = "two\n";


        // How to work around this behavior???
        // 1) Read the Stack Overflow link I posted in the Slack Channel
        // 2) tl;dr...
        // if you use a next(), nextInt(), or nextDouble before a nextLine()
        // add an extra nextLine() before the first nextLine() you are using





    }

}
