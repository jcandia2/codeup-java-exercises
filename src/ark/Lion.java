package ark;

public class Lion extends Animal {

    static int numberOfThisAnimal;


    public Lion() {
        super("lion");
        numberOfThisAnimal++;
        sound = "ROAR!";

    }
//    public int getNumberOfThisAnimal() {
//        return numberOfThisAnimal;
//    }
}
