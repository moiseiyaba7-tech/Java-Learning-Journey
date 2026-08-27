import java.util.Scanner;

public class StringMethods {
  public static void main(String [] args){
  Scanner scanner =new Scanner(System.in);
    String correctNumber = "1234";
    String correctPassword = "Moise";
  
  System.out.println("Enter Your number");
   String number = scanner.nextLine(); 
   
   System.out.println("Enter Your password");
  String password = scanner.nextLine();
  
  boolean isNumberCorrect = number.equals(correctNumber);
  boolean isPasswordCorrect = password.equals(correctPassword);

  if(isNumberCorrect && isPasswordCorrect){
    System.out.println("Access Granted! You've Successfully Logged In.");
  }
  else{
        System.out.println("Incorrect Number or Password, Please try again.");

  }

}
}
