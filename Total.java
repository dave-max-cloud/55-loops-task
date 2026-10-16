import java.util.Scanner;
  public class Total{
    public static void main(String[] args){

  Scanner input = new Scanner(System.in);
  int total = 0;
  int repeat = 1;
  while (repeat <= 5) {
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        
        total += number;
        
        repeat++;
        
        
      }
      System.out.println("Total is:" + total);
        
    }
  }
 
    


 // int total = 0;


