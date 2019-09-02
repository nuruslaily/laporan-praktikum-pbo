package laptopdemo;

/**
 *
 * @author Nurus Laily
 */
public class LaptopGaming extends Laptop{
    private String tipeVGA;
    
    public void setTipeVGA(String newValue){
        tipeVGA = newValue;
    }
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Tipe VGA: "+ tipeVGA);
    }
}

