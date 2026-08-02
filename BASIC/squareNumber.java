import java.util.*;
public class squareNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        // int result = a*a;
        // System.out.println(result);

        System.out.println((int)Math.pow(a, 2));

        sc.close();

    }
}
