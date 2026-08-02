package LOOP;
import java.util.*;
public class table_Of_n {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(n + " X " + i + " = " + i*n + " ");
        }
        sc.close();
    }
}
