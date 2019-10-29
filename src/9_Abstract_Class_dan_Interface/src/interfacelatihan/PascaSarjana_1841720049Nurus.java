package interfacelatihan;

/**
 *
 * @author Nurus Laily
 */
public class PascaSarjana_1841720049Nurus extends Mahasiswa_1841720049Nurus implements ICumlaude_1841720049Nurus,IBerprestasi_1841720049Nurus
{
    public PascaSarjana_1841720049Nurus(String nama)
    {
        super(nama);
    }
    
    @Override
    public void lulusNurus()
    {
        System.out.println("Aku sudah menyelesaikan TESIS");
    }
    
    @Override
    public void meraihIPKTinggiNurus()
    {
        System.out.println("IPK-ku lebih dari 3,71");
    }

    @Override
    public void menjuaraiKompetisiNurus() {
        System.out.println("Saya telah menjuarai kompetisi INTERNATIONAL"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void membuatPublikasiIlmiahNurus() {
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL"); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
