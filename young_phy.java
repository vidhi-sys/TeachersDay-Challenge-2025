import java.util.*;
public class young_phy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum+=scanner.nextInt();

            }

        }
        if(sum==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
