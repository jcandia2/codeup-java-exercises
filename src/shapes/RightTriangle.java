package shapes;

public class RightTriangle extends Triangle implements Measurable {

    public RightTriangle(double side1, double side2, double side3) {
        super(side1, side2, side3);
    }

    @Override
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    @Override
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    @Override
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        double s = getPerimeter()/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
}
