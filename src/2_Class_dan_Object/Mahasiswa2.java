package minggu2;

/**
 *
 * @author Nurus Laily
 */
public class Mahasiswa2 extends Mahasiswa{
    private String nohp;
    
    public void setNoHP(String newValue){
        nohp = newValue;
    }
    public void tampilBiodata(){
        super.tampilBiodata();
        System.out.println("No HP   : "+ nohp);
    }
    
}
