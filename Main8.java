import java.util.Scanner;
public class Main8 {
  public static void main(String[] args){

  //displaying a user sentence multiple times
  Scanner scan1= new Scanner(System.in);
  System.out.println("Enter your Sentence");
  String sentence = scan1.nextLine();
   
  for(int i=1; i<=300;i++){
    System.out.println(i+". "+sentence);
  }
  }
}
