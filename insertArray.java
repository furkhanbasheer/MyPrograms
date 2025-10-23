import java.util.Scanner;
public class insertArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n + 1]; 
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int pos = 2; 
        int value = 26;
        System.out.println("Before Insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = value;
        n++;
        System.out.println("\nAfter Insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
