import java.util.Arrays;

public class ArraysLecture {
//    Arrays

//    biggest difference to js is that you have to define the array (size and type)
//    i.e we can only have an array of strings or an array of objects but they have to be the same data type

//    An object that contains zero or more items called elements
//    All elements must be of the same type
//    Elements can be any valid type
//[] notation
//    Unlike JavaScript, arrays in Java have a fixed length

//    double[] prices; // declaring a var prices of type array with double elements
//    prices = new double[4]; //size of the array, once the array is create we can't change the size

//    or we can do it one line
//      double[] prices = new double[4];

//    here we have an array with 4 elements of type object BandMember (this is an array of objects)
//    final int NUMBER_OF_BEATLES = 4; //this is a constant we are defining
//    BandMember[] theBeatles = new BandMember[NUMBER_OF_BEATLES];




    public static void main(String[] args) {


        // slide 3 (Arrays)

//        double[] prices; // declare the array variable
//        prices = new double[4]; // this line creates the new array, it initializes to a default value in this case 0.0
//        System.out.println(prices[4]);


        // declare array variable and create new array in one line
//            double[] prices = new double[4];

        // using a variable for array size and using an array of objects
//            final int NUMBER_OF_BEATLES = 4;
//            BandMember[] theBeatles = new BandMember[NUMBER_OF_BEATLES];


        // slide 4 (Elements)

        // setting values at individual indices
//            int[] numbers = new int[3]; // an array numbers of type integers of size 3
//            numbers[0] = 1;
//            numbers[1] = 2;

//        or you could use array intializer
//        int[] numbers = {1,2,0};
//        System.out.println("element at index 0 is " + numbers[0]);
//        System.out.println("element at index 1 is " + numbers[1]);
//        System.out.println("element at index 2 is " + numbers[2]); // default value
//
//        // initializing values while declaring array with an array literal
//            String[] beatles = {"John", "Paul", "Ringo"};
//            System.out.println(beatles[0]); // "John"
//            System.out.println(beatles[2]); // "Ringo"
            // beatles[3] = "George"; // ArrayIndexOutOfBoundsException !


        // slide 5 (Iterating)

//            String[] languages = {"html", "css", "javascript", "java"};

        // regular for loop
//            for (int i = 0; i < languages.length; i++) {
//                System.out.println(languages[i]);
//            }

//        System.out.println("\n");

        // another way to iterate - enhanced for loop - this is a nice shorthand
//            for (String language : languages) { //we want to iterate over our languages array and we are calling our
//                System.out.println(language);       //our elements language
//            }


        // additional enhanced for loop example
//            int[] someNumbers = {1, 2, 3, 4, 5};
//            for (int n : someNumbers) {
//                System.out.println(n);
//            }


        // slide 6 and 7 (The Arrays Class) - static methods for common array manipulation

            String[] testArray = new String[4];

        // Arrays.fill(arrayName, value) - fills all or a range of elements with a given value

                Arrays.fill(testArray, "Badgers");

        // Arrays.toString(arrayName) - prints out a copy of the array contents

//                String arrayAsAString = Arrays.toString(testArray);
//                System.out.println(arrayAsAString);

        // Arrays.equals(array1, array2) - returns true if two array elements are equal and in the same order

//                String[] words = {"Mushroom", "Mushroom"};
//
//                System.out.println(words.equals(testArray));

        // Arrays.copyOf(array, length) - returns a copy array of a given array of a given length

//                String[] twoBadgers = Arrays.copyOf(testArray, 2);
//                System.out.println(Arrays.toString(twoBadgers));


        // Arrays.sort(array, startIndex, toIndex) - sorts array elements alphabetically/numerically 2nd and 3rd arguments are optional.

            String[] meme = {"Badgers", "Mushroom", "Badgers", "Snake"};

            System.out.println(Arrays.toString(meme));
            Arrays.sort(meme); // this does change the original
            System.out.println(Arrays.toString(meme));


        // Arrays.binarySearch(array, value) - returns the index of a value if in the array or -1 if not found
        // Array MUST be sorted before using binarySearch() to return a valid index.

//            String[] meme = {"Badgers", "Mushroom", "Badgers", "Snake"};
//            Arrays.sort(meme);
//
//            System.out.println(Arrays.binarySearch(meme,"fox")); // what???
//            System.out.println(Arrays.binarySearch(meme, "Snake"));


        // slide 8 (Two-Dimensional Arrays) - an array of arrays, we use the double square brackets [][]

        int[][] matrix = {
                {1, 2, 3},      //
                {4, 5, 6},
                {7, 8, 9}
        };

//                +---+----+--------+--------+
//                | [0][0] | [0][1] | [0][2] |
//                +---+----+--------+--------+
//                | [1][0] | [1][1] | [1][2] |
//                +---+----+--------+--------+
//                | [2][0] | [2][1] | [2][2] |
//                +---+----+--------+--------+


        for (int[] row : matrix) {
            System.out.println("+---+---+---+");
            System.out.print("| ");
            for (int n : row) {
                System.out.print(n + " | ");
            }
            System.out.println();
        }
        System.out.println("+---+---+---+");

    }
}
