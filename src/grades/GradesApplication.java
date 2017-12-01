package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        Input input = new Input();
        String userInput;
        boolean userResponse = true;
        boolean validUserName = true;

        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Bob");
        student1.addGrade(90);
        student1.addGrade(95);
        student1.addGrade(100);

        Student student2 = new Student("Julie");
        student2.addGrade(80);
        student2.addGrade(90);
        student2.addGrade(100);

        Student student3 = new Student("Bill");
        student3.addGrade(75);
        student3.addGrade(70);
        student3.addGrade(90);

        System.out.println("The average for " + student1.getName() + " is " + student1.getGradeAverage());
        System.out.println("The average for " + student2.getName() + " is " + student2.getGradeAverage());
        System.out.println("The average for " + student3.getName() + " is " + student3.getGradeAverage());

        students.put("bobsUserName", student1);
        students.put("juliesUserName", student2);
        students.put("billsUserName", student3);


        showMainMenu();
        showMenu(students);

        do {
            do {
                System.out.println("What student would you like to see more information on?");
                System.out.println();
                System.out.print(">");
                userInput = input.getString();
                if (students.containsKey(userInput)) {
                    displayStudentInfo(students, userInput);
                } else {
                    System.out.println("Sorry, no student found with the github username of " + userInput);
                    System.out.println();
                    validUserName = false;
                }
                System.out.println("Would you like to see another student?");
                System.out.println();
                System.out.print(">");
                userResponse = input.yesNo();
                input.getString();
            } while (!validUserName && userResponse);
        } while (userResponse);

        System.out.println("Ok bye!");
    }


    public static void showMainMenu() {
        System.out.println("Welcome!");
        System.out.println();
        System.out.println("Please make your selection: [1 or 2]");
        System.out.println("1. To view a student's information.");
        System.out.println("2. To display all students.");
    }
    public static void showMenu(HashMap<String, Student> students) {
        System.out.println("Here are the github usernames of our students:");
        System.out.println();

        for (String key : students.keySet()) {
            System.out.print("|" + key + "|  ");
        }
        System.out.println();
        System.out.println();
    }

    public static void displayStudentInfo(HashMap<String, Student> students, String userInput) {
        System.out.println();
        System.out.println("Student Name: " + students.get(userInput).getName() + " - Github Username: " + userInput);
        System.out.print("Grades: ");
        students.get(userInput).getGrades();
        System.out.println("Current Average: " + students.get(userInput).getGradeAverage());
        System.out.println();
    }
}
