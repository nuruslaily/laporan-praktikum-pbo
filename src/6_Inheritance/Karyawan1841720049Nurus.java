package com.mycompany.praktikum4.inheritance.percobaan6;

/**
 *
 * @author Nurus Laily
 */
public class Karyawan1841720049Nurus {
   public String nama, alamat, jk;
   public int umur, gaji;
   public Karyawan1841720049Nurus(){
       
   }
   public Karyawan1841720049Nurus(String nama,String alamat, String jk, int umur, int gaji){
       this.nama=nama;
       this.alamat=alamat;
       this.jk=jk;
       this.umur=umur;
       this.gaji=gaji;
   }
   public void tampilDataKaryawan(){
       System.out.println("Nama             = " + nama);
       System.out.println("Alamat           = " + alamat);
       System.out.println("Jenis Kelamin    = " + jk);
       System.out.println("Umur             = " + umur);
       System.out.println("Gaji             = " + gaji);
   }
}
