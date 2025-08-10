import java.util.*;
public class bit_plus_plus {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        CharSequence plus="++";
        CharSequence minus="--";
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            if(s.contains(plus)){
                x=+1;

            }
            else if(s.contains(minus)){
                x=-1;

            }

        }
        System.out.println(x);
        
    }
    
}
