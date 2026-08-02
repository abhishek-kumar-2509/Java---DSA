/*<Q>--> if cost price and selling price of an item is input
 through the keyboard, write a program to determine whether 
 the seller has maade profit or incurred loss or no prifit no 
 loss. Also determine how much profit he made or loss he incurred*/
package if_else;
import java.util.*;
public class profit_Loss {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter cost Price: ");
        double cp = sc.nextDouble();
        System.out.print("Enter Selling price: ");
        double sp = sc.nextDouble();

        if(cp > sp){
            System.out.println("Seller got Loss");
            System.out.println("Loss Amount: " + (cp-sp));
            System.out.println("Loss % : " + ((cp - sp) / cp) * 100);
        }
        
        else if(sp > cp) {
            System.out.println("Seller got Profit");
            System.out.println("Profit Amount: " + (sp-cp));
            System.out.println("Profit % : " + ((sp-cp)/cp)*100);
        }

        else {
            System.out.println("No profit No loss");
        }

        sc.close();
    }
}
