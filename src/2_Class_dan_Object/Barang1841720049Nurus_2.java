package minggu2tugas;

/**
 *
 * @author Nurus Laily
 */
public class Barang1841720049Nurus_2 {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
   
    public int hitungHargaJual(int hargaDasar){
        int hargaJual;
        return hargaJual=(int) (hargaDasar-((diskon/100*hargaDasar)));
    }
    public void tampilData(){
        System.out.println("Kode        = "+kode);
        System.out.println("Nama Barang = "+namaBarang);
        System.out.println("Harga Dasar = Rp."+hargaDasar);
        System.out.println("Diskon      = "+diskon+"%");
        System.out.println("Harga Jual  = "+hitungHargaJual(hargaDasar));
    }
}
