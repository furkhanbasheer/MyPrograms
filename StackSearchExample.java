import java.util.Stack;
public class StackSearchExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("Dates");
        System.out.println("Stack: " + stack);
        String searchElement = "Cherry";
        int position = stack.search(searchElement);
        if (position != -1) {
            System.out.println(searchElement + " found at position (from top): " + position);
        } else {
            System.out.println(searchElement + " not found in stack.");
        }
    }
}
