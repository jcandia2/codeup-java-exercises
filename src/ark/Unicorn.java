package ark;

/**
 * Created by moon on 11/29/17.
 */
public class Unicorn extends Animal {

    static int numberOfThisAnimal;



    public Unicorn() {
        super("unicorn");
        numberOfThisAnimal++;
        sound = "I'm a unicorn and I'm awesome!";
    }
//    public int getNumberOfThisAnimal() {
//        return numberOfThisAnimal;
//    }

}
