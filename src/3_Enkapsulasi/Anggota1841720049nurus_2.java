package minggu3;

/**
 *
 * @author Nurus Laily
 */
public class Anggota1841720049nurus_2 {
    private int mNomorKTP;
    private String mNama;
    private int mLimitPeminjaman;
    private int mJumlahPinjaman;
    
    Anggota1841720049nurus_2(int nmrktp, String nama, int limitpnjmn){
        this.mNomorKTP = nmrktp;
        this.mNama = nama; 
        this.mLimitPeminjaman = limitpnjmn;
        this.mJumlahPinjaman = 0;
    }
    public int getKTPNurus() {
    return mNomorKTP;
    }
    public String getNamaNurus() {
    return mNama;
    }
    public int getLimitPeminjamanNurus() {
    return mLimitPeminjaman;
    }
    public int getJumlahPinjamanNurus() {
    return mJumlahPinjaman;
    }
    public int pinjamNurus(int uangPinjam){
        if(uangPinjam >= mLimitPeminjaman){
            mLimitPeminjaman = mLimitPeminjaman-(uangPinjam*10/100);
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
        else{
            mJumlahPinjaman += uangPinjam;
        }
        return uangPinjam;
    }
    public int angsurNurus(int uangPinjam){
       return mJumlahPinjaman -= uangPinjam;
    }
    
}
