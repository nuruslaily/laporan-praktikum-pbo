package com.mycompany.percobaan3.relasi_kelas;

/**
 *
 * @author Nurus Laily
 */
public class KeretaApi1841720049Nurus {
    private String mNama;
    private String mKelas;
    private Pegawai1841720049Nurus mMasinis;
    private Pegawai1841720049Nurus mAsisten;
    KeretaApi1841720049Nurus(String nama, String kelas, Pegawai1841720049Nurus masinis){
        this.mNama = nama;
        this.mKelas = kelas;
        mMasinis = masinis;
    }
    KeretaApi1841720049Nurus(String nama, String kelas, Pegawai1841720049Nurus masinis, Pegawai1841720049Nurus asisten){
        this.mNama = nama;
        this.mKelas = kelas;
        mMasinis = masinis;
        mAsisten = asisten;
    }

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public String getmKelas() {
        return mKelas;
    }

    public void setmKelas(String mKelas) {
        this.mKelas = mKelas;
    }

    public Pegawai1841720049Nurus getmMasinis() {
        return mMasinis;
    }

    public void setmMasinis(Pegawai1841720049Nurus mMasinis) {
        this.mMasinis = mMasinis;
    }

    public Pegawai1841720049Nurus getmAsisten() {
        return mAsisten;
    }

    public void setmAsisten(Pegawai1841720049Nurus mAsisten) {
        this.mAsisten = mAsisten;
    }
    public String info(){
        String info = "";
        info += "Nama: " + this.mNama + "\n";
        info += "Kelas: " + this.mKelas + "\n";
        info += "Masinis: " + this.mMasinis.info() + "\n";
        info += "Asisten: " + this.mAsisten.info() + "\n";
        return info;
    }
}
