//print sum of digits of a number

package while_Loop;
import java.util.*;
public class sum_of_digit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int sum = 0;
            /* for loop*/
        // for(int i = 0; i<n; n/=10){
        //     int dig = n % 10;
        //     sum = sum + dig;
        // }
        // System.out.println("Sum : " + sum);

        /*while loop */
        while(n!=0){
            sum+=(n%10);
            n/=10;
        }
        System.out.println((sum>0) ? sum : -sum);

        sc.close();
    }
}
