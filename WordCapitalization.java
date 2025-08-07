
import java.util.*;
public class WordCapitalization{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input=sc.nextLine();
        String answer=Character.toUpperCase(input.charAt(0))+ input.substring(1);
        System.out.println(answer); 
        sc.close();
        
    }

}