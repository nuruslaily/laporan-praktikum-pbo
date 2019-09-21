package com.mycompany.percobaan4.relasi_kelas;

/**
 *
 * @author Nurus Laily
 */
public class MainPercobaan4_1841720049Nurus {
    public static void main(String[] args) {
        Penumpang1841720049Nurus p = new Penumpang1841720049Nurus("12345", "Mr.Krab");
        Gerbong1841720049Nurus gerbong = new Gerbong1841720049Nurus("A", 10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());
    }
}
