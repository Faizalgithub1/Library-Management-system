package LibraryManagementsystem;
import java.util.Scanner;

public class lms { public static void main(String[] args) {
            Library library = new Library();
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;

            while (!exit) {
                System.out.println("\nLibrary Menu:");
                System.out.println("1. Add Book");
                System.out.println("2. Display Books");
                System.out.println("3. Search Book by Title");
                System.out.println("4. Remove Book by ISBN");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                int choice;
                // Check for integer input
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    scanner.nextLine(); // Clear the newline character
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and 5.");
                    scanner.nextLine(); // Clear the invalid input
                    continue;
                }

                switch (choice) {
                    case 1:
                        System.out.print("Enter title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter author: ");
                        String author = scanner.nextLine();
                        System.out.print("Enter ISBN: ");
                        String isbn = scanner.nextLine();
                        library.addBook(title, author, isbn);
                        break;

                    case 2:
                        library.displayBooks();
                        break;

                    case 3:
                        System.out.print("Enter title to search: ");
                        String searchTitle = scanner.nextLine();
                        library.searchByTitle(searchTitle);
                        break;

                    case 4:
                        System.out.print("Enter ISBN to remove: ");
                        String removeIsbn = scanner.nextLine();
                        library.removeByIsbn(removeIsbn);
                        break;

                    case 5:
                        System.out.println("Exiting the system. Goodbye!");
                        exit = true;
                        break;

                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                        break;
                }
            }

            scanner.close();
        }
    }