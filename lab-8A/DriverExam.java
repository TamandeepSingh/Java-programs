/**
 * @author Tamandeep Singh
 * @version lab-8A
 */
public class DriverExam{
    public static final int TOTAL_QUESTIONS = 20;
    public static final int PASSING_MARKS = 15;
    public static final char[] ANSWERS = {'B', 'D', 'A', 'A', 'C','A', 'B' , 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'};
    private InputReader reader = new InputReader();
    private char[] driversAnswers;
    
    /**
     * DriverExam Constructor
     *
     */
    public DriverExam(){
        driversAnswers = new char[20];
        
    }
    
    /**
     * Method promptStudentAnswers
     *
     */
    public void promptStudentAnswers(){
        int index = 0;
        System.out.println("Answer your questions below ");
        while(index < driversAnswers.length){            
            char answer = reader.readChar();
            if(answer == 'A' || answer == 'B' || answer == 'C' || answer == 'D'){
                System.out.println("Answer for question number " + (index + 1)  + " = " + answer);
                driversAnswers[index] = answer;
                index ++;
            }else{
                System.out.println("Try different option");
            }
            
            
        }
    }
    
    /**
     * Method getTotalCorrectAnswers
     *
     * @return The return value
     */
    public int getTotalCorrectAnswers(){
        int index = 0;
        int result = 0;
        while(index < driversAnswers.length){
            
            if(driversAnswers[index] == ANSWERS[index]){
                result = result + 1;
            }
            index ++;
        }
        return result;
    }
    
    /**
     * Method getTotalIncorrectAnswers
     *
     * @return The return value
     */
    public int getTotalIncorrectAnswers(){
        int incorrect = TOTAL_QUESTIONS - getTotalCorrectAnswers();
        return incorrect;
    }
    
    /**
     * Method isPass
     *
     * @return The return value
     */
    public boolean isPass(){
        if(getTotalCorrectAnswers() >= PASSING_MARKS){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Method main
     *
     * @param args A parameter
     */
    public static void main(String[] args){
        DriverExam exam = new DriverExam();
        exam.promptStudentAnswers();
        System.out.println("Total correct" + exam.getTotalCorrectAnswers());
        System.out.println("Total incorrect" + exam.getTotalIncorrectAnswers());
        if(exam.isPass()){
            System.out.println("Driver has passed the exam.");
        }else{
            System.out.println("Driver has failed the exam.");
        }
        
    }
    
}
