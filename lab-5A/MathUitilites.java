/**
 * @author Tamandeep Singh
 * @version lab5A-1.0
 */
public class MathUitilites{
    /**
     * public static method to find exponent of a number
     * @param base sets base 
     * @param exponent sets exponent
     * @return result
     */
    public static  int power(int base, int exponent ){
        int count = 1;
        int result = 1;
        while(count <= exponent){
            result = base * result;
            count++;
        }
        return result;
    }
    /**
     * public static method to calculates with char +,-,*,/,%
     * @param firstNumber sets firstNumber 
     * @param operator sets operator
     * @param secondNumber sets secondNumber
     */
    public static void calculator(double firstNumber, char operator, double secondNumber){
        
        switch(operator){
            case '+' : 
                System.out.println(firstNumber + " + " +  secondNumber + " = " + (firstNumber + secondNumber));
                break;
            
            case '-':
                System.out.println(firstNumber + " - " +  secondNumber + " = " + (firstNumber - secondNumber));
                break;
                
            case '*' : 
                System.out.println(firstNumber + " * " +  secondNumber + " = " + (firstNumber * secondNumber));
                break;
                
            case '/':
                if(secondNumber != 0){
                    System.out.println(firstNumber + " / " +  secondNumber + " = " + (firstNumber / secondNumber));
                }else{
                    throw new IllegalArgumentException("Denominator cannot be 0");
                }
                break;
                
            case '%':
                if(secondNumber != 0){
                    System.out.println(firstNumber + " % " +  secondNumber + " = " + (firstNumber % secondNumber));
                }else{
                    throw new IllegalArgumentException("Denominator cannot be 0");
                }
                break;
                
            default: 
                System.out.println("The given operator is invalid");
                break;
        }
    }
    /**
     * public static method to calculates sum of all odd numbers
     * @param number sets number 
     */
    public static void sumOddNumbers(int number){
        int count= 0;
        int sum = 0;
        if(number != 0){
            while(count <= number){
                if(count%2 != 0){
                    System.out.println(count);
                    sum = sum + count;
                    count++;
                }else{
                    count++;
                }
            }
            System.out.println(sum);
            
        }else{
            throw new IllegalArgumentException("Number cannot be negative");
        }
    }
    /**
     * public static method to calculates and displays the squares of all numbers till a given number
     * @param number sets number
     */
    public static void displaySquareNumbers(int number){
        int count = 0;
        if(number >= 0){
            while(count <= number){
                System.out.println("The square of " + count + " is " + (count * count));
                count++;
            }
        }else{
            count = number;
            while(count < 0){
                System.out.println("The square of " + count + " is " + (count * count));
                count++;
            }
        }
    }
    /**
     * public static method to calculates and prints the factorial of the given number
     * @param number sets number 
     */
    public static void getFactorial(int number){
        int count = 1;
        int result = 1;
        if(number > 0){
            while(count <= number){
                result = result * count;
                count++;
            }
            System.out.println("Factorial of " + number + " = " + (result) );
        }else if(number == 0){
            System.out.println("Factorial of " + number + " = 1"  );
        }else{
            throw new IllegalArgumentException("Factorial of negative number is undefined.");
        }
        
    }
    
}
