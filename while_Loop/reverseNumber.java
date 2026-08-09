package while_Loop;
import java.util.*;
public class reverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int rev = 0;
        int n=sc.nextInt();
        
        while(n>0){
            int dig = n%10;
            rev = rev*10+dig;
            n/=10;
        }
        System.out.println(rev);
        sc.close();
    }
}

