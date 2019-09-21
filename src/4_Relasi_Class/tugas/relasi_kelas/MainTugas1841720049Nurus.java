package com.mycompany.tugas.relasi_kelas;

/**
 *
 * @author Nurus Laily
 */
public class MainTugas1841720049Nurus {
    public static void main(String[] args) {
        Studio1841720049Nurus s = new Studio1841720049Nurus("Milea", "Romance,Action", "2", "25A");
        Cemilan1841720049Nurus c = new Cemilan1841720049Nurus("popcorn","milo",30000);
        Pegawai1841720049Nurus p = new Pegawai1841720049Nurus("1841","Diana");
        Bioskop1841720049Nurus b = new Bioskop1841720049Nurus(s,25000,"Senin",c,p);
        b.biayaTotal();
        System.out.println(b.info());
    }
}
