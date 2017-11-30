package shapes;

public interface Measurable {
//    An interface
//    is just a list of methods
//    allows us to have the implementation in any class that implements this interface
//    this is a checklist of methods that any class that implements this interface
//    the class that implements this interface will have to define all these methods
//    it's a checklist or a contract to remind you that all these methods have to be defined
//    we are talking to the compiler to tell it that these methods have to be defined
    double getPerimeter();
    double getArea();
}
