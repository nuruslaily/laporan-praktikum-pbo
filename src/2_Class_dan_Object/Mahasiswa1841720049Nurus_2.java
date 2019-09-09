package minggu2;

/**
 *
 * @author Nurus Laily
 */
public class Mahasiswa1841720049Nurus_2 extends Mahasiswa1841720049Nurus{
    private String nohp;
    
    public void setNoHP(String newValue){
        nohp = newValue;
    }
    public void tampilBiodata(){
        super.tampilBiodata();
        System.out.println("No HP   : "+ nohp);
    }
    
}
