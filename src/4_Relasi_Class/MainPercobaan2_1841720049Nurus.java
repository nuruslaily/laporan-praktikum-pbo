package com.mycompany.percobaan2.relasi_kelas;

/**
 *
 * @author Nurus Laily
 */
public class MainPercobaan2_1841720049Nurus {
    public static void main(String[] args) {
        Mobil1841720049Nurus m = new Mobil1841720049Nurus();
        m.setmNama("Avanza");
        m.setmBiaya(350000);
        Sopir1841720049Nurus s = new Sopir1841720049Nurus();
        s.setmNama("John Doe");
        s.setmBiaya(200000);
        Pelanggan1841720049Nurus p = new Pelanggan1841720049Nurus();
        p.setmNama("Jane Doe");
        p.setmMobil(m);
        p.setmSopir(s);
        p.setmHari(2);
        System.out.println("Biaya Total = " + p.hitungBiayaTotal());
    }
    
}
