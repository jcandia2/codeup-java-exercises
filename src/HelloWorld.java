public class HelloWorld {
    public static void main(String[] args) {
        int myFavoriteNumber = 26;
        System.out.println(myFavoriteNumber);

        String myString = "Hello World!";
        System.out.println(myString);

        //in java all decimal numbers are interpreted as double, you'll either need to add an f or

        //this will give you a syntax error
//        float myNumber= 3.1; //3.1 is interpreted as a double, too big to fit in a float
//        System.out.println(myNumber);

        // one solution
//        float myNumber= 3.1f;
//        System.out.println(myNumber);

        // or do explicit casting by including float in parenthesis
//        float myNumber= (float) 3.1;
//        System.out.println(myNumber);
//
//        double pi = 3.14159f;
//        float almostPi = (float) pi;
//        System.out.println(pi); //shows 3.141590118408203 --- why?
//        System.out.println(almostPi);



//        a++ uses and then increments the variable.
//        ++a increments and then uses the variable.

//        int x = 5;
//        System.out.println(x++); //post increment
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);  //pre increment
//        System.out.println(x);


          // will give us an error since class a reserved word
//        String class ="my class";

//        int x = 4;
////        x = x + 5;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
////        y = y * x;
//        y *= x;
//        System.out.println(y);
//
        int x = 10;
        int y = 2;
//        x = x / y;
//        y = y - x;

        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);




    }
}
