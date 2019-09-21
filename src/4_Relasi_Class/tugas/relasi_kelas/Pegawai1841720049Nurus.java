package com.mycompany.tugas.relasi_kelas;

/**
 *
 * @author Nurus Laily
 */
public class Pegawai1841720049Nurus {
    private String mNip;
    private String mNama;
    Pegawai1841720049Nurus(String nip, String nama){
        this.mNip = nip;
        this.mNama = nama;
    }

    public String getmNip() {
        return mNip;
    }

    public void setmNip(String mNip) {
        this.mNip = mNip;
    }

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }
    public String info(){
        String info = " ";
        info += "Nip: "+mNip+"\n";
        info += "Nama: "+mNama+"\n";
        return info;
    }
}
