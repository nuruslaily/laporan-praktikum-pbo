package com.mycompany.percobaan2.relasi_kelas;

/**
 *
 * @author Nurus Laily
 */
public class Mobil1841720049Nurus {
    private String mNamaMerk;
    private int mBiaya;
    Mobil1841720049Nurus(){
        
    }

    public String getmNama() {
        return mNamaMerk;
    }

    public void setmNama(String mNama) {
        this.mNamaMerk = mNama;
    }

    public int getmBiaya() {
        return mBiaya;
    }

    public void setmBiaya(int mBiaya) {
        this.mBiaya = mBiaya;
    }
    public int hitungBiayaMobil(int hari){
        return mBiaya * hari;
    }
}
