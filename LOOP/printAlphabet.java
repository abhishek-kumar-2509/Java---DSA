/*Print all alphabets with their corresponding ASCII Values.
    A   65, B  66*/

package LOOP;
// import java.util.*;
public class printAlphabet {
    public static void main(String[] args){
        // Scanner sc = new Scanner (System.in);
        for(int i = 'A'; i<='Z'; i++){
            System.out.println((char) i +" - " + i+" ");
        }

        System.out.println("LOWERCASE ALPHABET");
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.println((char) i + " - " + i + " ");
        }
    }   
}
