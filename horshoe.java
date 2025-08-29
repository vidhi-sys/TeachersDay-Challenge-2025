import java.util.HashSet;
import java.util.*;

public class horshoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] shoes=new int[4];
        for(int i=0;i<4;i++){
            shoes[i]=sc.nextInt();

        }
        
        HashSet<Integer>set=new HashSet<>();
           for(int i=0;i<4;i++){
            set.add(shoes[i]);
        }
        System.out.println(Math.abs(set.size()-4));

        
    }
    
}
