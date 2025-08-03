import java.util.*;
public class waylong{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    HashSet<String> set= new HashSet<>();
    for(int i=0;i<n+1;i++){
        set.add(sc.nextLine());  
    }
    for(String s:set){
       
        if(s.length()>10){
            
            String output=Character.toString(s.charAt(0))+Character.toString((s.length()-2))+
            Character.toString(s.charAt(s.length()-1));
            System.out.println(output);
        }
        else{
            System.out.println(s);
        }
    }
    

sc.close();

}
}
