package minggu2tugas;


/**
 *
 * @author Nurus Laily
 */
public class Lingkaran {
    public double phi=3.14;
    public double r;
    public double hitungLuas(double r){
        double hasil_L;
       return hasil_L = phi * r * r;
    }
    public double hitungKeliling(double r){
        double hasil_K;
        return hasil_K = 2 * phi * r;
    }
    public void tampilHasil(){
        System.out.println("Jari-jari       : "+r);
        System.out.println("Hasil Keliling  : "+hitungKeliling(r));
        System.out.println("Hasil Luas      : "+hitungLuas(r));
    }
}
