package com.mycompany.praktikum4.overloadingoveridding.latihan;

/**
 *
 * @author Nurus Laily
 */
public class PerkalianKu1841720049Nurus {
    void perkalian(int a, int b){
        System.out.println(a * b);
    }
      
    void perkalian(int a, int b, int c){
        System.out.println(a * b * c);
    }
    public static void main(String[] args) {
        PerkalianKu1841720049Nurus objek = new PerkalianKu1841720049Nurus();
        
        objek.perkalian(25, 43);
        objek.perkalian(34, 23, 56);
    }

}
