/**
 * @author Tamandeep Singh
 * @version Lab4-B-1.0
 */
public class BookClub
{
    /**
     * Instance variables
     */
    private String clientName;
    private int numberOfPurchasedBooksPerMonth;
    private static int totalNumberOfSoldBooks;
    /**
     * static final variables
     */
    public static final int FIRST_LEVEL_BOOK_REWARD = 5;
    public static final int SECOND_LEVEL_BOOK_REWARD = 15;
    public static final int THIRD_LEVEL_BOOK_REWARD = 30;
    public static final int FOURTH_LEVEL_BOOK_REWARD = 60;
    
    public static final int FIRST_LEVEL_BOOK_REWARD_LIMIT = 3;
    public static final int SECOND_LEVEL_BOOK_REWARD_LIMIT = 7;
    public static final int THIRD_LEVEL_BOOK_REWARD_LIMIT = 10;
    
    /**
     * Constructor with arguments
     * @param cName sets clientName
     * @param purchasedBooks sets numberOfPurchasedBooksPerMonth
     */
    public BookClub(String cName, int purchasedBooks){
        if(cName != null){
            clientName = cName;
        }else{
            throw new IllegalArgumentException("Client name cannot be null");
        }
        if(purchasedBooks > 0){
            numberOfPurchasedBooksPerMonth = purchasedBooks;
            totalNumberOfSoldBooks = numberOfPurchasedBooksPerMonth;
        }else{
            throw new IllegalArgumentException("Number of books cannot be negative");
        }
        
    }
    /**
     * @return clientName
     */
    public String getClientName(){
        return clientName;
    }
    /**
     * @return numberOfPurchasedBooksPerMonth
     */
    public int getNumberOfPurchasedBooksPerMonth(){
        return numberOfPurchasedBooksPerMonth;
    }
    /**
     * @return totalNumberOfSoldBooks
     */
    public static int getTotalNumberOfSoldBooks(){
        return totalNumberOfSoldBooks;
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
     * @param purchasedBooks sets numberOfPurchasedBooksPerMonth
     */
    public void setNumberOfPurchasedBooksPerMonth(int purchasedBooks){
        if(purchasedBooks > 0){
            numberOfPurchasedBooksPerMonth = purchasedBooks;
            totalNumberOfSoldBooks = numberOfPurchasedBooksPerMonth;
        }else{
            throw new IllegalArgumentException("Number of books cannot be negative");
        }
    }
    /**
     * @return pointsEarned
     */
    public int calculateBookPoints(){
        int pointsEarned = 0;
        
        if(numberOfPurchasedBooksPerMonth > 0 && numberOfPurchasedBooksPerMonth <= FIRST_LEVEL_BOOK_REWARD_LIMIT){
            pointsEarned = FIRST_LEVEL_BOOK_REWARD * numberOfPurchasedBooksPerMonth;
        }else if(numberOfPurchasedBooksPerMonth > FIRST_LEVEL_BOOK_REWARD_LIMIT && numberOfPurchasedBooksPerMonth <= SECOND_LEVEL_BOOK_REWARD_LIMIT){
            pointsEarned = SECOND_LEVEL_BOOK_REWARD * numberOfPurchasedBooksPerMonth;
        }else if(numberOfPurchasedBooksPerMonth > SECOND_LEVEL_BOOK_REWARD_LIMIT && numberOfPurchasedBooksPerMonth <= THIRD_LEVEL_BOOK_REWARD_LIMIT){
            pointsEarned = THIRD_LEVEL_BOOK_REWARD * numberOfPurchasedBooksPerMonth;
        }else if(numberOfPurchasedBooksPerMonth > THIRD_LEVEL_BOOK_REWARD_LIMIT){
            pointsEarned = FOURTH_LEVEL_BOOK_REWARD * numberOfPurchasedBooksPerMonth;
        }
        
        return pointsEarned;
    }
    
}
