package com.mycompany.praktikum4.inheritance.percobaan2;

/**
 *
 * @author Nurus Laily
 */
public class ClassB1841720049Nurus extends ClassA1841720049Nurus {
    public int z;

    public void setZ(int z) {
        this.z = z;
    }
    
    public void getNilaiZ(){
        System.out.println("nilai Z:"+ z);
    }
    public void getJumlah(){
        System.out.println("jumlah:"+ (x+y+z));
    } 
}
