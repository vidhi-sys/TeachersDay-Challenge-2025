import java.util.*;

public class softdrinking{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       //no. of friends
       int k=sc.nextInt();
       //no. of soft drinks
       int l=sc.nextInt();
       //millilitres of drink
       int c=sc.nextInt();
       // c limes
       int d=sc.nextInt();
       //limes cut into d slices
       int p=sc.nextInt();
       //p grams of salt
       int nl=sc.nextInt();
       //nl millilitre of drink needed to make toast
       int np=sc.nextInt();
       //np grmas of salt for toast
    //drink for each person to make toast
    int drink_each=k*l/n;
    int lime_toeach=d*c/n;
    int salt_toeach=p/n;
    int answer=0;
    if(salt_toeach>np&&drink_each>nl&&lime_toeach>1){
    answer=Math.abs(np-nl);

    }
    System.out.println(answer);
    }
}