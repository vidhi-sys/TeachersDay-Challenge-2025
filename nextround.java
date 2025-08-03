import java.util.*;

public class nextround {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []num=new int[2];
        for(int i=0;i<2;i++){
         num[i]= sc.nextInt();

        }
        int k=num[1];
        int n=num[0];
        int []a=new int[n];
        for(int i=0;i<n;i++){
           a[i]= sc.nextInt();
        }
        int target=a[k];
        int count=0;
        Arrays.sort(a);
        for(int i=1;i<n;i++){
            if(a[i]>=target&&a[i]>0){
                count+=1;
            }
         

        }

     System.out.println(count);  
    }
    
}
