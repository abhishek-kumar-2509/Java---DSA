//print sum of number and its reverse

package while_Loop;
import java.util.*;
public class sum_ReverseOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        int p=n;
        int sum =0;
        while(n>0){
            int dig = n % 10;
            sum = sum + dig;
            n/=10;
        }
        
        int rev = 0; 
        while(p>0){
            int dig = p %10;
            rev = rev *10 +dig;
            p/=10;
        }
        System.out.println("Sum of Digits : " + sum);
        System.out.println("Reverse of the number : " + rev);
        sc.close();
    }
}
