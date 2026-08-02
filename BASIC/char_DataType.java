import java.util.*;
public class char_DataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // char n = 'a';
        // System.out.println(n);
        // char x = 'k';
        // System.out.println(x);

        char ch = 'A';
        int x = ch;     //Implicit typecasting
        System.out.println(x);

        char py = 'a';
        int y = (int)py;        //Explicit typecasting
        System.out.println(y);

        char harsh = '3';
        System.out.println((int)harsh);

        char chh = 'k';
        System.out.println((int)chh);

        char chhh = 'c';
        System.out.println(chhh+0);

        /*Integer to character */

        int x1 = 70;
        char ch1 = (char)x1;
        System.out.println(ch1); 
        sc.close();
    }
}
