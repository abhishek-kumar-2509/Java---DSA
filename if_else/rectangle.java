/*Q.  Take length and breadth of rectangle as input and
write a program to find weather the area of rectangle
is greater than its perimeter. */

/*Q2. Given a point (x,y) write a program to find out
 if it lies in the 1st Quadrant, 2nd Quadrant, 3rd Quardrant,
 4th Quadrant, on the x-axis, y-axis or at the origin. */

package if_else;
import java.util.*;
public class rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int length = sc.nextInt();
        System.out.print("Enter Breadth: ");
        int breadth = sc.nextInt();

        int area = length*breadth;
        int perimeter = 2*(length+breadth);

        if (area > perimeter)
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}
