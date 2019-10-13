package com.mycompany.praktikum4.overloadingoveridding.percobaan1;

/**
 *
 * @author Nurus Laily
 */
public class Manager_1841720049Nurus extends Karyawan_1841720049Nurus{
    private double mTunjangan;
    private String mBagian;
    private Staff_1841720049Nurus st[];

    public double getmTunjangan() {
        return mTunjangan;
    }

    public void setmTunjangan(double mTunjangan) {
        this.mTunjangan = mTunjangan;
    }

    public String getmBagian() {
        return mBagian;
    }

    public void setmBagian(String mBagian) {
        this.mBagian = mBagian;
    }

    public void setStaff(Staff_1841720049Nurus st[]){
        this.st=st;
    }
    public void viewStaff(){
        int i;
        System.out.println("--------------------------------");
        for(i=0;i<st.length;i++){
            st[i].lihatInfo();
        }
        System.out.println("--------------------------------");
    }
    public void lihatInfo(){
        System.out.println("Manager     :"+this.getmBagian());
        System.out.println("NIP         :"+this.getmNip());
        System.out.println("Nama        :"+this.getmNama());
        System.out.println("Golongan    :"+this.getmGolongan());
        System.out.printf("Tunjangan   :%.0f\n",this.getmTunjangan());
        System.out.printf("Gaji        :%.0f\n",this.getmGaji());
        System.out.println("Bagian      :"+this.getmBagian());
        this.viewStaff();
    }
    public double getGaji(){
        return super.getmGaji()+mTunjangan;
    }
}
