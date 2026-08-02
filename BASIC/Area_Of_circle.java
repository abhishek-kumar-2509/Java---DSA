import java.util.*;
public class Area_Of_circle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();
        // double radius = 3.8;
        double Area = 3.141592 * radius * radius;

        System.out.println(Area);
        sc.close();
    }
}