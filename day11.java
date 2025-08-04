import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class day11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('o');
        vowels.add('y');
        vowels.add('e');
        vowels.add('u');
        vowels.add('i');
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (!vowels.contains(c)) {
                result.append('.');
                result.append(c);
            }
        }
        System.out.println(result.toString());
    }
}