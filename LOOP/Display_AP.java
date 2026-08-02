/*Display this AP - 2,5,8,11,..... upto 'n' terms. */

package LOOP;
import java.util.*;
public class Display_AP {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        // for(int i = 2; i<=3*n-1; i+=3){         /*An = a+(n-1)d  => 2+(n-1)3 => 2+3n-3 => 3n-1 */
        //     System.out.print(i+", ");
        // }

        int a = 4; int d = 6;
        for(int i = 1; i<=n; i++){
            System.out.print(a + ", ");
            a+=d;
        }
        sc.close();
    }
}
