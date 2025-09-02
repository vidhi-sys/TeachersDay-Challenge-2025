import java.util.*;

public class gukiz_contest {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n=sc.nextInt();
                int [] ratings =new int [n];
                for(int i=0;i<n;i++){
                    ratings[i]=sc.nextInt();
                }
                Arrays.sort(ratings);
                String newstr=Arrays.toString(ratings);
                StringBuilder ans= new StringBuilder(newstr);
                ans=ans.reverse();
                String final_ans=ans.toString().replace('[',' ');
                final_ans=final_ans.replace(']',' ');
                System.out.println((final_ans));

    
    }
    
}
