package shapes;

public class Square extends Rectangle {
    //    Square should define a constructor that accepts one argument, side, and calls the parent's constructor to
//    set both the length and width to the value of side.
    protected double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public double getArea() {
        System.out.println("calculating area from the Square class:");
        return Math.pow(this.side, 2);
    }

    public double getPerimeter() {
        System.out.println("calculating perimeter from the Square class:");
        return 4 * this.side;
    }

}
