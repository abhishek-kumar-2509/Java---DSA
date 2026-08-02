import java.util.*;
public class algebra {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        //(A+B)^2 = A^2 + B^2 + 2A*B

        int result = (A + B) * (A + B);
        System.out.println(result);

        sc.close();
    }
}
