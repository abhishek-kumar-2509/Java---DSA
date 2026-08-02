/*Take integer input and tell if its 
magnitude is smaller than 69 or not. */

package if_else;
import java.util.*;
public class Magnitude {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
    
        if(n>0 && n<69)
            System.out.println("");
        sc.close();
    }
}
