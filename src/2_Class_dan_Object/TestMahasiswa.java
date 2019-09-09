package minggu2;

/**
 *
 * @author Nurus Laily
 */
public class TestMahasiswa {
    public static void main(String args[]){
        Mahasiswa1841720049Nurus mhs1=new Mahasiswa1841720049Nurus();
        Mahasiswa1841720049Nurus mhs2=new Mahasiswa1841720049Nurus();
        Mahasiswa1841720049Nurus_2 mhs3=new Mahasiswa1841720049Nurus_2();
        
        mhs1.nim=101;
        mhs1.nama="Lestari";
        mhs1.alamat="Jl. Vinolia No 1A";
        mhs1.kelas="1A";
        mhs1.tampilBiodata();
        System.out.println();
        
        mhs2.nim=102;
        mhs2.nama="Nurus";
        mhs2.alamat="Jl. Ikan Tombro No 46B RT 04 RW 04";
        mhs2.kelas="1A";
        mhs2.kelas="2C";
        mhs2.tampilBiodata();
        System.out.println();
        
        mhs3.nim=103;
        mhs3.nama="Dinda";
        mhs3.alamat="Jl. Soekarno-Hatta Blok B-3B";
        mhs3.kelas="2D";
        mhs3.setNoHP("08816254736");
        mhs3.tampilBiodata();
    }
}
