package koperasigettersetter1841720049nurus;
/**
 *
 * @author Nurus Laily
 */
public class Anggota1841720049nurus {
    private String mNama;
    private String mAlamat;
    private float mSimpanan;
    
    Anggota1841720049nurus(String nama, String alamat){
        this.mNama = nama;
        this.mAlamat = alamat;
        this.mSimpanan = 0;
    }
    public void setNamaNurus(String nama){
        this.mNama = nama;
    }
    public void setAlamatNurus(String alamat){
        this.mAlamat = alamat;
    }
    public String getNamaNurus(){
        return mNama;
    }
    public String getAlamatNurus(){
        return mAlamat;
    }
    public float getSimpananNurus(){
        return mSimpanan;
    }
    public void setorNurus(float uang){
        mSimpanan +=uang;
    }
    public void pinjamNurus(float uang){
        mSimpanan -= uang;
    }
}
