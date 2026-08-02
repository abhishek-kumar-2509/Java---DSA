package if_else;
import java.util.*;
public class real_num {
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter a real number: ");
    double n = sc.nextDouble();
    int x = (int)n;
    if(n-x == 0) System.out.println("An integer");
    else System.out.println("Not an integer");
    sc.close();
  }  
}
