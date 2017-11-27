public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish();
        dish.costInCents = 799;
        dish.nameOfDish = "soupy tacos";
        dish.wouldRecommend = true;

        if (dish.wouldRecommend) {
        System.out.println("The " + dish.nameOfDish + " at Frisco's Burgers are $" + dish.costInCents/100f);
            System.out.println("I would recommend them");
            dish.eat();
        } else {
            System.out.println("The " + dish.nameOfDish + " at Frisco's Burgers are " + dish.costInCents/100f);
            System.out.println("I would not recommend them");
        }


    }
}


//        Create another class called RestaurantTest
//        Add a main method and inside the method...
//        1) instantiate a RestaurantDish object called “dish”
//        2) assign values creative to each of the properties
//        3) print out each of the property values
//        4) test the eat() method by calling it