package epam;
import java.util.Scanner;
class Calculate extends SimpleCalculator
{
 public void formulate(double num1, double num2, char operator, Operators operators)
 {
  double output;
  try
  {
    switch(operator)
    {
     case '+':
  	output=operators.addition(num1,num2);
        break;
     case '-':
   	output=operators.subtraction(num1,num2);
        break;
     case '*':
        output=operators.multiplication(num1,num2);
        break;
     case '/':
        output=operators.division(num1,num2);
        break;
     default:
        System.out.printf("Enter only the mentioned operator");
        return;
    }
    System.out.println(num1+""+operator+""+num2+": "+output);

  } 
  catch (Exception e)
  {
   System.out.println("Enter arithematic operators only");
  }
 }
}
public class SimpleCalculator
{
 public static void main(String[] args)
 {
   Scanner scanner = new Scanner(System.in);
   double num1, num2;
   System.out.print("Enter first and second number:");
   num1 = scanner.nextDouble();
   num2 = scanner.nextDouble();
   System.out.print("Enter an operator (+, -, *, /): ");
   char operator = scanner.next().charAt(0);
   Operators operators=new Operators();
   operators.formulate(num1,num2,operator,operators);
 }
}