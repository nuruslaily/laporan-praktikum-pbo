package laptopdemo;
/**
 *
 * @author Nurus Laily
 */
public class Laptop {
    private String merek;
    private int daya;
    private int baterai;
    private String keterangan;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    public void setKeterangan(String newValue){
        keterangan = newValue;
    }
    public void dayaBaterai(int newValue){
        baterai = newValue;
    }
    public void tambahDaya(int increment){
        daya = daya + increment;
    }
    public void berhenti(int decrement){
        daya = daya - decrement;
    }
    public void cetakStatus(){
        System.out.println("Merek: "+ merek);
        System.out.println("Daya yang diisi: "+ daya);
        System.out.println("Daya Baterai: "+baterai);
        System.out.println("Keterangan Baterai: "+keterangan);
    }
}
