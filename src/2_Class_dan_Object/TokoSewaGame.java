package minggu2tugas;

/**
 *
 * @author Nurus Laily
 */
public class TokoSewaGame {
    public int id;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int lamaHari;
    public int peminjaman(int harga){
        return harga * 1;
    }
    public int hargaBayar(int lamaHari){
        return lamaHari * harga;
    }
    
    public void tampilTransaksi(){
        System.out.println("Id          : "+id);
        System.out.println("Nama Member : "+namaMember);
        System.out.println("Nama Game   : "+namaGame);
        System.out.println("Peminjaman  : "+peminjaman(harga));
        System.out.println("Harga Bayar : "+hargaBayar(lamaHari));
        
    }
}
