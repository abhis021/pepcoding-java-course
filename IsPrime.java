import java.util.Scanner;

public class IsPrime{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of numbers: ");
        int t =s.nextInt();
        for(int k=1; k<=t; ++k)
        {
            int num = s.nextInt();
        s.close();

        boolean flag = false;

        for(int i=2; i<=num/2; ++i)
        {
            if(num%i==0)
            {
                flag = true;
                break;
            }
        }
        if(!flag)
            System.out.print(" prime");
        else
            System.out.print(" not prime");

        }
    }
}