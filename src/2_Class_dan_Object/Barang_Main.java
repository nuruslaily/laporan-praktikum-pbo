package minggu2tugas;

/**
 *
 * @author Nurus Laily
 */
public class Barang_Main {
    public static void main(String args[]){
        Barang1841720049Nurus_2 brg = new Barang1841720049Nurus_2();
        brg.kode="111";
        brg.namaBarang="Tas Ransel";
        brg.hargaDasar=75000;
        brg.diskon=20;
        brg.tampilData();
        System.out.println();
        
        brg.kode="115";
        brg.namaBarang="Sepatu";
        brg.hargaDasar=100000;
        brg.diskon=30;
        brg.tampilData(); 
                
    }
}
