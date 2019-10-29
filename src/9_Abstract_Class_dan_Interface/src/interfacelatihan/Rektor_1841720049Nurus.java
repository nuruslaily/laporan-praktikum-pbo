package interfacelatihan;

/**
 *
 * @author Nurus Laily
 */
public class Rektor_1841720049Nurus {

    
    public void beriSertifikatCumlaude(ICumlaude_1841720049Nurus mahasiswa)
    {
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! Bagaimana Anda bisa cumlaude?");
        
        mahasiswa.lulusNurus();
        mahasiswa.meraihIPKTinggiNurus();
        
        System.out.println("---------------------------------------------");
    }
    public void beriSertifikatMawapres(IBerprestasi_1841720049Nurus mahasiswa)
    {
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");
        
        mahasiswa.menjuaraiKompetisiNurus();
        mahasiswa.membuatPublikasiIlmiahNurus();
        
        System.out.println("---------------------------------------------");
    }
}
