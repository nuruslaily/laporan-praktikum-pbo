package com.mycompany.praktikum4.overloadingoveridding.percobaan1;

/**
 *
 * @author Nurus Laily
 */
public class Staff_1841720049Nurus extends Karyawan_1841720049Nurus{
    private int mLembur;
    private double mGajiLembur;

    public int getmLembur() {
        return mLembur;
    }

    public void setmLembur(int mLembur) {
        this.mLembur = mLembur;
    }

    public double getmGajiLembur() {
        return mGajiLembur;
    }

    public void setmGajiLembur(double mGajiLembur) {
        this.mGajiLembur = mGajiLembur;
    }

    
    public double getGaji(int lembur, double gajiLembur){
        return super.getmGaji()+mLembur*mGajiLembur;
    }
    public double getGaji(){
        return super.getmGaji()+mLembur*mGajiLembur;
    }
    public void lihatInfo(){
        System.out.println("NIP         :"+this.getmNip());
        System.out.println("Nama        :"+this.getmNama());
        System.out.println("Golongan    :"+this.getmGolongan());
        System.out.println("Jml Lembur  :"+this.getmLembur());
        System.out.printf("Gaji Lembur :%.0f\n", this.mGajiLembur);
        System.out.printf("Gaji        :%.0f\n",this.getGaji());
    }
    
}
