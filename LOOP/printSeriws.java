/*Print this series - 99, 95, 91, 87, .. upto all terms which are positive */

package LOOP;
import java.util.*;
public class printSeriws {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        // int n = sc.nextInt();
        // int a = 99; int d = 4;

        for(int a= 99; a>0; a-=4){
            System.out.print(a+", ");
            
        }
        sc.close();

    }
}
