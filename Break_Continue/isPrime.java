/*WAP to chaeck if a given number is Prime or not. */

package Break_Continue;
import java.util.*;
public class isPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int x= 0 ;      //0 means prime
        // for(int i =2; i<=n-1; i++){
        //     if(n%i == 0){       //'1' to 'n' ka ek factor nikla
        //         x = 1;      // 1 means composite number
        //         break;
                
        //     }
        // }
        // if(x==1) System.out.println("Composite Number");
        // if(x==0) System.out.println("Prime Number");

        boolean flag = true; // true means prime
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) { // '1' to 'n' ka ek factor nikla
                flag = false; // false means composite number
                break;

            }
        }
        if(n==1) System.out.println("NEither Prime nor Composite");
        else if(flag == false)
            System.out.println("Composite Number");
        else 
            System.out.println("Prime Number");
        sc.close();
    }
}
