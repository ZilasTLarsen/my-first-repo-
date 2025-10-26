import bll.PersonManager;

public class MainMenu extends Menu {
    private PersonManager manager;

    public MainMenu(PersonManager manager) {
        super("Main Menu",
                "BE.Person Management",
                "About the School Project");
        this.manager = manager;
        // EXIT_OPTION remains 0
    }

    @Override
    protected void doAction(int option) {
        switch (option) {
            case 1:
                PersonMenu personMenu = new PersonMenu(manager);
                personMenu.run();
                break;
            case 2:
                System.out.println("\nThis is the School Project console application.");
                pause();
                break;
            case 0:
                System.out.println("\nExiting application... Goodbye!");
                break;
            default:
                System.out.println("\nInvalid option. Try again.");
                pause();
        }
    }
}
