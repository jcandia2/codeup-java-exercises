import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
//        Create a class Bob for the following exercise with a main method. Bob is a lackadaisical teenager.
//        In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question.
//
//        He answers 'Whoa, chill out!' if you yell at him.
//
//        He says 'Fine. Be that way!' if you address him without actually saying anything.
//
//        He answers 'Whatever.' to anything else.

        String userResponse;

        do {
            System.out.print("Say something to Bob: ");
            Scanner sc = new Scanner(System.in);

            String input = sc.nextLine();

            if (input.indexOf("?") != -1) {
                System.out.println("Sure.");
            } else if (input.indexOf("!") != -1) {
                System.out.println("Whoa, chill out!");
            } else if (input.toLowerCase().equals("bob")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }
            System.out.println("Would you like to keep conversating with Bob? [y/n]");
            userResponse = sc.nextLine();
        } while (userResponse.toLowerCase().equals("y"));
    }
}
