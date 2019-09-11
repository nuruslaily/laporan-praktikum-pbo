package motorencapsulation1841720049nurus;

/**
 *
 * @author Nurus Laily
 */
public class Motor1841720049nurus {
    private int mkecepatan =0;
    private boolean mkontakOn = false;
    public void nyalakanMesinNurus(){
        mkontakOn = true;
    }
    public void matikanMesinNurus(){
        mkontakOn = false;
        mkecepatan = 0;
    }
    public void tambahKecepatanNurus(){
        if (mkontakOn==true) {
            mkecepatan += 5;
        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }
    public void kurangiKecepatanNurus(){
        if(mkontakOn==true) {
            mkecepatan -= 5;
        }
        else{
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }
    public void printStatusNurus(){
        if (mkontakOn==true) {
            System.out.println("Kontak On");  
        }
        else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + mkecepatan+"\n");
    }
}
