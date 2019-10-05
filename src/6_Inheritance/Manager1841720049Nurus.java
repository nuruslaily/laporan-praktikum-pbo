package com.mycompany.praktikum4.inheritance.percobaan6;

/**
 *
 * @author Nurus Laily
 */
public class Manager1841720049Nurus extends Karyawan1841720049Nurus{
    public int tunjangan;
    public Manager1841720049Nurus(){
        
    }
    public void tampilDataManager(){
        super.tampilDataKaryawan();
        System.out.println("Tunjangan        = "+tunjangan);
        System.out.println("Total Gaji       = "+(super.gaji+tunjangan));
    }
}
