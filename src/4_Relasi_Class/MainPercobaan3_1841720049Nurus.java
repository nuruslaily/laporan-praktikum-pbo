package com.mycompany.percobaan3.relasi_kelas;

/**
 *
 * @author Nurus Laily
 */
public class MainPercobaan3_1841720049Nurus {
    public static void main(String[] args) {
        Pegawai1841720049Nurus masinis = new Pegawai1841720049Nurus ("1234", "Spongebob Squarepants");
        Pegawai1841720049Nurus asisten = new Pegawai1841720049Nurus ("4567", "Patrick Star");
        KeretaApi1841720049Nurus keretaApi = new KeretaApi1841720049Nurus ("Gaya Baru", "Bisnis", masinis, asisten);
        System.out.println(keretaApi.info());
    }
}
