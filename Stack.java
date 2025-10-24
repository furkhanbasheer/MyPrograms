import java.util.Stack;
public class Stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements into the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // Print the current stack
        System.out.println("Stack: " + stack);

        // Peek the top element
        System.out.println("Top Element (peek): " + stack.peek());

        // Pop the top element
        System.out.println("Popped Element: " + stack.pop());

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Print the final stack
        System.out.println("Final Stack: " + stack);
    }
}
