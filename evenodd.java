import java.util.*;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        
        // Separate odd and even numbers
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                oddNumbers.add(i);
            } else {
                evenNumbers.add(i);
            }
        }
        
        // Combine lists: odd numbers first, then even numbers
        List<Integer> combined = new ArrayList<>();
        combined.addAll(oddNumbers);
        combined.addAll(evenNumbers);
        
        // Print the k-th element (1-indexed)
        System.out.println(combined.get(k - 1));
    }
}