package interfacelatihan;

/**
 *
 * @author Nurus Laily
 */
public class Program_1841720049Nurus {
    public static void main(String[] args) {
        
        Rektor_1841720049Nurus pakRektor = new Rektor_1841720049Nurus();
        
        //Mahasiswa_1841720049Nurus mahasiswaBiasa = new Mahasiswa_1841720049Nurus("Charlie");
        Sarjana_1841720049Nurus sarjanaCumlaude = new Sarjana_1841720049Nurus("Dini");
        PascaSarjana_1841720049Nurus masterCumlaude = new PascaSarjana_1841720049Nurus("Elok");

        //pakRektor.beriSertifikatCumlaude(mahasiswaBiasa);
        //pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        //pakRektor.beriSertifikatCumlaude(masterCumlaude);
        
        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapres(masterCumlaude);
    }
}
