package shapes;

public class CirlceApp {
    public static void main(String[] args) {

        Circle cir = new Circle(5);

        System.out.println("A circle with a " + cir.getRadius());

        System.out.println("Has an area of " + cir.getArea());

        System.out.println("And a circumference of " + cir.getCircumference());

    }
}
