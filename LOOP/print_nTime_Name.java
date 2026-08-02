/*print any name 'n' times. Take 'n' input from user */
/*Print number from 1 to 100 */

package LOOP;
import java.util.Scanner;
public class print_nTime_Name {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int i;
        for(i = 1; i<=n; i++){
            System.out.println("Abhishek " + i);
        }
        sc.close();
    }
}