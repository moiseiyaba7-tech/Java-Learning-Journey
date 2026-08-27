
import java.util.Scanner;

public class ForLoop1 {
  public static void main(String[] args) {
    Scanner myscan= new Scanner(System.in);
    
    System.out.println("Enter your number");
    int number= myscan.nextInt(); 
    for(int a=0; a<=number; a++){
       System.out.println(number);
    }
  }
}
