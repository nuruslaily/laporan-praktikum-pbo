package sepedademo;

/**
 *
 * @author Nurus Laily
 */
public class SepedaMain {
    public static void main(String[] args){
        // Buat dua buah objek sepeda
        Sepeda spd1 = new Sepeda();
        Sepeda spd2 = new Sepeda();
        
        // PAnggil method didalam obek sepeda
        spd1.setMerek("Polygone");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.setWarna("Hitam");
        spd1.cetakStatus();
        
        spd2.setMerek("Wiim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.setWarna("Putih");
        spd2.cetakStatus();
        
    }
}
