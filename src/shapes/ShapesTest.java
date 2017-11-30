package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5,4); //this instantiation calls the constructor
//
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//
//
//        // create a variable of the type Rectangle named box2 and assign it a new
//        // instance of the Square class that has a side value of 5 - this is polymorphism, it doesn't care
//        // what type it is as long as it is of type child or parent
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

    Measurable myShape = new RightTriangle(3, 4, 3);

        System.out.println(myShape.getArea());

        System.out.println(myShape.getPerimeter());


    }
}
