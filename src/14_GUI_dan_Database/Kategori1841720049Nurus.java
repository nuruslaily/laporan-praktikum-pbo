package backend1841720049Nurus;

/**
 *
 * @author Nurus Laily
 */
import java.util.ArrayList;
import java.sql.*;
public class Kategori1841720049Nurus {
    private int mIdkategori;
    private String mNama;
    private String mKeterangan;

    public int getmIdkategori() {
        return mIdkategori;
    }

    public void setmIdkategori(int mIdkategori) {
        this.mIdkategori = mIdkategori;
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

    
    public Kategori1841720049Nurus() {
    }

    public Kategori1841720049Nurus(String mNama, String mKeterangan) {
        this.mNama = mNama;
        this.mKeterangan = mKeterangan;
    }

    
    
    public Kategori1841720049Nurus getById(int id){
        Kategori1841720049Nurus kat = new Kategori1841720049Nurus();
        ResultSet rs = DBHelper1841720049Nurus.selectQuery("SELECT * FROM kategori "
                                            + " WHERE idkategori = '" + id + "'");
        
        try{
            while(rs.next()){
                kat = new Kategori1841720049Nurus();
                kat.setmIdkategori(rs.getInt("idkategori"));
                kat.setmNama(rs.getString("nama"));
                kat.setmKeterangan(rs.getString("keterangan"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        return kat;
    }
    
    public ArrayList<Kategori1841720049Nurus> getAll(){
        ArrayList<Kategori1841720049Nurus> ListKategori = new ArrayList();
        
        ResultSet rs = DBHelper1841720049Nurus.selectQuery("SELECT * FROM kategori");
        
        try{
            while(rs.next()){
                Kategori1841720049Nurus kat = new Kategori1841720049Nurus();
                kat.setmIdkategori(rs.getInt("idkategori"));
                kat.setmNama(rs.getString("nama"));
                kat.setmKeterangan(rs.getString("keterangan"));
                
                ListKategori.add(kat);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return ListKategori;
    }
    
    public ArrayList<Kategori1841720049Nurus> search(String keyword){
        ArrayList<Kategori1841720049Nurus> ListKategori = new ArrayList();
        
        String sql = "SELECT * FROM kategori WHERE "
                    + " nama LIKE '%" + keyword + "%' "
                    + " OR keterangan LIKE '%" + keyword + "%' ";
        
        ResultSet rs = DBHelper1841720049Nurus.selectQuery(sql);
        
        try{
            while(rs.next()){
                Kategori1841720049Nurus kat = new Kategori1841720049Nurus();
                kat.setmIdkategori(rs.getInt("idkategori"));
                kat.setmNama(rs.getString("nama"));
                kat.setmKeterangan(rs.getString("keterangan"));
                
                ListKategori.add(kat);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return ListKategori;
    }
    
    public void save(){
        if(getById(mIdkategori).getmIdkategori() == 0){
            String SQL = "INSERT INTO kategori (nama, keterangan) VALUES("
                    + " '" + this.mNama + "', "
                    + " '" + this.mKeterangan + "' "
                    + " )";
            this.mIdkategori = DBHelper1841720049Nurus.insertQueryGetId(SQL);
        }else{
            String SQL = "UPDATE kategori SET "
                    + " nama = '" + this.mNama + "', "
                    + " keterangan = '" +this.mKeterangan + "' "
                    + " WHERE idkategori = '" + this.mIdkategori + "'";
            DBHelper1841720049Nurus.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM kategori WHERE idkategori = '" + this.mIdkategori + "'";
        DBHelper1841720049Nurus.executeQuery(SQL);
    }
    
}
