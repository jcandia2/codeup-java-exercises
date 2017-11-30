package shapes;

public class Square extends Quadrilateral {
    protected double side;

    public Square(double side) {
        super(side, side);
        this.side = side;

    }

    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }


    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
