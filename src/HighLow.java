import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int randomNumber = getRandom(1, 100);
        System.out.println(randomNumber);
        int maxNumberOfGuesses = 10;
        int numberOfGuesses = 1;
        String playerName = getPlayerName();


        System.out.print("I'm thinking of a number between 1 and 100. I'll give you 10 tries to guess my number.");
        System.out.println(" What is your first guess: ");

        int userGuess = getUserGuess();

        boolean found = false;

        while (!found) {
            if (userGuess < randomNumber) {
                numberOfGuesses += 1;
                System.out.print(getMessage(numberOfGuesses, maxNumberOfGuesses, playerName) + "HIGHER. Guess Again: ");
                userGuess = sc.nextInt();

            } else if (userGuess > randomNumber) {
                numberOfGuesses += 1;
                System.out.print(getMessage(numberOfGuesses, maxNumberOfGuesses, playerName) + "LOWER. Guess Again: ");
                userGuess = sc.nextInt();
            } else {
                System.out.println("LUCKY GUESS.....my number was " + randomNumber);
                found = true;
            }
        }

    }

    public static String getMessage(int count, int max, String name) {
        int remainingGuesses = max - count;
        String message;
        switch (remainingGuesses) {
            case 9:  message = "First guess. You have to go ";
                break;
            case 8:  message = "Second guess. You have to go ";
                break;
            case 7:  message = "Third guess. You have to go ";
                break;
            case 6:  message = "Fourth guess. You have to go ";
                break;
            case 5:  message = "That's your fifth guess " + name +  ". You have to go ";
                break;
            case 4:  message = "NOPE! 4 guesses remaining. You have to go ";
                break;
            case 3:  message = "3 more guesses " + name + ". You have to go ";
                break;
            case 2:  message = "2 left. You have to go ";
                break;
            case 1:  message = "last 1. You have to go ";
                break;
            case 0: message = "guess. You have to go ";
                break;
            default: message = "I don't know what happened!!!";
                break;
        }
        return message;
    }

    public static int getUserGuess() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static String getPlayerName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + ", let's play a game.");
        return name;
    }

    public static int getRandom(int min, int max) {
        return (int) (Math.random() * max + min);
    }
}
