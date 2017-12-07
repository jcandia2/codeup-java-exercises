import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class FileDemoSmall {
    public static void main(String[] args)  {

//        try {
////            writeTestFile();
//            writeChoresToFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//            System.out.println("IO Exception, fix your stuff!");
//        } catch(Exception e) {  //if there was any other Exception being thrown it would catch it here
//            System.out.println(e.getStackTrace());
//            System.out.println(e.getMessage());
//            System.out.println("Something went wrong.!");
//        }
//
//        readAllChores();
//    }

//    public static void writeChoresToFile() throws IOException {
//        String directory = "data";
//        String filename = "info.txt";
//        Path dataDirectory = Paths.get(directory);
//        Path dataFile = Paths.get(directory, filename);
//
//        if (Files.notExists(dataDirectory)) {
//            Files.createDirectories(dataDirectory);
//        }
//
//        if (! Files.exists(dataFile)) {
//            Files.createFile(dataFile);
//        }
//
//        ArrayList<String> chores = new ArrayList<>();
//        chores.add("Chop down dead tree branches");
//        chores.add("Have a bonfire");
//        chores.add("Put ashes in compost heap");
//        chores.add("Turn compost");
//
//
//        //having append here adds to our file instead of overriding it
//        Files.write(dataFile, chores, StandardOpenOption.APPEND);
//    }

//    public static void readAllChores() {
//        String directory = "data";
//        String filename = "info.txt";
//        Path dataDirectory = Paths.get(directory);
//        Path dataFile = Paths.get(directory, filename);
//        List<String> chores;
//
//        try {
//            chores = Files.readAllLines(dataFile);
//            //enhanced for loop to iterate our list of strings
//            for(String chore : chores) {
//                System.out.println(chore);
//            }
//        } catch(IOException e) {
//            System.out.println(e.getMessage());
//        }
    }


//    Example
//
//    Using a relative path to create a directory and file if they do not yet exist.
//    data/info.txt

//public static void writeTestFile() throws IOException {
//    String directory = "data";
//    String filename = "info.txt";
//    Path dataDirectory = Paths.get(directory);
//    Path dataFile = Paths.get(directory, filename);
//    if (Files.notExists(dataDirectory)) {
//        Files.createDirectories(dataDirectory);
//    }
//    if (! Files.exists(dataFile)) {
//        Files.createFile(dataFile);
//    }
//}
}
