import java.util.Scanner;

public class CRUD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int choice;
        do {
            System.out.println("\n=== StringBuilder CRUD Operations ===");
            System.out.println("1. Create (append text)");
            System.out.println("2. Read (display text)");
            System.out.println("3. Update (insert / replace / setCharAt)");
            System.out.println("4. Delete (remove part of text)");
            System.out.println("5. Reverse");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter text to append: ");
                    String text = sc.nextLine();
                    sb.append(text);
                    System.out.println("String after append: " + sb);
                    break;

                case 2:
                    System.out.println("Current text: " + sb);
                    if (sb.length() > 0) {
                        System.out.print("Enter index to view character: ");
                        int index = sc.nextInt();
                        if (index >= 0 && index < sb.length()) {
                            System.out.println("Character at index " + index + ": " + sb.charAt(index));
                        } else {
                            System.out.println("Invalid index!");
                        }
                    }
                    break;

                case 3:
                    System.out.println("1. Insert");
                    System.out.println("2. Replace");
                    System.out.println("3. setCharAt");
                    System.out.print("Choose update type: ");
                    int type = sc.nextInt();
                    sc.nextLine();

                    if (type == 1) {
                        System.out.print("Enter position to insert: ");
                        int pos = sc.nextInt(); sc.nextLine();
                        System.out.print("Enter text to insert: ");
                        String ins = sc.nextLine();
                        if (pos >= 0 && pos <= sb.length()) {
                            sb.insert(pos, ins);
                            System.out.println("After insert: " + sb);
                        } else System.out.println("Invalid position!");

                    } else if (type == 2) {
                        System.out.print("Enter start index: ");
                        int start = sc.nextInt();
                        System.out.print("Enter end index: ");
                        int end = sc.nextInt(); sc.nextLine();
                        System.out.print("Enter new text: ");
                        String rep = sc.nextLine();
                        if (start >= 0 && end <= sb.length() && start < end) {
                            sb.replace(start, end, rep);
                            System.out.println("After replace: " + sb);
                        } else System.out.println("Invalid range!");

                    } else if (type == 3) {
                        System.out.print("Enter index: ");
                        int pos = sc.nextInt(); sc.nextLine();
                        System.out.print("Enter new character: ");
                        char ch = sc.next().charAt(0);
                        if (pos >= 0 && pos < sb.length()) {
                            sb.setCharAt(pos, ch);
                            System.out.println("After setCharAt: " + sb);
                        } else System.out.println("Invalid index!");
                    }
                    break;

                case 4:
                    System.out.print("Enter start index to delete: ");
                    int start = sc.nextInt();
                    System.out.print("Enter end index: ");
                    int end = sc.nextInt();
                    if (start >= 0 && end <= sb.length() && start < end) {
                        sb.delete(start, end);
                        System.out.println("After delete: " + sb);
                    } else System.out.println("Invalid range!");
                    break;

                case 5:
                    sb.reverse();
                    System.out.println("After reverse: " + sb);
                    sb.reverse(); // restore original
                    break;

                case 6:
                    System.out.println("Exiting... Bye macha ");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);

        sc.close();
    }
}
