package com.mycompany.percobaan4.relasi_kelas;

/**
 *
 * @author Nurus Laily
 */
public class Penumpang1841720049Nurus {
    private String mKtp;
    private String mNama;
    Penumpang1841720049Nurus(String ktp, String nama){
        mKtp = ktp;
        mNama = nama;
    }
    public void setmKtp(String mKtp) {
        this.mKtp = mKtp;
    }
    public String getmKtp() {
        return mKtp;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }
    public String getmNama() {
        return mNama;
    }
    public String info(){
        String info = " ";
        info += "Ktp: "+mKtp+"\n";
        info += "Nama: "+mNama+"\n";
        return info;
    }
}
