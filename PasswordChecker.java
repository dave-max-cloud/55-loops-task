import java.util.Scanner;
public class PasswordChecker{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

String target = "David";
while(true){
System.out.println("Enter your password:");
String password = input.nextLine();

if(password != target){
  System.out.print("Incorrect password,try again:");
  }
else{
  break;
  }
  }
  }
  }

