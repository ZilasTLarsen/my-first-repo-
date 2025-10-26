import java.util.Scanner;

public abstract class Menu {
    // Value used to exit the menu. Default = 0
    protected int EXIT_OPTION = 0;

    private String header;
    private String[] menuItems;
    private Scanner scanner = new Scanner(System.in);

    // Constructor
    public Menu(String header, String... menuItems) {
        this.header = header;
        this.menuItems = menuItems;
    }

    // Abstract method to be implemented by subclasses
    protected abstract void doAction(int option);

    // Runs the menu
    public void run() {
        boolean done = false;
        while (!done) {
            clear();
            showMenu();
            int option = getOption();
            doAction(option);
            if (option == EXIT_OPTION) {
                done = true;
            }
        }
    }

    // Get a valid menu option from the user
    private int getOption() {
        int option = -1;
        while (true) {
            System.out.print("Select option: ");
            String input = scanner.nextLine();

            try {
                option = Integer.parseInt(input);
                // Accept values 0 (EXIT_OPTION) through number of menu items
                if (option >= EXIT_OPTION && option <= menuItems.length) {
                    break;
                } else {
                    System.out.printf("Invalid option. Please choose a number between %d and %d.%n",
                            EXIT_OPTION, menuItems.length);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        return option;
    }

    // Print the menu
    private void showMenu() {
        System.out.println("\n==== " + header + " ====");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.printf("%d. %s%n", (i + 1), menuItems[i]);
        }
        System.out.printf("%d. Exit%n", EXIT_OPTION);
    }

    // Pause until user presses Enter
    protected void pause() {
        System.out.println("\nPress ENTER to continue...");
        scanner.nextLine();
    }

    // Clear screen (simulated by printing new lines)
    protected void clear() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }
}
