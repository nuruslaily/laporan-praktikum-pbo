package com.mycompany.tugas.relasi_kelas;

/**
 *
 * @author Nurus Laily
 */
public class Cemilan1841720049Nurus {
    private String mMakanan;
    private String mMinuman;
    private int mBiaya2;
    Cemilan1841720049Nurus (){
        
    }
    Cemilan1841720049Nurus(String makanan, String minuman, int biaya){
        this.mMakanan = makanan;
        this.mMinuman = minuman;
        this.mBiaya2 = biaya;
    }

    public String getmMakanan() {
        return mMakanan;
    }

    public void setmMakanan(String mMakanan) {
        this.mMakanan = mMakanan;
    }

    public String getmMinuman() {
        return mMinuman;
    }

    public void setmMinuman(String mMinuman) {
        this.mMinuman = mMinuman;
    }

    public int getmBiaya() {
        return mBiaya2;
    }

    public void setmBiaya(int mBiaya) {
        this.mBiaya2 = mBiaya;
    }
    public int hitungBiaya(){
        return mBiaya2;
    }
    public String info(){
        String info = " ";
        info += "Makanan: "+mMakanan+"\n";
        info += "Minuman: "+mMinuman+"\n";
        info += "Biaya  : "+hitungBiaya()+"\n";
        return info;
    }
}
