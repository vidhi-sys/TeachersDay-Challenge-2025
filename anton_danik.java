import java.util.*;
public class anton_danik {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int games=sc.nextInt();
        String won=sc.nextLine();
        int counta=0;
        int countd=0;
        for(int i=1;i<games;i++){
            if(won.charAt(i)=='A'){
                counta++;
            }
            else if(won.charAt(i)=='D'){
                countd++;
            }

        }
        if (counta>countd){
            System.out.println("Anton");
        }
        else if (countd>counta){
            System.out.println("Danik" );
        }
        else if (countd==counta){
            System.out.println("Friendship" );
        }
        
    }
}
