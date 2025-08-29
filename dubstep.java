import java.util.Scanner;

public class dubstep {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String song=sc.nextLine();
        song=song.toUpperCase();
        song=song.replace("WUB", " ");
        System.out.println(song);
        
        
    }
    
}
