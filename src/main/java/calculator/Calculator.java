package calculator;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.InputMismatchException;
import java.math.BigInteger;


public class Calculator
{

    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {
    }


    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double num1, num2;

        while(true)
        {
            System.out.println("-------------calculator----------------------");
            System.out.println("select the operation");
            System.out.println("Calculator-DevOps, Choose to perform operation");
            System.out.print("Press 1 to Square root\nPress 2 to find Factorial\nPress 3 to find power\nPress 4 to find natural logarithm\n" +
                    "Press 5 to exit\nEnter your choice: ");
            int option;
            try {
                option = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (option)
            {
                case 1:
                    System.out.print("Enter number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Square root of "+num1+" is : " + calculator.squareroot(num1));
                    System.out.println("\n");
                    break;

                case 2:
                    System.out.print("Enter a number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Factorial of "+num1+" is : " + calculator.factorial(num1));
                    System.out.println("\n");
                    break;

                case 3:
                    System.out.print("Enter the first number : ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    num2 = scanner.nextDouble();
                    System.out.println(num1+ " power "+num2+" is : " + calculator.power(num1, num2));
                    System.out.println("\n");
                    break;

                case 4:
                    System.out.print("Enter a number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("log of "+num1+" is : " + calculator.logrithm(num1));
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            } //close switch

        }//close while
    }//close main

//    public BigInteger factorial(double num1) {
//        logger.info("[FACTORIAL] - " + num1);
//        BigInteger result = fact(num1);
//        logger.info("[RESULT - FACTORIAL] - " + result);
//        return result;
//    }
//
//    static BigInteger fact(double num1)
//    {
//
//        BigInteger f = new BigInteger("1");
//        for (int i = 2; i <= num1; i++)
//            f = f.multiply(BigInteger.valueOf(i));
//
//        return f;
//    }

    public double factorial(double number1) {
        logger.info("[FACTORIAL] - " + number1);
        double result = fact(number1);
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }
    public double fact(double num) {
        double f = 1;
        for(int i = 1; i <= num; ++i)
        { f *= i;   }
        return  f;
    }










    public double squareroot(double num1) {
        logger.info("[SQ ROOT] - " + num1);
        double result = Math.sqrt(num1);
        logger.info("[RESULT - SQ ROOT] - " + result);
        return result;
    }

    public double power(double num1, double num2) {
        logger.info("[POWER - " + num1 + " RAISED TO] " + num2);
        double result = Math.pow(num1,num2);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }

    public double logrithm(double num1) {
        logger.info("[NATURAL LOG] - " + num1);
        double result = 0;
        try {

            if (num1 <0 ) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {
                result = Math.log(num1);
            }
        } catch (ArithmeticException error) {
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }

}
