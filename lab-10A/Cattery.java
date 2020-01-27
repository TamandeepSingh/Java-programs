/**
 * @author Tamandeep Singh
 * @version lab-10A
 */
import java.util.ArrayList;
public class Cattery{
    private ArrayList<Cat> catsList;
    private String nameOfBusiness;
    
    /**
     * Cattery Constructor
     *
     * @param inputNameOfBusiness A parameter
     */
    public Cattery(String inputNameOfBusiness){
        catsList = new ArrayList<Cat>();
        setNameOfBusiness(inputNameOfBusiness);
    }
    
    /**
     * Method setNameOfBusiness
     *
     * @param inputNameOfBusiness A parameter
     */
    public void setNameOfBusiness(String inputNameOfBusiness){
        if(inputNameOfBusiness == null){
            throw new IllegalArgumentException("business name cannot be null");
        }else if(inputNameOfBusiness.isEmpty()){
            throw new IllegalArgumentException("business name cannot be empty");
        }else{
            nameOfBusiness = inputNameOfBusiness;
        }
    }
    
    /**
     * Method getNameOfBusiness
     *
     * @return The return value
     */
    public String getNameOfBusiness(){
        return nameOfBusiness;
    }
    
    /**
     * Method addCat
     *
     * @param newCat A parameter
     */
    public void addCat(Cat newCat){
        if(newCat != null){
            catsList.add(newCat);
        }else{
            throw new IllegalArgumentException("Cat object is null");
            //System.out.println("Cat object is null");
        }
    }
    
    /**
     * Method getCat
     *
     * @param index A parameter
     */
    public void getCat(int index){
        if(index >= 0 && index < catsList.size()){
            Cat c1 = catsList.get(index);
            System.out.println("Cat name : " + c1.getNameOfCat());
            System.out.println("Cat birth year : " + c1.getYearOfBirth());
            System.out.println("Cat weight in kilos : " + c1.getWeightInkilos());
        }else{
            System.out.println("No cat is present with this index " + index);
        }        
    }
    
    /**
     * Method removeCat
     *
     * @param index A parameter
     */
    public void removeCat(int index){
        if(index >= 0 && index < catsList.size()){
            catsList.remove(index);
        }else{
            System.out.println("No cat is present with this index " + index);
        }
    }
    
    /**
     * Method displayAllCats
     *
     */
    public void displayAllCats(){
        System.out.println("The current guests in " + getNameOfBusiness());
        for(Cat c:catsList){
            System.out.println(c.getNameOfCat());
        }
    }
    
    /**
     * Method main
     *
     * @param args A parameter
     */
    public static void main(String[] args){
        Cat c1 = new Cat("Garfield" , 2017, 10);
        Cat c2 = new Cat("Furbal" , 2018, 5);
        Cat c3 = new Cat("Fang" , 2019, 4);
        Cattery cattery1 = new Cattery("Puss in Boots inc. ");
        cattery1.addCat(c1);
        cattery1.addCat(c2);
        cattery1.addCat(c3);
        cattery1.getCat(4);
        cattery1.getCat(2);
        cattery1.displayAllCats();
        cattery1.removeCat(4);
        cattery1.removeCat(2);
        cattery1.displayAllCats();
        
    }
    
}
