/*Take a number input and print all of its factors */

package Break_Continue;
import java.util.*;
public class print_Factor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        for(int i = 1; i<= Math.sqrt(n); i++){
            if(n%i==0){
                System.out.print(i+" ");
                System.out.print(n/i+" ");
            }
        }
        sc.close();
    }
}
