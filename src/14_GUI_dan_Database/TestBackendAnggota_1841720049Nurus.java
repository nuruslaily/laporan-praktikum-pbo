package frontend1841720049Nurus;

import backend1841720049Nurus.Anggota1841720049Nurus;

/**
 *
 * @author Nurus Laily
 */
public class TestBackendAnggota_1841720049Nurus {
    public static void main(String[] args) {
        Anggota1841720049Nurus ang1 = new Anggota1841720049Nurus("Nurus", "Malang", "08816254736");
        Anggota1841720049Nurus ang2 = new Anggota1841720049Nurus("Nining", "Palopo", "08980346258");
        Anggota1841720049Nurus ang3 = new Anggota1841720049Nurus("Bening", "Makassar", "08512345678");
        
        //test insert
        ang1.save();
        ang2.save();
        ang3.save();
        
        //test update
        ang2.setmAlamat("Sulawesi");
        ang2.save();
        
        //test delete
        ang3.delete();
        
        //tes select all
        for(Anggota1841720049Nurus k : new Anggota1841720049Nurus().getAll()){
            System.out.println("Nama: " + k.getmNama() + ", Alamat : " + k.getmAlamat() + ", Telepon : " + k.getmTelepon());
        }
        
        //test search
        for(Anggota1841720049Nurus a : new Anggota1841720049Nurus().search("Timur")){
            System.out.println("Nama: " + a.getmNama() + ", Alamat : " + a.getmAlamat() + ", Telepon : " + a.getmTelepon());
        }
    }
}
