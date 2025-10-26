import BE.Student;
import BE.Teacher;
import bll.PersonManager;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Create a bll.PersonManager to hold all persons
        PersonManager manager = new PersonManager();

        //  Add sample Teachers
        Teacher t1 = new Teacher(100, "Hans Nielsen", "hni@easv.dk",
                "hni", Arrays.asList("Math", "Physics"));
        Teacher t2 = new Teacher(202, "Bent H. Pedersen", "bhp@easv.dk",
                "bhp", Arrays.asList("Programming", "Database"));

        //  Add a sample BE.Student
        Student s1 = new Student(105, "Bo Ibsen", "bib@easv.dk", "Computer Science");
        s1.addGrade("Programming", 10);
        s1.addGrade("Math", 7);
        s1.addGrade("Database", 8);

        // Register persons in the manager
        manager.addPerson(t1);
        manager.addPerson(t2);
        manager.addPerson(s1);

        // Start the Main Menu
        MainMenu mainMenu = new MainMenu(manager);
        mainMenu.run();

        // Optional: print a farewell message when program exits
        System.out.println("\nThank you for using the SchoolProject system!");
    }
}
