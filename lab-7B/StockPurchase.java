/**
 * @author Tamandeep Singh
 * @version lab-7B-1.0
 */
public class StockPurchase{
    private Stock stock;
    private int numberOfShares;
    
    /**
     * StockPurchase Constructor
     *
     */
    public StockPurchase(){
        stock = new Stock();
    }
    
    /**
     * StockPurchase Constructor
     *
     * @param inputStock A parameter
     * @param inputNumOfShares A parameter
     */
    public StockPurchase(Stock inputStock, int inputNumOfShares){
        setStock(inputStock);
        setNumberOfShares(inputNumOfShares);
    }

    /**
     * Method setStock
     *
     * @param inputStock A parameter
     */
    public void setStock(Stock inputStock){
        if(inputStock != null){
            stock = inputStock;
        }else{
            throw new IllegalArgumentException("Stock cannot be null");
        }
        
    }
    
    /**
     * Method setNumberOfShares
     *
     * @param inputNumOfShares A parameter
     */
    public void setNumberOfShares(int inputNumOfShares){
        if(inputNumOfShares > 0){
            numberOfShares = inputNumOfShares;
        }else{
            throw new IllegalArgumentException("number of share cannot be negative.");
        }
    }
    
    /**
     * Method getStock
     *
     * @return The return value
     */
    public Stock getStock(){
        return stock;
    }
    
    /**
     * Method getNumberOfShares
     *
     * @return The return value
     */
    public int getNumberOfShares(){
        return numberOfShares;
    }
    
    /**
     * Method getTotalCost
     *
     * @return The return value
     */
    public double getTotalCost(){
        double result;
        result = getNumberOfShares() * stock.getSharePrice();
        stock.displayDetails(getNumberOfShares() , result);
        return result;
    }
    
}
