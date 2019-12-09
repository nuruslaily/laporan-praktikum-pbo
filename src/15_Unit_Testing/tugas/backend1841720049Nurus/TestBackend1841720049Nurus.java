package backend1841720049Nurus;

/**
 *
 * @author Nurus Laily
 */
import backend1841720049Nurus.Kategori1841720049Nurus;
public class TestBackend1841720049Nurus {
    public static void main(String[] args) {
        Kategori1841720049Nurus kat1 = new Kategori1841720049Nurus("Novel", "Koleksi buku novel");
        Kategori1841720049Nurus kat2 = new Kategori1841720049Nurus("Referensi", "Buku referensi ilmiah");
        Kategori1841720049Nurus kat3 = new Kategori1841720049Nurus("Komik", "Komik anak-anak");
        
        //test insert
        kat1.save();
        kat2.save();
        kat3.save();
        
        //test update
        kat2.setmKeterangan("Koleksi buku referensi ilmiah");
        kat2.save();
        
        //test delete
        kat3.delete();
        
        //test select all
        for(Kategori1841720049Nurus k : new Kategori1841720049Nurus().getAll()){
            System.out.println("Nama: "+k.getmNama()+", Ket: "+k.getmKeterangan());
        }
        
        //test search
        for(Kategori1841720049Nurus k : new Kategori1841720049Nurus().search("ilmiah")){
            System.out.println("Nama: "+k.getmNama()+", Ket: "+k.getmKeterangan());
        }
    }
}
