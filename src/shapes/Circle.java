package shapes;

public class Circle {
    private double radius;

//    constructor
    public Circle(double radius) {
        this.radius = radius;
    }

// getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;  // this is really the only place you need this because of the ambiguity
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius,2);

    }
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }
}
