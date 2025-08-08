import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class boyorgirl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Set<Character> set = new HashSet<>();
        
        for (char c : input.toCharArray()) {
            set.add(c);
        }

        if (set.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
        
        sc.close();
    }
}