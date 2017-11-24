import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {

        int randomNumber = getRandom(1, 100);
//        System.out.println(randomNumber);

        int numberOfGuesses = 1;
        String playerName = getPlayerName();
        boolean found = false;
        String hint;

        System.out.print("I'm thinking of a number between 1 and 100. I'll give you 10 tries to guess my number.");
        System.out.println(" What is your first guess: ");

        int userGuess = getUserGuess();

        while (!found) {
            if (userGuess < randomNumber) {
                numberOfGuesses += 1;
                System.out.println(getMessage(numberOfGuesses, "HIGHER", playerName));
                userGuess = getUserGuess();
            } else if (userGuess > randomNumber) {
                numberOfGuesses += 1;
                System.out.println(getMessage(numberOfGuesses, "LOWER", playerName));
                userGuess = getUserGuess();
            } else {
                System.out.println("LUCKY GUESS " + playerName + "..... my number was " + randomNumber);
                found = true;
            }
        }
    }

    public static String getMessage(int count, String hint, String name) {
        int maxNumberOfGuesses = 10;
        int remainingGuesses = maxNumberOfGuesses - count;
        String message;
        switch (remainingGuesses) {
            case 9:
                message = "First guess. You have to go " + hint + ". Guess Again: ";
                break;
            case 8:
                message = "Second guess. You have to go " + hint + ". Guess Again: ";
                break;
            case 7:
                message = "Third guess. You have to go " + hint + ". Guess Again: ";
                break;
            case 6:
                message = "Fourth guess. You have to go " + hint + ". Guess Again: ";
                break;
            case 5:
                message = "That's your fifth guess " + name + ". You have to go " + hint + ". Guess Again: ";
                break;
            case 4:
                message = "NOPE! 4 guesses remaining. You have to go " + hint + ". Guess Again: ";
                break;
            case 3:
                message = "3 more guesses " + name + ". You have to go " + hint + ". Guess Again: ";
                break;
            case 2:
                message = "2 left. You have to go " + hint + ". Guess Again: ";
                break;
            case 1:
                message = "last 1. You have to go " + hint + ". Guess Again: ";
                break;
            case 0:
                message = "guess. You have to go " + hint + ". Guess Again: ";
                break;
            default:
                message = "I don't know what happened!!!";
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
