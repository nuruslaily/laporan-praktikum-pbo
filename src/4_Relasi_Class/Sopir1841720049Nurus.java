package com.mycompany.percobaan2.relasi_kelas;

/**
 *
 * @author Nurus Laily
 */
public class Sopir1841720049Nurus {
    private String mNama;
    private int mBiaya;
    Sopir1841720049Nurus(){
        
    }

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public int getmBiaya() {
        return mBiaya;
    }

    public void setmBiaya(int mBiaya) {
        this.mBiaya = mBiaya;
    }
    
    public int hitungBiayaSopir(int hari){
        return mBiaya * hari;
    }
}
