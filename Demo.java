package calculatorJava;
import java.util.Scanner;

public class Demo {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter first number:");
    int firstNumber = sc.nextInt();
    
    System.out.print("Enter second number:");
    int secondNumber = sc.nextInt();
    
    float result;
    System.out.print("Enter your choice:");
    
    /*
       You have to select from the numbers 1 , 2, ,3 ,4 ,5
     * 1 - Addition
     * 2 - Subtraction
     * 3 - Multiplication
     * 4 - Division
     * 5 - Modulus 
     * else for any others input, the process will be terminated.
     * */
    
     int choice = sc.nextInt(); 
    
     switch ( choice )
    {
      case 1 : System.out.println("The sum of the numbers is: ");
               result = firstNumber + secondNumber;
               System.out.println(result);
      
      break;
      
      case 2 : System.out.println("The difference of the numbers is: ");
               result = firstNumber - secondNumber;
               System.out.println(result);
      
      break;
      
      case 3 : System.out.println("The prodcut of the numbers is: ");
               result = firstNumber * secondNumber;
               System.out.println(result);
      
      break;
      
      case 4 : System.out.println("The quotient of the numbers is: ");
               result = firstNumber / secondNumber;
               System.out.println(result);
      
      break;
     
      case 5 : System.out.println("The remainder of the numbers is: ");
               result = firstNumber % secondNumber;
               System.out.println(result);
     
      break;
      
      default : System.out.println("Input Invalid so the process is terminated.");
    }
  }
}
