import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> mainMenu = new ArrayList<>(List.of("Login as Student", "Login as Librarian", "Login as Admin", "Register"));
    static ArrayList<String> studentMenu = new ArrayList<>(List.of("View available books", "Search book", "Borrow a Book", "View Borrowed Books", "Return a book", "Logout"));
    static ArrayList<String> LibrianMenu = new ArrayList<>(List.of("Add new Book", "Remove book", "View issued Books", "Issue a book to Student", "Receive returned Book", "Logout"));
    static ArrayList<String> adminMenu = new ArrayList<>(List.of("Manage Users", "Add new Librarian/Admin", "Logout"));
    public void mainMenu() {
        while (true) {
            printMenuOptions(mainMenu);
            System.out.print("Select option from the menu: ");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    login(1);
                    break;
                case 2:
                    login(2);
                    break;
                case 3:
                    login(3);
                    break;
                case 4:
                    register();
                    break;
                default:
                    System.out.println("Wrong choice");
            }


        }
    }

    private void register() {
        System.out.println("Registration successfully");
    }

    private static void login(int i) {
        System.out.println("Login successfully"+i);
    }

    public void printMenuOptions(ArrayList<String> mainMenu) {
        for (int i = 0; i < mainMenu.size(); i++) {
            System.out.println((i+1)+". "+mainMenu.get(i));
        }
    }
}
