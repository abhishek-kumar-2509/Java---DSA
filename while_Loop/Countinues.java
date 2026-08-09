package while_Loop;
import java.util.Scanner;
public class Countinues {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i<=100; i++){
            if(i%2==1) continue;
            System.out.println("Good Morning");
            System.out.print(i+" ");
        }
        sc.close();
    }
}
