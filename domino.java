import java.util.*;

public class domino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] size = new int[2];
        for (int i = 0; i < 2; i++) {  
            size[i] = sc.nextInt();
        }
        int length = size[0];
        int breadth = size[1];
        int total_square = length * breadth;
        
        System.out.println(total_square / 2);
    }
}