import java.util.Scanner;

public class FirstNFibonacci {
    
    public static void main(String[] args) {
    
        int t1=0, t2=1, nextTerm = 0, n;
        System.out.print("Enter a positive number: ");
        Scanner s =  new Scanner(System.in);
        n = s.nextInt();
        s.close();

        System.out.print("Fibonacci Series: " +t1+", "+t2);
        nextTerm = t1+t2;

        while(nextTerm<=n){
            System.out.print(", "+nextTerm);
            t1=t2;
            t2=nextTerm;
            nextTerm = t1+t2;

            
        }
        
        }
        
    }
