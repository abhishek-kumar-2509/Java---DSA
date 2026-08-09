// Count digits of a number
package while_Loop;
import java.util.*;
public class countDigit {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n =sc.nextInt();

        if(n==0) n = 1;
        int count=0;
        while(n != 0){
            n/=10;
            count++;
        }
        System.out.print(count+" ");

        sc.close();
    }
}
