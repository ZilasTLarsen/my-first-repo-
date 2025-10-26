import BE.Person;
import BE.Student;
import BE.Teacher;
import bll.PersonManager;

public class PersonMenu extends Menu {
    private PersonManager manager;

    public PersonMenu(PersonManager manager) {
        super("BE.Person Management Menu",
                "Show all persons",
                "Show all students",
                "Show all teachers");
        this.manager = manager;
    }

    @Override
    protected void doAction(int option) {
        switch (option) {
            case 1:
                System.out.println("\n--- All Persons ---");
                for (Person p : manager.getAllPersons()) {
                    System.out.println(p);
                }
                pause();
                break;

            case 2:
                System.out.println("\n--- All Students ---");
                for (Student s : manager.getAllStudents()) {
                    System.out.println(s);
                }
                pause();
                break;

            case 3:
                System.out.println("\n--- All Teachers ---");
                for (Teacher t : manager.getAllTeachers()) {
                    System.out.println(t);
                }
                pause();
                break;

            case 0:
                System.out.println("\nReturning to Main Menu...");
                break;

            default:
                System.out.println("\nInvalid option. Try again.");
                pause();
        }
    }
}
