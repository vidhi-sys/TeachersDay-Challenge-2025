import java.util.Scanner;

public class HQ9_plus{
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String s = sc.nextLine();
          if(s.contains("H")||s.contains("Q")||s.contains("9")|s.contains("+")){
            System.out.println("YES");
          }
          else{
            System.out.println("NO");
          }
        
    }
}