import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks obtained: ");

        int studMarks = sc.nextInt();
        sc.close();

//LOGIC AREA
        if (studMarks>90){
            System.out.println("Excellent");

        }
        else if(studMarks > 80 && studMarks <=90)
        {
            System.out.println("Good");
        }
        else if(studMarks >70 && studMarks <=80)
        {
            System.out.println("Fair");

        }
        else if(studMarks >60 && studMarks <=70)
        {
            System.out.println("Meets Expectations");

        }
        else if(studMarks <=60)
        {
            System.out.println("Below Par");

        }







    }
    
}
