package com.mycompany.percobaan2.relasi_kelas;

/**
 *
 * @author Nurus Laily
 */
public class Pelanggan1841720049Nurus {
    private String mNama;
    private Mobil1841720049Nurus mMobil;
    private Sopir1841720049Nurus mSopir;
    private int mHari;
    Pelanggan1841720049Nurus(){
        
    }

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public Mobil1841720049Nurus getmMobil() {
        return mMobil;
    }

    public void setmMobil(Mobil1841720049Nurus mMobil) {
        this.mMobil = mMobil;
    }

    public Sopir1841720049Nurus getmSopir() {
        return mSopir;
    }

    public void setmSopir(Sopir1841720049Nurus mSopir) {
        this.mSopir = mSopir;
    }

    public int getmHari() {
        return mHari;
    }

    public void setmHari(int mHari) {
        this.mHari = mHari;
    }
    public int hitungBiayaTotal(){
        return mMobil.hitungBiayaMobil(mHari)+mSopir.hitungBiayaSopir(mHari);
    }
}
