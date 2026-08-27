import java.util.Scanner;
public class Scanner1 {
  public static void main(String[] args){
    Scanner Zescan= new Scanner(System.in);

    System.out.println("Enter your age ");
    int age=Zescan.nextInt(); Zescan.nextLine();

    System.out.println("What is your name");
    String name=Zescan.nextLine();
    
    System.out.println("What is your Country Name? ");
    String country= Zescan.nextLine();
    
    System.out.println("You are "+ age+ " years old");
    System.out.println("Hello "+ name);
    System.out.println("You are from " + country);
    }
}