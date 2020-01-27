/**
 * @author Tamandeep Singh
 * @version lab4-A-1.0
 */
public class BankCharges{
    /**
     * Static final variables
     */
    public static final double FIRST_CHEQUES_CHARGE = 0.10;
    public static final double SECOND_CHEQUES_CHARGE =0.08;
    public static final double THIRD_CHEQUES_CHARGE = 0.06;
    public static final double FOURTH_CHEQUES_CHARGE = 0.04;

    public static final int BANK_CHARGE = 10;

    public static final int BANK_LOW_BALANCE_CHARGE = 15;
    public static final int LOW_BALANCE_LIMIT = 400;

    public static final int FIRST_CHEQUES_LEVEL= 20;
    public static final int SECOND_CHEQUES_LEVEL = 40;
    public static final int THIRD_CHEQUES_LEVEL = 60;
    /**
     * Instance variables
     */
    private String clientName;
    private double endingBalance;
    private int numberOfCheques;
    /**
     * No args
     */
    public BankCharges(){
        clientName = "unknown";
        endingBalance = 0;
        numberOfCheques = 0;
    }
    /**
     * Constructor with arguments
     * @param cName sets clientName
     * @param cendingBalance sets endingBalance
     * @param cNumberOfCheques sets numberOfCheques
     */
    public BankCharges(String cName, double cendingBalance, int cNumberOfCheques){
        if(cName != null){
            clientName = cName;
        }else{
            throw new IllegalArgumentException("Client name cannot be null");
        }
        
        if(cendingBalance >= 0){
            endingBalance = cendingBalance;
        }else{
            throw new IllegalArgumentException("Ending balance cannot be negative");
        }
        if(cNumberOfCheques >= 0){
            numberOfCheques = cNumberOfCheques;
        }else{
            throw new IllegalArgumentException("number of cheques cannot be negative");
        }
    }
    /**
     * @return the value of clientName
     */
    public String getClientName(){
        return clientName;
    }
    /**
     * @return the value of endingBalance
     */
    public double getEndingBalance(){
        return endingBalance;
    }
    /**
     * @return the value of numberOfCheques
     */
    public int getNumberOfCheques(){
        return numberOfCheques;
    }
    /**
     * @param cName sets clientName
     */
    public void setClientName(String cName){
        if(cName != null){
            clientName = cName;
        }else{
            throw new IllegalArgumentException("Client name cannot be null");
        }
    }
    /**
     * @param cendingBalance sets endingBalance
     */
    public void setEndingBalance(double cendingBalance){
        if(cendingBalance >= 0){
            endingBalance = cendingBalance;
        }else{
            throw new IllegalArgumentException("Ending balance cannot be negative");
        }
    }
    /**
     * @param cNumberOfCheques sets numberOfCheques
     */
    public void setNumberOfCheques(int cNumberOfCheques){
        if(cNumberOfCheques >= 0){
            numberOfCheques = cNumberOfCheques;
        }else{
            throw new IllegalArgumentException("number of cheques cannot be negative");
        }
    }
    /**
     * No args
     */
    public double calculateBankServiceFees(){
        double sericeFees = 0;
        
        if(endingBalance < LOW_BALANCE_LIMIT && numberOfCheques > 0){
            if(numberOfCheques < FIRST_CHEQUES_LEVEL){
                sericeFees = BANK_CHARGE + BANK_LOW_BALANCE_CHARGE + FIRST_CHEQUES_CHARGE * numberOfCheques;
            }else if(numberOfCheques >= FIRST_CHEQUES_LEVEL && numberOfCheques < SECOND_CHEQUES_LEVEL){
                sericeFees = BANK_CHARGE + BANK_LOW_BALANCE_CHARGE + SECOND_CHEQUES_CHARGE * numberOfCheques;
            }else if(numberOfCheques >= SECOND_CHEQUES_LEVEL && numberOfCheques < THIRD_CHEQUES_LEVEL){
                sericeFees = BANK_CHARGE + BANK_LOW_BALANCE_CHARGE + THIRD_CHEQUES_CHARGE * numberOfCheques;
            }else if(numberOfCheques >= THIRD_CHEQUES_LEVEL){
                sericeFees = BANK_CHARGE + BANK_LOW_BALANCE_CHARGE + FOURTH_CHEQUES_CHARGE * numberOfCheques;
            }
        }else if(endingBalance >= LOW_BALANCE_LIMIT && numberOfCheques > 0){
            if(numberOfCheques < FIRST_CHEQUES_LEVEL){
                sericeFees = BANK_CHARGE + FIRST_CHEQUES_CHARGE * numberOfCheques;
            }else if(numberOfCheques >= FIRST_CHEQUES_LEVEL && numberOfCheques < SECOND_CHEQUES_LEVEL){
                sericeFees = BANK_CHARGE + SECOND_CHEQUES_CHARGE * numberOfCheques;
            }else if(numberOfCheques >= SECOND_CHEQUES_LEVEL && numberOfCheques < THIRD_CHEQUES_LEVEL){
                sericeFees = BANK_CHARGE + THIRD_CHEQUES_CHARGE * numberOfCheques;
            }else if(numberOfCheques >= THIRD_CHEQUES_LEVEL){
                sericeFees = BANK_CHARGE + FOURTH_CHEQUES_CHARGE * numberOfCheques;
            }
        }else{
            sericeFees = BANK_CHARGE;
        }
        
        endingBalance -= sericeFees;
        
        return sericeFees;
    }
}
