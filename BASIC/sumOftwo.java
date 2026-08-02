import java.util.*;
public class sumOftwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two Number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int Sum = a+b;
        System.out.println("Sum of Two number: " + Sum);
        sc.close();
    }
}
