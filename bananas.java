import java.util.*;
public class bananas {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
         int cost= sc.nextInt();
         int total_money=0;
        int dollar = sc.nextInt(); 
        int banana = sc.nextInt();
        for(int i=1;i<=banana;i++){
            total_money+=i*cost;
        }
        System.out.println(Math.abs(total_money-dollar));
    
   } 
}
