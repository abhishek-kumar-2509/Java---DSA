/*Take 3 positive integer input and print the greatest of them. */

package if_else;
import java.util.*;
public class greatest_Num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three num: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>=b && a>=c)
            System.out.println("Greatest is a "+a);
        else if(b>=c && b>=a)
            System.out.println("Greatest is b "+b);
        else if(c>=a && c>=b)
            System.out.println("Greatest is c "+c);
        else 
            System.out.println(" ");
        sc.close();
    }
}
