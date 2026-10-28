import java.util.Scanner;
public class UserGrades{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int grade = 0;
do{
System.out.println("Enter a grade");
grade = input.nextInt();
}
while(grade != -1);
}
}

