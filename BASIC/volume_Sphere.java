import java.util.*;
public class volume_Sphere {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        double radius = 5;
        double volume = (4.0/3.0)*3.14*radius*radius*radius;
        System.out.println(volume);
        sc.close();
    }
}
