import java.util.*;
public class drinks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[]percent=new int[n];
        float sum=0;
        for(int i=0;i<n;i++){
            percent[i]=sc.nextInt();
            sum+=percent[i];

        }
        float total_volume=sum/n;


        System.out.println(total_volume);
    }
}
