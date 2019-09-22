package com.mycompany.percobaan4.relasi_kelas;

/**
 *
 * @author Nurus Laily
 */
public class Gerbong1841720049Nurus {
    private String mKode;
    private Kursi1841720049Nurus [] mArrayKursi;
    Gerbong1841720049Nurus(String kode, int jumlah) {
        this.mKode = kode;
        this.mArrayKursi = new Kursi1841720049Nurus[jumlah];
        this.initKursi();
}
    private void initKursi(){
        for(int i = 0; i<mArrayKursi.length; i++){
            this.mArrayKursi[i] = new Kursi1841720049Nurus(String.valueOf(i+1));
        }
    }

    public String getmKode() {
        return mKode;
    }

    public void setmKode(String mKode) {
        this.mKode = mKode;
    }

    public Kursi1841720049Nurus[] getmArrayKursi() {
        return mArrayKursi;
    }

    public void setmArrayKursi(Kursi1841720049Nurus[] mArrayKursi) {
        this.mArrayKursi = mArrayKursi;
    }
    
    public void setPenumpang(Penumpang1841720049Nurus penumpang, int nomor){
        this.mArrayKursi[nomor - 1].setmPenumpang(penumpang);
    }
    public String info(){
        String info = "";
        info += "Kode: "+mKode+"\n";
        for(Kursi1841720049Nurus kursi : mArrayKursi){
            info += kursi.info();
        }
        return info;
    }
}
