package librarySystem.com; 
import java.sql.*;
import java.util.Scanner;

public class LibrarySystem {
    private static final String URL = "jdbc:mysql://localhost:3306/college_db"; 
    private static final String USER = "root";  // Change if needed 
    private static final String PASSWORD ="furkhan@2911";  // Change if needed 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        do {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add a Book");
            System.out.println("2. View Books");
            System.out.println("3. Borrow a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            String input = scanner.nextLine(); // Read input as String

            try {
                choice = Integer.parseInt(input); // Convert string to integer
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                choice = -1; // wrong input - continue loop
                continue;
            }

            switch (choice) {
                case 1 -> addBook(scanner);
                case 2 -> viewBooks();
                case 3 -> borrowBook(scanner);
                case 4 -> returnBook(scanner);
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    // Method to add a book
    private static void addBook(Scanner scanner) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {

            System.out.print("Enter book title: ");
            String title = scanner.nextLine();
            System.out.print("Enter author name: ");
            String author = scanner.nextLine();

            String query = "INSERT INTO books (title, author) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, title);
            stmt.setString(2, author);
            stmt.executeUpdate();

            System.out.println("Book added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to view books
    private static void viewBooks() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM books")) {

            System.out.println("\nAvailable Books:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Title: " +
                        rs.getString("title") + ", Author: " + rs.getString("author") +
                        ", Available: " + rs.getBoolean("available"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to borrow a book
    private static void borrowBook(Scanner scanner) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {

            System.out.print("Enter book ID to borrow: ");
            int bookId = scanner.nextInt();
            scanner.nextLine();  // Consume the leftover newline character

            String checkQuery = "SELECT available FROM books WHERE id = ?";
            PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
            checkStmt.setInt(1, bookId);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next() && rs.getBoolean("available")) {
                String updateQuery = "UPDATE books SET available = FALSE WHERE id = ?";
                PreparedStatement updateStmt = conn.prepareStatement(updateQuery);
                updateStmt.setInt(1, bookId);
                updateStmt.executeUpdate();

                System.out.println("Book borrowed successfully!");
            } else {
                System.out.println("Book is not available.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to return a book
    private static void returnBook(Scanner scanner) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {

            System.out.print("Enter book ID to return: ");
            int bookId = scanner.nextInt();
            scanner.nextLine(); // Consume the leftover newline character

            String updateQuery = "UPDATE books SET available = TRUE WHERE id = ?";
            PreparedStatement updateStmt = conn.prepareStatement(updateQuery);
            updateStmt.setInt(1, bookId);
            int rowsUpdated = updateStmt.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Book returned successfully!");
            } else {
                System.out.println("Invalid book ID.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
