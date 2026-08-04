/*print all even numbers from 1 to 100*/

package Break_Continue;

public class print_EvenNum1To100 {
    public static void main(String[] args){
        for(int i = 1; i<=30; i++){
            System.out.println(i+ " ");
            if(i == 13) continue;      // Skip this iterations
            System.out.println("Good Morning");
        }
    }
}
