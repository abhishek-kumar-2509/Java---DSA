/*Q  Take 'n' as input from user and print the following sequence...
    1, n, 2, n-1, 3, n-2, .... */

package LOOP;
import java.util.Scanner;
public class print_Sequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.print(i +" "+ (n-1)+" ");
        }
        sc.close();
    }
}
