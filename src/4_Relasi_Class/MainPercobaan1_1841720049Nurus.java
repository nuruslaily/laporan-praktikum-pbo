package com.mycompany.percobaan1.relasi_kelas;

/**
 *
 * @author Nurus Laily
 */
public class MainPercobaan1_1841720049Nurus {
    public static void main(String[]args){
        Processor1841720049Nurus p =new Processor1841720049Nurus("Intel i5", 3);
        Laptop1841720049Nurus L = new Laptop1841720049Nurus("Thinkpad", p);
        L.info();
        Processor1841720049Nurus p1 = new Processor1841720049Nurus();
        p1.setmMerk("Intel i5");
        p1.setmCache(4);
        Laptop1841720049Nurus L1 = new Laptop1841720049Nurus();
        L1.setmMerk("Thinkpad");
        L1.setmProc(p1);
        L1.info();
   
    }
}
