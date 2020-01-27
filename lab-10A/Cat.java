/**
 * @author Tamandeep Singh
 * @version lab-10A
 */
public class Cat{
    private String nameOfCat;
    private int yearOfBirth;
    private double weightInkilos;
    
    /**
     * Cat Constructor
     *
     * @param inputName A parameter
     * @param inputBirthYear A parameter
     * @param inputWeightInKilos A parameter
     */
    public Cat(String inputName, int inputBirthYear, double inputWeightInKilos){
        setNameOfCat(inputName);
        setYearOfBirth(inputBirthYear);
        setWeightInkilos(inputWeightInKilos);
    }
    
    /**
     * Method setNameOfCat
     *
     * @param inputName A parameter
     */
    public void setNameOfCat(String inputName){
        if(inputName != null){
            nameOfCat = inputName;
        }else{
            throw new IllegalArgumentException("Cat name cannot be null");
        }
    }
    
    /**
     * Method setYearOfBirth
     *
     * @param inputBirthYear A parameter
     */
    public void setYearOfBirth(int inputBirthYear){
        if(inputBirthYear > 0){
            yearOfBirth = inputBirthYear; 
        }else{
            throw new IllegalArgumentException("Cat birth year cannot be negative");
        }
    }
    
    /**
     * Method setWeightInkilos
     *
     * @param inputWeightInKilos A parameter
     */
    public void setWeightInkilos(double inputWeightInKilos){
        if(inputWeightInKilos > 0){
            weightInkilos = inputWeightInKilos; 
        }else{
            throw new IllegalArgumentException("Cat weight cannot be negative");
        }
    }
    
    /**
     * Method getNameOfCat
     *
     * @return The return value
     */
    public String getNameOfCat(){
        return nameOfCat;
    }
    
    /**
     * Method getYearOfBirth
     *
     * @return The return value
     */
    public int getYearOfBirth(){
        return yearOfBirth;
    }
    
    /**
     * Method getWeightInkilos
     *
     * @return The return value
     */
    public double getWeightInkilos(){
        return weightInkilos;
    }
    
}
