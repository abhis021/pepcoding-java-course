import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // input - don't change this code
      Scanner scn = new Scanner(System.in);
      int marks = scn.nextInt();
      // input - don't change this code
      scn.close();
      if (marks>90){
            System.out.println("Excellent");

        }
        else if(marks > 80 && marks <=90)
        {
            System.out.println("Good");
        }
        else if(marks >70 && marks <=80)
        {
            System.out.println("Fair");

        }
        else if(marks >60 && marks <=70)
        {
            System.out.println("Meets Expectations");

        }
        else if(marks <=60)
        {
            System.out.println("Below Par");

        }

      // code here      
      }
  
   }