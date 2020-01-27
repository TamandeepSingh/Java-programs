/**
 * @author Tamandeep Singh
 * @version lab5-A-1.0
 */
public class CommisionSales{
    /**
     * public static final variables
     */
    public static final double RATE_A = 0.05;
    public static final double RATE_B = 0.10; 
    public static final double RATE_C = 0.13; 
    public static final double RATE_D = 0.18; 
    public static final double RATE_E=  0.22;
    public static final int DIVISION_FACTOR = 10000;
    public static final int SALES_AMOUNT_LIMIT = 60000;
    /**
     * Instance variables
     */
    private String salesPersonName;
    private int salesAmountInCAD;
    private double payInCad;
    /**
     * Constructor with arguments
     * @param name sets salesPersonName
     * @param salesAmount sets salesAmountInCAD
     */
    public CommisionSales(String name, int salesAmount){
        if(name != null){
            salesPersonName = name;
        }else{
            throw new IllegalArgumentException("sales person name cannot be null");
        }
        
        if(salesAmount >0 && salesAmount < SALES_AMOUNT_LIMIT){
            salesAmountInCAD = salesAmount;
        }else{
            throw new IllegalArgumentException("sales amount cannot be negative and less than 60000");
        }
        
    }
    /**
     * Construcor with no arguments
     */
    public CommisionSales(){
        salesPersonName = "unknown";
    }
    /**
     * @return salesPersonName
     */
    public String getSalesPersonName(){
        return salesPersonName;
    }
    /**
     * @return salesAmountInCAD
     */
    public int getSalesAmountInCAD(){
        return salesAmountInCAD;
    }
    /**
     * @return payInCad
     */
    public double getPayInCad(){
        return payInCad;
    }
    /**
     * @param name sets salesPersonName
     */
    public void setSalesPersonName(String name){
        if(name != null){
            salesPersonName = name;
        }else{
            throw new IllegalArgumentException("sales person name cannot be null");
        }
    }
    /**
     * @param salesAmount sets salesAmountInCAD
     */
    public void setSalesAmountInCAD(int salesAmount){
        if(salesAmount >0 && salesAmount < SALES_AMOUNT_LIMIT){
            salesAmountInCAD = salesAmount;
        }else{
            throw new IllegalArgumentException("sales amount cannot be negative and less than 60000");
        }
    }
    /**
     * @param pay sets payInCad
     */
    public void setPayInCad(double pay){
        if(pay > 0){
            payInCad = pay;
        }else{
            throw new IllegalArgumentException("Pay cannot be negative or 0");
        }
        
    }
    /**
     * @return payInCad after caluculating
     */
    public double calculatePay(){
        int factor = salesAmountInCAD/DIVISION_FACTOR;
        
        switch(factor){
            case 0 : 
                payInCad = RATE_A;
                break;
            
            case 1 : 
                payInCad = RATE_A;
                break;
                
            case 2 : 
                payInCad = RATE_B;
                break;
                    
            case 3 :
                payInCad = RATE_C;
                break;
                
            case 4 :
                payInCad = RATE_D;;
                break;
                
            case 5 :
                payInCad = RATE_E;
                break;
                
            default: 
                System.out.println("sales amount is either invalid or out of the acceptable range");
                payInCad = 0;
                break;
        }
        payInCad = salesAmountInCAD * payInCad;
        payInCad = salesAmountInCAD + payInCad;
        return payInCad;
    }
    /**
     * method displays details
     */
    public void displayDetails(){
        System.out.println("Salesman name : " + salesPersonName);
        System.out.println("Amount of Sales : " + salesAmountInCAD);
        System.out.println("Pay of the Salesman : " + payInCad);
    }

}
