package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
//    we are not going to make an instance of a quadrilateral so that is why we use abstract
//    we'll make objects of squares and rectangles but not quadrilaterals

    protected double length;
    protected double width;


    protected Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    protected double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public abstract void setLength(double length);

    public abstract void setWidth(double width);
}
