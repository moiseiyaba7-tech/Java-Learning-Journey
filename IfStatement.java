import java.util.Scanner;
public class IfStatement {
  public static void main(String[] args){
    Scanner myscan= new Scanner(System.in);

    System.out.println("Enter your age ");
    int age= myscan.nextInt(); 
    System.out.print("How long was your experience? ");
        int years= myscan.nextInt();

    if(age>=18){
      System.out.println("You are an adult");
    }
    else{
      System.out.println("You must be 18 years old or above");
    }

   if(years>=30){
    System.out.println("you are eligible");
   }
   else{
    System.out.println("You are not eligible");
   }
    

    
      
  }
}