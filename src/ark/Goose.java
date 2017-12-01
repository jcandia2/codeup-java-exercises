package ark;

public class Goose extends Animal {

    static int numberOfThisAnimal;

    public Goose() {
        super("Goose");
        sound = "HONK HONK HONK!";
        numberOfThisAnimal++;
    }

//    public int getNumberOfThisAnimal() {
//        return numberOfThisAnimal;
//    }
}
