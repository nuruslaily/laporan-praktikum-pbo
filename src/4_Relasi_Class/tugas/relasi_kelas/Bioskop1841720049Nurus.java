package com.mycompany.tugas.relasi_kelas;

/**
 *
 * @author Nurus Laily
 */
public class Bioskop1841720049Nurus {
    private Studio1841720049Nurus mStudio;
    private int mBiaya;
    private String mHari;
    private Cemilan1841720049Nurus mCemilan;
    private Pegawai1841720049Nurus mPegawai;
    public Bioskop1841720049Nurus(Studio1841720049Nurus studio, int biaya, String hari, Cemilan1841720049Nurus cemilan,Pegawai1841720049Nurus pegawai){
        this.mStudio = studio;
        this.mBiaya = biaya;
        this.mHari = hari;
        this.mCemilan = cemilan;
        this.mPegawai = pegawai; 
    }

    public Studio1841720049Nurus getmStudio() {
        return mStudio;
    }

    public void setmStudio(Studio1841720049Nurus mStudio) {
        this.mStudio = mStudio;
    }

    public int getmBiaya() {
        return mBiaya;
    }

    public void setmBiaya(int mBiaya) {
        this.mBiaya = mBiaya;
    }

    public String getmHari() {
        return mHari;
    }

    public void setmHari(String mHari) {
        this.mHari = mHari;
    }

    public Cemilan1841720049Nurus getCemilan() {
        return mCemilan;
    }

    public void setCemilan(Cemilan1841720049Nurus cemilan) {
        this.mCemilan = cemilan;
    }

    public Pegawai1841720049Nurus getmPegawai() {
        return mPegawai;
    }

    public void setmPegawai(Pegawai1841720049Nurus mPegawai) {
        this.mPegawai = mPegawai;
    }
    public int biayaTotal(){
        return mCemilan.hitungBiaya()+mBiaya;
    }
    public String info(){
        String info = "";
        info += "Studio: "+mStudio.info()+"\n";
        info += "Hari: "+mHari+"\n";
        info += "Biaya: "+mBiaya+"\n";
        info += "Cemilan: "+mCemilan.info()+"\n";
        info += "Kasir: "+mPegawai.info()+"\n";
        info += "Biaya Total: "+biayaTotal()+"\n";
        return info;
    }
}
