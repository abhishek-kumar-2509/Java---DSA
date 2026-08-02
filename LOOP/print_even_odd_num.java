/*Print all even number from 1 to 100 */
/*print all odd  number from  1 to 100 */
/*Print all odd number divisible by 3 from 1 to 100 */

package LOOP;
import java.util.*;
public class print_even_odd_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        System.out.println("\n\nEven Number are : ");
        for(int i = 2; i<=100; i+=2){
            System.out.print(i + " ");
        }

        System.out.println("\n\nOdd Numbers Are : ");
        for(int i = 1; i<=100; i+=2){
            System.out.print(i+" ");
        }

        System.out.println("\n\nOdd Number Divisible by 3 are : ");
        for(int i = 1; i<=100; i++){
            if(i % 3 == 0) 
                System.out.print(i +" ");
        }
        sc.close();
    }
}
