import java.util.*;
public class simple_Interast {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter Princple: ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter Time: ");
        double t = sc.nextDouble();

        double Si = (p*r*t)/100.0;
        System.out.println("Simple Interest: " + Si);
        System.out.println("Amount: " + (p+Si));
        sc.close();
    }
}
