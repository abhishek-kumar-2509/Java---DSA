//'a' raise to the power 'b'

package while_Loop;
import java.util.Scanner;
public class a_To_Power_b {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 'a' : ");
        int a = sc.nextInt();
        System.out.print("Enter Number 'b' : ");
        int b = sc.nextInt();

        int pow = 1;
        for(int i =1; i<=b; i++){
            pow*=a;
        }
        System.out.println(a+" Raised to the Power " +b+" : " + pow);
        sc.close();
    }
}
