import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<String> mainMenu = new ArrayList<>(List.of("Login as Student", "Login as Librarian", "Login as Admin", "Register"));
    static ArrayList<String> studentMenu = new ArrayList<>(List.of("View available books", "Search book", "Borrow a Book", "View Borrowed Books", "Return a book", "Logout"));
    static ArrayList<String> LibrianMenu = new ArrayList<>(List.of("Add new Book", "Remove book", "View issued Books", "Issue a book to Student", "Receive returned Book", "Logout"));
    static ArrayList<String> adminMenu = new ArrayList<>(List.of("Manage Users", "Add new Librarian/Admin", "Logout"));

    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        mainMenu();

    }

    public static void mainMenu() {
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

    private static void register() {
        System.out.println("Registration successfully");
    }

    private static void login(int i) {
        System.out.println("Login successfully"+i);
    }

    public static void printMenuOptions(ArrayList<String> mainMenu) {
        for (int i = 0; i < mainMenu.size(); i++) {
            System.out.println((i+1)+". "+mainMenu.get(i));
        }
    }
}

//Main Menu:
//        1.	Login as Student
//o	Prompt for a membership ID and password.
//o	If the credentials are correct, proceed to the Member Menu.
//o	If the credentials are incorrect, return to the Main Menu.
//        2.	Login as Librarian
//o	Prompt for a librarian ID and password.
//o	If the credentials are correct, proceed to the Librarian Menu.
//o	If the credentials are incorrect, return to the Main Menu.
//        3.	Login as Admin
//o	Prompt for an admin ID and password.
//o	If the credentials are correct, proceed to the Admin Menu.
//o	If the credentials are incorrect, return to the Main Menu.
//        4.	Register
//o	Prompt for a name, user ID, password, and user type (Member, Librarian, or Admin).
//o	Register the new user with the provided details.
//o	Return to the Main Menu.
//        5.	Exit
//o	Close the application.
