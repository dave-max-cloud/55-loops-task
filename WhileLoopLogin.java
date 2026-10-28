import java.util.Scanner;
public class WhileLoopLogin{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int password = 0;
String name = " ";

do{

System.out.println("Enter your name");
name = input.nextLine();
System.out.println("Enter your password");
password = input.nextInt();
}

while(name != name && password != password);
}
}
