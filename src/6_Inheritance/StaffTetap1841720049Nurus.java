package com.mycompany.praktikum4.inheritance.percobaan6;

/**
 *
 * @author Nurus Laily
 */
public class StaffTetap1841720049Nurus extends Staff1841720049Nurus{
    public String golongan;
    public int asuransi;
    
    public StaffTetap1841720049Nurus(){
        
    }
    public StaffTetap1841720049Nurus(String nama, String alamat, String jk, 
            int umur, int gaji, int lembur, int potongan, String golongan, int asuransi){
        super(nama,alamat,jk,umur,gaji,potongan,lembur);
        this.golongan=golongan;
        this.asuransi=asuransi;
        
    }
    public void tampilStaffTetap(){
        System.out.println("================Data Staff Tetap=================");
        super.tampilDataStaff();
        System.out.println("Golongan         = "+golongan);
        System.out.println("Jumlah Asuransi  = "+asuransi);
        System.out.println("Gaji Bersih      = "+(gaji+lembur-potongan-asuransi));
    }
}
