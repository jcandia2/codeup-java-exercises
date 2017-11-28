package movies;

import util.Input;

import java.lang.reflect.Array;

import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class MoviesApplication {

    public static String[] dramaCategories = {"animated", "drama", "horror", "scifi", "musical"};

    public static void main(String[] args) {


        Arrays.sort(dramaCategories);
        Movie[] allMovies = MoviesArray.findAll();
        int userChoice;
        Movie newMovie;

        do {

            userChoice = getUserChoice();
            displayMoviesSelected(allMovies, userChoice);

        } while (!(userChoice == 0));
    }

    public static void displayMoviesSelected(Movie[] allMovies, int userChoice) {
        switch (userChoice) {
            case 0:
                System.out.println("Ok, goodbye!");
                break;
            case 1:
                System.out.println("Here are all your movies");
                showAllMovies(allMovies);
                break;
            case 2:
                System.out.println("Here are the movies with the category of animated: ");
                showFilteredMovies(allMovies, "animated");
                break;
            case 3:
                System.out.println("Here are the movies with the category of drama: ");
                showFilteredMovies(allMovies, "drama");
                break;
            case 4:
                System.out.println("Here are the movies with the category of horror: ");
                showFilteredMovies(allMovies, "horror");
                break;
            case 5:
                System.out.println("Here are the movies with the category of scifi: ");
                showFilteredMovies(allMovies, "scifi");
                break;
            case 6:
                System.out.println("Here are the movies with the category of musical: ");
                showFilteredMovies(allMovies, "musical");
                break;
            case 7:

//                createNewMovie();
                break;
            default:
                System.out.println("something went wrong");
                break;
        }
    }

//    public static void createNewMovie() {
//        Input in = new Input();
//
//        System.out.println("Enter the movie name");
//        String movieName = in.getString();
//
//        String movieCategory;
//
//        System.out.println("What category is it?");
//        do {
//            System.out.println("Please enter animated, drama, horror, scifi or musical: ");
//            movieCategory = in.getString();
//        } while ((int Arrays.binarySearch(dramaCategories, movieCategory)) < 0);
//
//    }


    public static void showAllMovies(Movie[] movieArray) {
        for (Movie movie : movieArray) {
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }

    public static void showFilteredMovies(Movie[] movieArray, String category) {
        for (Movie movie : movieArray) {
            if (movie.getCategory().equals(category)) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static int getUserChoice() {
        Input in = new Input();

        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("6 - view movies in the musical category");
        System.out.println("7 - add a movie");
        System.out.println("Enter your choice: [0 thru 6] ");


        return in.getInt(0, 6);
    }
}
