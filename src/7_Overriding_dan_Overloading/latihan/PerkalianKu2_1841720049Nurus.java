package com.mycompany.praktikum4.overloadingoveridding.latihan;

/**
 *
 * @author Nurus Laily
 */
public class PerkalianKu2_1841720049Nurus {
    void perkalian(int a, int b){
        System.out.println(a * b);
    }
    
    void perkalian(double a, double b){
        System.out.println(a * b);
    }
    public static void main(String[] args) {
        
        PerkalianKu2_1841720049Nurus objek = new PerkalianKu2_1841720049Nurus();
        
        objek.perkalian(25, 43);
        objek.perkalian(34.56, 23.7);
    }
}
