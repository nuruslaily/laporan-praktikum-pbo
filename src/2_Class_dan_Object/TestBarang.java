package minggu2;

/**
 *
 * @author Nurus Laily
 */
public class TestBarang {
    public static void main(String args[]){
        Barang1841720049Nurus brg1=new Barang1841720049Nurus();
        brg1.namaBrg="Pensil";
        brg1.jenisBrg="ATK";
        brg1.stok=10;
        brg1.tampilBarang();
        //menampilkan dan mengisi argumen untuk menambahkan stok barang
        System.out.println("Stok Baru adalah "+brg1.tambahStok(20));
    }
}
