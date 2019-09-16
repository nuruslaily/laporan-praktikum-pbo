package minggu3;
import java.util.Scanner;
/**
 *
 * @author Nurus Laily
 */
public class TestKoperasi1841720049nurus {
   public static void main(String [] args) {
       Scanner sc = new Scanner(System.in);
       Anggota1841720049nurus_2 donny = new Anggota1841720049nurus_2(111333444, "Donny", 5000000);
       
       System.out.println("Nama Anggota: "+donny.getNamaNurus());
       System.out.println("Limit Pinjaman: "+ donny.getLimitPeminjamanNurus());
       
       System.out.print("\nMasukkan nominal jumlah pinjaman !");
       int jml = sc.nextInt();
       donny.pinjamNurus(jml);
       System.out.println("Jumlah pinjaman saat ini: "+donny.getJumlahPinjamanNurus());
       
       System.out.print("\nMasukkan nominal bayar angsuran !");
       int asr = sc.nextInt();
       donny.angsurNurus(asr);
       System.out.println("Anda membayar angsuran sebesar "+asr);
       System.out.println("Jumlah pinjaman saat ini: "+donny.getJumlahPinjamanNurus());
       
   }
}

