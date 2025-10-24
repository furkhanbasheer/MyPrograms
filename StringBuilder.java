public class StringBuilder {
    public static void main(String[] args) {
        // Create 
        StringBuilder sb = new StringBuilder("Hello");

        // 1. append() 
        sb.append(" World");
        System.out.println("After append: " + sb);

        // 2. insert() 
        sb.insert(5, ", Java");
        System.out.println("After insert: " + sb);

        // 3. delete() 
        sb.delete(5, 11); // Removes ", Java"
        System.out.println("After delete: " + sb);

        // 4. reverse() 
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 5. charAt() 
        char ch = sb.charAt(2);
        System.out.println("Character at index 2: " + ch);

        // 6. setCharAt() 
        sb.setCharAt(2, 'X');
        System.out.println("After setCharAt: " + sb);

        // 7. replace() 
        sb.replace(0, 5, "Hey");
        System.out.println("After replace: " + sb);
    }
}
