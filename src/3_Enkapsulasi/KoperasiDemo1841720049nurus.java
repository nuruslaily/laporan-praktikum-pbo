package koperasigettersetter1841720049nurus;

/**
 *
 * @author Nurus Laily
 */
public class KoperasiDemo1841720049nurus {
    public static void main(String[] args){
        Anggota1841720049nurus anggota1 = new Anggota1841720049nurus("Iwan","Jalan Mawar");
        System.out.println("Simpanan "+anggota1.getNamaNurus()+" : Rp "+anggota1.getSimpananNurus());
        
        anggota1.setNamaNurus("Iwan Setiawan");
        anggota1.setAlamatNurus("Jalan Sukarno Hatta no 10");
        anggota1.setorNurus(100000);
        System.out.println("Simpanan " +anggota1.getNamaNurus()+ " : Rp "+ anggota1.getSimpananNurus());
        
        anggota1.pinjamNurus(5000);
        System.out.println("Simpanan " +anggota1.getNamaNurus()+ " : Rp "+ anggota1.getSimpananNurus());
    }
}
