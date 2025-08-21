import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int answer=0;
        for (int i=1;i<=n;i++){
            if(i%2==0){
                answer+=i;

            }
            else{
                 answer+=(-1*i);

            }
            
        

        }
System.out.println(answer);

    }
    
}
