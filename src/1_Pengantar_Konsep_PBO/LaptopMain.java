package laptopdemo;

/**
 *
 * @author Nurus Laily
 */
public class LaptopMain {
    public static void main(String[] args){
        // Buat dua buah objek laptop
        Laptop ltp1 = new Laptop();
        Laptop ltp2 = new Laptop();
        LaptopGaming ltp3 = new LaptopGaming();
        
        // Panggil method didalam objek laptop
        ltp1.setMerek("Asus");
        ltp1.tambahDaya(40);
        ltp1.dayaBaterai(60);
        ltp1.setKeterangan("Drop");
        ltp1.cetakStatus();
        
        ltp2.setMerek("Acer");
        ltp2.tambahDaya(30);
        ltp2.dayaBaterai(100);
        ltp2.berhenti(10);
        ltp2.tambahDaya(60);
        ltp2.setKeterangan("Normal");
        ltp2.cetakStatus();
        
        ltp3.setMerek("Toshiba");
        ltp2.setKeterangan("Normal");
        ltp3.tambahDaya(10);
        ltp3.dayaBaterai(80);
        ltp3.setTipeVGA("AMD");
        ltp3.cetakStatus();
        
    }
}
