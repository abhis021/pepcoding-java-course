import java.util.Scanner;

public class RangePrime {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int low = s.nextInt();
        int high = s.nextInt();
        
        for(int num =low; num<=high; num++)
        {
            int count =0;

            for(int div =2; div *div <=num; div++){
                if(num%div==0){
                    count++;
                    break;
                }
            }

            if(count==0){
                System.out.println(num);

            }
            
        }
    }
}