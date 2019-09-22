package com.mycompany.percobaan4.relasi_kelas;

/**
 *
 * @author Nurus Laily
 */
public class Kursi1841720049Nurus {
    private String mNomer;
    private Penumpang1841720049Nurus mPenumpang;
    Kursi1841720049Nurus(String nomer){
        mNomer = nomer;
    }

    public String getmNomer() {
        return mNomer;
    }

    public void setmNomer(String mNomer) {
        this.mNomer = mNomer;
    }

    public Penumpang1841720049Nurus getmPenumpang() {
        return mPenumpang;
    }

    public void setmPenumpang(Penumpang1841720049Nurus mPenumpang) {
        this.mPenumpang = mPenumpang;
    }
    public String info() {
        String info = "";
        info += "Nomor: " + mNomer + "\n";
        if (this.mPenumpang != null) {
        info += "Penumpang: " + mPenumpang.info() + "\n";
        }
    return info;
    }
}
