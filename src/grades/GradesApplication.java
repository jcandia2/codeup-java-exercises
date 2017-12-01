package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        Input input = new Input();

        String userInput;
        boolean userResponse = true;
        boolean validUserName = true;
        int userOption;

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

        students.put("bobsUserName", student1);
        students.put("juliesUserName", student2);
        students.put("billsUserName", student3);


        showMenu(students);

        do {            //do while userResponse = y
            do {                //do while invalid userName entered
                System.out.println("What student would you like to see more information on? (enter \"all\" to view all students)");
                System.out.println();
                System.out.print(">");
                userInput = input.getString();
                if (students.containsKey(userInput)) {
                    displayStudentInfo(students, userInput);
                } else if (userInput.equalsIgnoreCase("all")) {
                    showAllStudents(students);
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
        System.out.println(students.get(userInput).getGrades());
//        students.get(userInput).getGrades();
        System.out.println("Current Average: " + students.get(userInput).getGradeAverage());
    }

    public static void showAllStudents(HashMap<String, Student> students) {
        for (String key : students.keySet()) {
            displayStudentInfo(students, key);
        }
        System.out.println();

    }
}
