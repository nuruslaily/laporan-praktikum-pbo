package com.mycompany.praktikum4.inheritance.percobaan6;

/**
 *
 * @author Nurus Laily
 */
public class StaffHarian1841720049Nurus extends Staff1841720049Nurus {
    public int jmlJamKerja;
    
    public StaffHarian1841720049Nurus(){
       
    }
    public StaffHarian1841720049Nurus(String nama, String alamat, String jk, 
            int umur, int gaji, int lembur, int potongan, int jmlJamKerja){
        super(nama,alamat,jk,umur,gaji,lembur,potongan);
        this.jmlJamKerja=jmlJamKerja;
    }
    public void tampilStaffHarian(){
        System.out.println("================Data Staff Harian===================");
        super.tampilDataStaff();
        System.out.println("Jumlah Jam Kerja = "+jmlJamKerja);
        System.out.println("Gaji Bersih      = "+(gaji*jmlJamKerja+lembur-potongan));
    }
}
