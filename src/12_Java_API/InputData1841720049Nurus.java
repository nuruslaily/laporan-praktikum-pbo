package nurus.percobaan4;
import java.util.ArrayList;
/**
 *
 * @author Nurus Laily
 */
public class InputData1841720049Nurus {
    ArrayList<Mahasiswa1841720049Nurus> ListMahasiswa;

    public InputData1841720049Nurus() {
    ListMahasiswa= new ArrayList();
    }
    public void isiData(String Nim, String Nama, String Alamat){
        Mahasiswa1841720049Nurus mhs = new Mahasiswa1841720049Nurus(Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }

    public ArrayList<Mahasiswa1841720049Nurus> getData() {
        return ListMahasiswa;
    }
    
}
