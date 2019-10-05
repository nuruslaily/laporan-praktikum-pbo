package com.mycompany.praktikum4.inheritance.tugas;

/**
 *
 * @author Nurus Laily
 */
public class Inheritance2_1841720049Nurus {
    public static void main(String[] args) {
        //TODO code application logic here
        Mac1841720049Nurus M = new Mac1841720049Nurus("Apple MacBook Pro 13.3", 
                32, 16, "Intel Core i7", "Up to 10 hours wireless web", "MNQF2ID");
        M.tampilMac();
        
        Windows1841720049Nurus W = new Windows1841720049Nurus("Windows 10", 
                4, 2, "Intel Core i3", "BIOS", "Music,Video,Office2016");
        W.tampilWindows();
        
        Pc1841720049Nurus P = new Pc1841720049Nurus("HP Pavilion 20-r023L All in One",19,1,"19.45 inches",2);
        P.tampilPc();
    }
}
