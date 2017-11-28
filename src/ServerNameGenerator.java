public class ServerNameGenerator {

//    Server Name Generator
//
//    We are going to build a server name generator. Create a class inside of src named ServerNameGenerator,
//    and follow the specs below.
//
//    Create two arrays whose elements are strings, one with at least 10 adjectives, another with at least 10 nouns.
//    Create a method that will return a random element from an array of strings.
//    Add a main method, and inside of your main method select and random noun and adjective and hyphenate
//    the combination and display the generated name to the user.
//    Example Output:
//
//    Here is your server name:
//    dedicated-photon

    public static void main(String[] args) {
        String[] adjectives = {"good", "new", "first", "last", "long", "great", "little", "old", "big", "different"};
        String[] nouns = {"man", "mountain", "state", "ocean", "country", "building", "cat", "airline", "person", "dog"};

        System.out.println("Here is your server name:");
        System.out.println(getRandomWord(adjectives)+"-"+getRandomWord(nouns));

    }

    public static String getRandomWord(String[] array) {
        int rnd = (int) Math.floor(Math.random() * array.length);
        return array[rnd];
    }
}

