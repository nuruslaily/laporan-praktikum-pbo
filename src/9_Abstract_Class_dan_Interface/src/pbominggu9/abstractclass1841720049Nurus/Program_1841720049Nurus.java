package pbominggu9.abstractclass1841720049Nurus;

/**
 *
 * @author Nurus Laily
 */
public class Program_1841720049Nurus {
    public static void main(String[] args) {
        Kucing_1841720049Nurus kucingKampung = new Kucing_1841720049Nurus();
        Ikan_1841720049Nurus lumbaLumba = new Ikan_1841720049Nurus();
        
        Orang_1841720049Nurus ani = new Orang_1841720049Nurus("Ani");
        Orang_1841720049Nurus budi = new Orang_1841720049Nurus("Budi");
        
        ani.peliharaHewanNurus(kucingKampung);
        budi.peliharaHewanNurus(lumbaLumba);
        
        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}
