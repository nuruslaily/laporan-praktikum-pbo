package com.mycompany.praktikum4.inheritance.percobaan6;

/**
 *
 * @author Nurus Laily
 */
public class Staff1841720049Nurus extends Karyawan1841720049Nurus{
    public int lembur, potongan;
    
    public Staff1841720049Nurus(){
        
    }
    public Staff1841720049Nurus(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan){
        super(nama,alamat,jk,umur,gaji);
        this.lembur=lembur;
        this.potongan=potongan;      
    }
    public void tampilDataStaff(){
        super.tampilDataKaryawan();
        System.out.println("Lembur           = "+lembur);
        System.out.println("Potongan         = "+potongan);
        System.out.println("Total Gaji       = "+(gaji+lembur-potongan));
    }
}
