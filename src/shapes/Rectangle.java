package shapes;

public class Rectangle {
//    we leave out static because we do need an object to use these properties
    protected double length;
    protected double width;

    public Rectangle() {
    }

//    constructor - it's named the same as the class because it is constructing a class of this type
//    this is also the return type for this method
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

//    these methods don't need parameters because the length and width properties are already defined in our object
    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return 2 * length + 2 * width;
    }
}
