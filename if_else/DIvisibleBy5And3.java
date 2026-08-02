/*Q1. Take positive integer input and tell if it is divisibele by 5 or 3. */

/*Q2. Take positive integer input and print:
Riya if number is divisible by 5
Renu if number is divisible by 3
Ayush if number is divisible by 5 and 3 both
Isha if number is not divisible by 5 and 3 */
package if_else;
import java.util.*;
public class DIvisibleBy5And3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        // if(n%5==0 || n%3==0){
        //     System.out.println("Divisible by 5 and 3");
        // }
        // else
        //     System.out.println("Not Divisible by 5 and 3");


        if(n%5==0 && n % 3 == 0){ 
            System.out.println("Ayush");
        }
        else if(n % 5 == 0){
            System.out.println("Riya");
        }
        else if(n%3==0){
            System.out.println("Renu");
        }
        else
            System.out.println("Isha");

        sc.close();
    }
}
