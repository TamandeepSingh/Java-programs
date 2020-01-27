/**
 * Lab2-A 
 * Class Employee
 * @version 1.0
 * @author Tamandeep Singh
 */
public class Employee{
    // Instance variables
    private String employeeName;
    private String employeeAddress;
    private int employeeAgeInYears;
    private int numberOfYearsEmployeed;
    private double annualPayInCAD;
    private boolean isFullTime;
    // Constructors
    /**
     * Constructor Employee with no arguments
     */
    public Employee(){
        employeeName = "unknown";
        employeeAddress = "unknown";
        employeeAgeInYears = 1;
        numberOfYearsEmployeed = 1;
        annualPayInCAD = 1;
        isFullTime = false;    
    }
    /**
     * Constructor Employee
     * @param inputEmpName sets employeeName
     * @param inputEmpAddress sets employeeAddress
     * @param empAge sets employeeAgeInYears
     * @param inputNumberOfYearsEmployeed sets numberOfYearsEmployeed
     * @param inputPay sets annualPayInCAD
     * @param fullTime sets isFullTime
     */
    public Employee(String inputEmpName, String inputEmpAddress, int empAge, int inputNumberOfYearsEmployeed, double inputPay, boolean fullTime){
        if(inputEmpName != null){
            employeeName = inputEmpName;
        }else{
            throw new IllegalArgumentException("Name cannot be null");
        }
        
        if(inputEmpAddress != null){
            employeeAddress = inputEmpAddress;
        }else{
            throw new IllegalArgumentException("Address cannot be null");
        }
        
        if(empAge >0){
            employeeAgeInYears = empAge;
        }else{
            throw new IllegalArgumentException("Age cannot be negative or Zero");
        }
        
        if(inputNumberOfYearsEmployeed >=0){
            numberOfYearsEmployeed = inputNumberOfYearsEmployeed;
        }else{
            throw new IllegalArgumentException("Cannot be negative");
        }
        
        if(inputPay > 0){
            annualPayInCAD = inputPay;
        }else{
            throw new IllegalArgumentException("Annual pay cannot be negative");
        }
        
        isFullTime = fullTime;
    }
    
}