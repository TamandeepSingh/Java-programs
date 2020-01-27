 /**
 * @author Tamandeep Singh
 * @version lab-9A
 */
import java.util.Random;
public class Play{
    InputReader reader = new InputReader();
    
    /**
     * Play Constructor
     *
     */
    public Play(){
        InputReader reader = new InputReader();
    }
    
    /**
     * Method stringPlay
     *
     */
    public void stringPlay(){
        String someString;
        System.out.println("Input a String : ");
        someString = reader.readString();
        String firstLetter = someString.substring(0,1).toUpperCase();
        someString = someString.substring(1,someString.length()).toLowerCase();
        int index = 0;
        while(index < someString.length()){            
            System.out.println(firstLetter + someString);
            index++;
        }
        
    }
    
    /**
     * Method getMultiplicationTable
     *
     */
    public void getMultiplicationTable(){
        int index =0;
        System.out.println("Enter two numbers between 0 to 10");
        int[] inputNum;
        inputNum = new int[2];
        while(index < inputNum.length){
            int enterNum = reader.readInt();
            if(enterNum > 0 && enterNum <10){
                inputNum[index] = enterNum;
                System.out.println("Number " + (index+1) + " = " + inputNum[index]);
                index++;
            }else{
                System.out.println("Try again");
            }
        }
        int rowLength = inputNum[0] + 1;
        int columnLength = inputNum[1] + 1;
        int[][] multiPlicationTable = new int[rowLength][columnLength];
        
        for(int row = 0; row < rowLength ; row++ ){
            for(int column= 0; column < columnLength ; column++){
                multiPlicationTable[row][column] = row*column;
            }
        }
        
        for(int row = 0; row < rowLength ; row++ ){
            for(int column= 0; column < columnLength ; column++){
                System.out.print(multiPlicationTable[row][column] + " ");
            }
            System.out.println(" ");
        }
        
    }
    
    /**
     * Method guessTheNumber
     *
     */
    public void guessTheNumber(){
        Random random = new Random();
        System.out.println("This is a game in which computer genrate a random number between 0 to 10 and you need to guess the correct number.");
        int num = random.nextInt(10);
        //System.out.println(num);
        int guessedNum;
        int numberOfGuess = 0;
        while(numberOfGuess <= 10){
            System.out.println("Guess a number between 0 to 10 : ");
            guessedNum = reader.readInt();
            if(guessedNum > num && guessedNum <= 10){
                System.out.println("Too high");
                numberOfGuess = numberOfGuess + 1;
            }else if(guessedNum < num && guessedNum >= 0){
                System.out.println("Too low");
                numberOfGuess = numberOfGuess + 1;
            }else if(guessedNum == num){
                System.out.println("Correct : " + num);
                System.out.println("Total number of guesses made : " + numberOfGuess);
                break;
            }else{
                System.out.println("Try again");
            }
        }
    }
    
    /**
     * Method main
     *
     * @param args A parameter
     */
    public static void main(String args[]){
        Play p1 = new Play();
        p1.stringPlay();
        p1.getMultiplicationTable();
        p1.guessTheNumber();
    } 

}
