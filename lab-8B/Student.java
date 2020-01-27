/**
 * @author Tamandeep Singh
 * @version lab-8B
 */
public class Student{
    private String studentName;
    private int [] studentMarks;
    private InputReader reader = new InputReader();
    public static final int MAX_MARKS = 100;
    public static final int PASSING_MARKS = 50;
    
    /**
     * Student Constructor
     *
     * @param inputName A parameter
     */
    public Student(String inputName){
        studentMarks = new int[10];
        setStudentName(inputName);
    }
    
    /**
     * Method setStudentName
     *
     * @param inputName A parameter
     */
    public void setStudentName(String inputName){      
        if(inputName == null){
            throw new IllegalArgumentException("Name cannot be null");
        }else if(inputName.length() <= 0){
            throw new IllegalArgumentException("Name cannot be empty");
        }else{
            studentName = inputName;
        }
    }
    
    /**
     * Method getStudentName
     *
     * @return The return value
     */
    public String getStudentName(){
        return studentName;
    }
    
    /**
     * Method promptStudentMarks
     *
     */
    public void promptStudentMarks(){
        int index = 0;
        System.out.println("Enter All Exams marks below :");
        while(index < studentMarks.length){
            int mark = reader.readInt();
            
            if(mark >= 0 && mark <= MAX_MARKS){
                System.out.println("Enter marks of exam " + (index + 1) +" = "+ mark);
                studentMarks[index] = mark;
                index++;
            }else{
                System.out.println("Invalid marks, try again");
            }
        }
    }
    
    /**
     * Method calcualteAverageMark
     *
     * @return The return value
     */
    public double calcualteAverageMark(){
        int index = 0;
        double sum = 0;
        double average;
        while(index < studentMarks.length){
            sum = sum + studentMarks[index];
            index++;
        }
        average = (sum/studentMarks.length);
        return average;
    }
    
    /**
     * Method calculateTotalPassedExams
     *
     * @return The return value
     */
    public int calculateTotalPassedExams(){
        int index = 0;
        int passed = 0;
        while(index < studentMarks.length){
            if(studentMarks[index] >= PASSING_MARKS){
                passed = passed + 1;
            }
            index++;
        }
        return passed;
    }
    
    /**
     * Method isPassedAllExams
     *
     * @return The return value
     */
    public boolean isPassedAllExams(){
        if(calculateTotalPassedExams() ==  studentMarks.length && calcualteAverageMark() >= PASSING_MARKS){
            return true;
        }else{
            return false;
        }
        
    }
    
    /**
     * Method displayDetails
     *
     */
    public void displayDetails(){
        System.out.println("Name of the Student : " + getStudentName());
        System.out.println("Average of all 10 exams : " + calcualteAverageMark());
        System.out.println("Number of exams passed : " + calculateTotalPassedExams());
        if(isPassedAllExams() ){
            System.out.println("Status : Passed");
        }else{
            System.out.println("Status : Failed");
        }
        
    }
    
    /**
     * Method main
     *
     * @param args A parameter
     */
    public static void main(String args[]){
        Student s1 = new Student("Jojo");
        s1.promptStudentMarks();
        s1.displayDetails();
        
    }
    
}
