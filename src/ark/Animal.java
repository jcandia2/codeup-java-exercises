package ark;

public class Animal {
    public String kingdom = "animal";
    protected String name;
    protected String sound;
    protected static int totalNumberOfAnimals;
    protected static int numberOfThisAnimal;

    public Animal(String name) {
        this.name = name;
        totalNumberOfAnimals++; //constructor adds 1 to totalNumberOfAnimals every time a new animal is created
        numberOfThisAnimal++;
    }

    public void soundOff() {
        System.out.println("The " + this.name + " goes " + this.sound);
    }

    public String getKingdom() {
        return kingdom;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    //static means an object doesn't have to be created for this method to be called
    public static int getTotalNumberOfAnimals() {
        return totalNumberOfAnimals;
    }

    public static int getNumberOfThisAnimal() {
        return numberOfThisAnimal;
    }
}
