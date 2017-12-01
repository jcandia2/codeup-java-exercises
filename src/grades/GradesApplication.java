package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

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

        students.put("bobsusername", student1);
        students.put("juliesusername", student2);
        students.put("billsusernaem", student3);





    }
}
