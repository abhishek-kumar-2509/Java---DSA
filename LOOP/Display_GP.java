/*Display this GP - 1, 2,4,8,... upto 'n'term. */

package LOOP;
import java.util.*;
public class Display_GP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of term: ");
        int n = sc.nextInt();
        int a = 1; int r = 2;
        for(int i = 1; i<=n; i++){
            System.out.print(a+" ");
            a*=r;
        }
        sc.close();
    }
}
