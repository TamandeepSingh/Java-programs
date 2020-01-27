/**
 * @author Tamandeep Singh
 * @version 1.0
 */
public class Student{
    // instance variables
    private String studentName;
    private String studentId;
    private double testScore;
    private double courseFeesInCAD;
    private boolean isEligibleForDiscount;
    private double discountOnFees;
    /**
     * @param sets studentName
     * @param sets studentId
     * @param sets testScore
     * @param sets courseFeesInCAD
     * @param sets isEligibleForDiscount
     */
    public Student(String inputName, String inputId, double inputTestScore, double inputCourseFeesInCAD){
        if(inputName != null){
            studentName = inputName;
        }else{
            throw new IllegalArgumentException("Student name cannot be null");
        }
        if(inputId != null){
            studentId = inputId;
        }else{
            throw new IllegalArgumentException("Student ID cannot be null");
        }
        if(inputTestScore >=0 ){
            testScore = inputTestScore;
        }else{
            throw new IllegalArgumentException("Test score cannot be negative");
        }
        if(inputCourseFeesInCAD > 0 ){
            courseFeesInCAD = inputCourseFeesInCAD;
        }else{
            throw new IllegalArgumentException("Course fees cannot be zero or negative");
        }
        
        isEligibleForDiscount = false;
        
    }
    /**
     * @return the value of student name
     */
    public String getStudentName(){
        return studentName;
    }
    /**
     * @return the value of student ID
     */
    public String getStudentId(){
        return studentId;
    }
    /**
     * @return the value of student test score
     */
    public double getTestScore(){
        return testScore;
    }
    /**
     * @return the value of student course fees in CAD
     */
    public double getCourseFeesInCAD(){
        return courseFeesInCAD;
    }
    /**
     * @return the value of if student Eligible for discount
     */
    public boolean getIsEligibleForDiscount(){
        return isEligibleForDiscount;
    }
    /**
     * @param the value of student name
     */
    public void setStudentName(String inputName){
        if(inputName != null){
            studentId = inputName;
        }else{
            throw new IllegalArgumentException("Student name cannot be null");
        }
        
    }
    /**
     * @param the value of student ID
     */
    public void setStudentId(String inputId){
        if(inputId != null){
            studentId = inputId;
        }else{
            throw new IllegalArgumentException("Student ID cannot be null");
        }
        
    }
    /**
     * @param the value of student score
     */
    public void setTestScore(double inputScore){
        if(inputScore >=0 ){
            testScore = inputScore;
        }else{
            throw new IllegalArgumentException("Test score cannot be negative");
        }
        
    }
    
    /**
     * @param the value of student score
     */
    public void setCourseFeesInCAD(double inputFees){
        if(inputFees > 0 ){
            courseFeesInCAD = inputFees;
        }else{
            throw new IllegalArgumentException("Course fees cannot be zero or negative");
        }
        
    }
    /**
     * @param the value of student fees in CAD
     */
    public void checkForDiscount(){
        if(courseFeesInCAD >= 700 ){
            discountOnFees = 0.15 * courseFeesInCAD;
            courseFeesInCAD = courseFeesInCAD - discountOnFees;
            isEligibleForDiscount = true;
        }else{
            isEligibleForDiscount = false;
        }
    }
    /**
     * no args
     */
    public void printStudentDetails(){
        System.out.println("Student name : " + studentName);
        System.out.println("StudentID : " + studentId);
        System.out.println("Test score : " + testScore);
        System.out.println("Course fees : " + courseFeesInCAD);
        if(isEligibleForDiscount == true){
            System.out.println("This student got a discount of 15 % ");
        }else{
            System.out.println("This student does not get a discount");
        }
    }
}
