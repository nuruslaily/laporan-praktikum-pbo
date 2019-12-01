package backend1841720049Nurus;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author Nurus Laily
 */
public class Anggota1841720049Nurus {
    private int mIdanggota;
    private String mNama;
    private String mKeterangan;

    public Anggota1841720049Nurus() {
    }

    public Anggota1841720049Nurus(int mIdanggota, String mNama, String mKeterangan) {
        this.mIdanggota = mIdanggota;
        this.mNama = mNama;
        this.mKeterangan = mKeterangan;
    }

    public int getmIdanggota() {
        return mIdanggota;
    }

    public void setmIdanggota(int mIdanggota) {
        this.mIdanggota = mIdanggota;
    }

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public String getmKeterangan() {
        return mKeterangan;
    }

    public void setmKeterangan(String mKeterangan) {
        this.mKeterangan = mKeterangan;
    }
    public Anggota1841720049Nurus getById(int id){
        Anggota1841720049Nurus ang = new Anggota1841720049Nurus();
        ResultSet rs = DBHelper1841720049Nurus.selectQuery("SELECT * FROM "
                + "anggota "+ "WHERE idanggota = '"+id+"'");
        try
        {
            while(rs.next()){
                ang = new Anggota1841720049Nurus();
                ang.setmIdanggota(rs.getInt("idanggota"));
                ang.setmNama(rs.getString("nama"));
                ang.setmKeterangan(rs.getString("keterangan"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ang;
    }
    public ArrayList<Anggota1841720049Nurus> getAll(){
        ArrayList<Anggota1841720049Nurus> ListAnggota = new ArrayList();
        
        ResultSet rs = DBHelper1841720049Nurus.selectQuery("SELECT * FROM "
                + "");
        
        try{
            while(rs.next()){
                Anggota1841720049Nurus ang = new Anggota1841720049Nurus();
                ang.setmIdanggota(rs.getInt("idanggota"));
                ang.setmNama(rs.getString("nama"));
                ang.setmKeterangan(rs.getString("keterangan"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        return ListAnggota;
    }
    public ArrayList<Anggota1841720049Nurus> search(String keyword){
        ArrayList<Anggota1841720049Nurus> ListAnggota = new ArrayList();
        
        String sql = "SELECT * FROM anggota WHERE "
                  +"    nama LIKE '%"+ keyword + "%'"
                  +"    OR keterangan LIKE '%"+keyword+ "%' ";
        
        ResultSet rs = DBHelper1841720049Nurus.selectQuery(sql);
        
        try{
            while(rs.next()){
                Anggota1841720049Nurus ang = new Anggota1841720049Nurus();
                ang.setmIdanggota(rs.getInt("idanggota"));
                ang.setmNama(rs.getString("nama"));
                ang.setmKeterangan(rs.getString("keterangan"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        return ListAnggota;
            
        }
    public void save(){
        if(getById(mIdanggota).getmIdanggota() == 0){
            String SQL = "INSERT INTO anggota (nama, keterangan) VALUES("
                    + "     '"+ this.mNama + "', "
                    + "     '"+ this.mKeterangan + "' "
                    + "     )";
            this.mIdanggota = DBHelper1841720049Nurus.insertQueryGetId(SQL);
        }
        else{
            String SQL = "UPDATE anggota SET "
                    + "     nama = '"+this.mNama+"', "
                    + "     keterangan = '"+this.mKeterangan+"' "
                    + "     WHERE idanggota = '"+this.mIdanggota+"'";
            DBHelper1841720049Nurus.executeQuery(SQL);
        }
    }
    public void delete(){
        String SQL = "DELETE FROM anggota WHERE idanggota = '"
                +this.mIdanggota+"'";
        DBHelper1841720049Nurus.selectQuery(SQL);
    }
}
