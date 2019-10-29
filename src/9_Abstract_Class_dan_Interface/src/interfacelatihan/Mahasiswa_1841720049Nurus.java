package interfacelatihan;

/**
 *
 * @author Nurus Laily
 */
public class Mahasiswa_1841720049Nurus implements ICumlaude_1841720049Nurus{
    protected String sNama;
    
    public Mahasiswa_1841720049Nurus(String nama)
    {
        this.sNama = nama;
    }

    public void kuliahDiKampusNurus()
    {
        System.out.println("Aku mahasiswa, namaku " + this.sNama);
        System.out.println("Aku berkuliah di kampus.");
    }

    @Override
    public void lulusNurus() {
        System.out.println("Aku mahasiswa, namaku " + this.sNama); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void meraihIPKTinggiNurus() {
        System.out.println("Aku berkuliah di kampus."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
