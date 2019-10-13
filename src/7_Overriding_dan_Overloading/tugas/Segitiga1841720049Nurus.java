package com.mycompany.praktikum4.overloadingoveridding.tugas;

/**
 *
 * @author Nurus Laily
 */
public class Segitiga1841720049Nurus {
    private int mSudut;
    public int totalSudut(int sudutA){
        return mSudut = 180 - sudutA;
    }
    public int totalSudut(int sudutA, int sudutB){
        return mSudut = 180 - (sudutA + sudutB);
    }
    public int keliling(int sisiA, int sisiB, int sisiC){
        return sisiA + sisiB + sisiC;
    }
   public double keliling(double sisiA, double sisiB){
        double c = Math.sqrt(Math.pow(sisiA,2)+Math.pow(sisiB,2));
        return c;
    }
    public static void main(String[] args) {
        Segitiga1841720049Nurus s = new Segitiga1841720049Nurus();
        System.out.println("Keliling segitiga pertama (sisi a,b,c) = "+s.keliling(10, 20, 30));
        System.out.println("Total Sudut segitiga pertama (sudut a)= "+s.totalSudut(30));
        System.out.println("Total Sudut Segitiga Kedua (sudut a&b)= "+s.totalSudut(15, 15));
        System.out.println("Keliling segitiga kedua (sudut c) = "+s.keliling(3, 3));
    }
}
