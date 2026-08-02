package if_else;
import java.util.*;
public class valid_Triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st side: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd side: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd side: ");
        int c = sc.nextInt();

        if(a+b>c && b+c >a && a+c >b){
            System.out.println("Valid Triangle");
        }
        else
            System.out.println("Invalid Triangle");

        sc.close();
    }
}
