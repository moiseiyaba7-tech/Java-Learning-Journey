//2D array practice using a user input
//use case: bus seat booking system where the user can select a seat and the program will check if the seat is available or not
import java.util.Scanner;

public class Arrays2{
  public static void main(String[] args){
 Scanner scanner =  new Scanner(System.in);
 
  boolean[][] BusSeats= new boolean[5][4];

  System.out.println("Welcome to the booking System Page");
  System.out.println("Enter the row number(0-4): ");
  int row = scanner.nextInt();
  
  System.out.println("Enter the column number(0-3): ");
  int col = scanner.nextInt();
  System.out.println("--------Feedback--------");

 if(BusSeats[row][col]== true){
  System.out.println("This seat is already taken, please select another one !");
 } 
 else{
  System.out.println("This seat is available and has been booked for you ! ");
 }

  }
}