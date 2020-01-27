/**
 * @author Tamandeep Singh
 * @version 1.0
 */
import java.util.ArrayList;
public class PoliceDepartment{
    private String address;
    private ArrayList<PoliceOfficer> officerList;
    
    /**
     * PoliceDepartment Constructor
     *
     * @param inputAddress A parameter
     */
    public PoliceDepartment(String inputAddress){
        officerList = new ArrayList<PoliceOfficer>();
        setAddress(inputAddress);
        
    }
    
    /**
     * Method setAddress
     *
     * @param inputAddress A parameter
     */
    public void setAddress(String inputAddress){
        if(inputAddress == null){
            throw new IllegalArgumentException("address cannot be null");
        }else{
            if(inputAddress.isEmpty()){
                throw new IllegalArgumentException("address cannot be an empty String");
            }else{
                address = inputAddress;
            }
        }
    }
    
    /**
     * Method getAddress
     *
     * @return The return value
     */
    public String getAddress(){
        return address;
    }
    
    /**
     * Method getOfficerList
     *
     * @return The return value
     */
    public ArrayList<PoliceOfficer> getOfficerList(){
        return officerList;
    }
    
    /**
     * Method addPoliceOfficer
     *
     * @param inputOfficer A parameter
     */
    public void addPoliceOfficer(PoliceOfficer inputOfficer){
        if(inputOfficer != null){
            officerList.add(inputOfficer);
        }else{
            System.out.println("Police Officer object is null");
        }
    }
    
    /**
     * Method displayTicketsByOfficer
     *
     * @param officerName A parameter
     */
    public void displayTicketsByOfficer(String officerName){
        if(officerName != null){
            for(PoliceOfficer officer : officerList){
                if(officer.getOfficerName().equalsIgnoreCase(officerName)){
                    officer.displayticketsDetails();
                }
            }
        }else{
            System.out.println("Officer name cannot be null");
        }
    }
    
    /**
     * Method calculateSumOfAllTicketsOfAllOfficers
     *
     * @return The return value
     */
    public double calculateSumOfAllTicketsOfAllOfficers(){
        double count = 0;
        for(PoliceOfficer officer : officerList){
            count = count + officer.sumAllfines();
        }
        return count;
    }
    
    /**
     * Method totalParkingTicketCountOfACar
     *
     * @param inputLicensePlateNumber A parameter
     * @return The return value
     */
    public int totalParkingTicketCountOfACar(String inputLicensePlateNumber){
        int count = 0;
        if(inputLicensePlateNumber != null){
            for(PoliceOfficer officer : officerList){
                count = count + officer.getParkingTicketsCountForACar(inputLicensePlateNumber);
            }
        }else{
            System.out.println("License plate number cannot be null");
        }
        return count;
    }
    
}
