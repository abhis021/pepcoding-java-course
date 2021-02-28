
import java.util.Scanner;

public class conditionals {
    
public static void main(String[] args) {
       int x;

       System.out.println("Enter value of x");
       Scanner xin = new Scanner(System.in);
       
       x =xin.nextInt();

       
       if(x%2 ==0)
       {
           System.out.println(x+" is even.");
           System.out.println("Smart work is better than Hard work "); 
       }
       else{
           System.out.println(x+ " is odd.");
           System.out.println("Hard work is better than smart work"); 
       }
       
    }
}
