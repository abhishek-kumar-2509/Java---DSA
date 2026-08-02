package if_else;
import java.util.*;
public class divisibleBy5{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%5==0){
            System.out.println("Divisible by 5");
        }
        else{
            System.out.println("Not Divisible by 5");
        }
        sc.close();
    }
}

