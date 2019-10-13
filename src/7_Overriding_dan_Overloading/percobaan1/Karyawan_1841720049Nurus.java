package com.mycompany.praktikum4.overloadingoveridding.percobaan1;

/**
 *
 * @author Nurus Laily
 */
public class Karyawan_1841720049Nurus {
    private String mNama;
    private String mNip;
    private String mGolongan;
    private double mGaji;

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public void setmNip(String mNip) {
        this.mNip = mNip;
    }

    public void setmGolongan(String mGolongan) {
        this.mGolongan = mGolongan;
        
        switch(mGolongan.charAt(0)){
            case'1':this.mGaji=5000000;
            break;
            case'2':this.mGaji=3000000;
            break;
            case'3':this.mGaji=2000000;
            break;
            case'4':this.mGaji=1000000;
            break;
            case'5':this.mGaji=750000;
            break;
        }
    }

    public void setmGaji(double mGaji) {
        this.mGaji = mGaji;
    }

    public String getmNama() {
        return mNama;
    }

    public String getmNip() {
        return mNip;
    }

    public String getmGolongan() {
        return mGolongan;
    }

    public double getmGaji() {
        return mGaji;
    }
    
    
}
