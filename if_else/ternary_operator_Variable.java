package if_else;
import java.util.Scanner;
public class ternary_operator_Variable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int abhi = (n>=0) ? 100 : 0;
        System.out.println(abhi);

        sc.close();
    }
}
