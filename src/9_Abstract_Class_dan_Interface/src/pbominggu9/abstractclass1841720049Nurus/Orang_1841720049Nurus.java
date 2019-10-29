package pbominggu9.abstractclass1841720049Nurus;

/**
 *
 * @author Nurus Laily
 */
public class Orang_1841720049Nurus {
    private String mNama;
    private Hewan_1841720049Nurus mHewanPeliharaan;
    
    public Orang_1841720049Nurus(String nama)
    {
        this.mNama = nama;
    }
    
    public void peliharaHewanNurus(Hewan_1841720049Nurus hewanPeliharaan)
    {
        this.mHewanPeliharaan = hewanPeliharaan;
    }
    
    public void ajakPeliharaanJalanJalan()
    {
        System.out.println("Namaku " + this.mNama);
        System.out.println("Hewan peliharaanku berjalan dengan cara: ");
        this.mHewanPeliharaan.bergerakNurus();
        System.out.println("-----------------------------------------");
    }
}
