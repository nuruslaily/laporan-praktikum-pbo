package backend1841720049Nurus;

import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author Nurus Laily
 */
public class Anggota1841720049Nurus {
    private int mIdAnggota;
    private String mNama;
    private String mAlamat;
    private String mTelepon;

    public int getmIdAnggota() {
        return mIdAnggota;
    }

    public void setmIdAnggota(int mIdAnggota) {
        this.mIdAnggota = mIdAnggota;
    }
    
    
    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public String getmAlamat() {
        return mAlamat;
    }

    public void setmAlamat(String mAlamat) {
        this.mAlamat = mAlamat;
    }

    public String getmTelepon() {
        return mTelepon;
    }

    public void setmTelepon(String mTelepon) {
        this.mTelepon = mTelepon;
    }

    
    public Anggota1841720049Nurus() {
    }

    public Anggota1841720049Nurus(String mNama, String mAlamat, String mTelepon) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mTelepon = mTelepon;
    }

   
    
    public Anggota1841720049Nurus getById(int id) {
        Anggota1841720049Nurus ang = new Anggota1841720049Nurus();
        ResultSet rs = DBHelper1841720049Nurus.selectQuery("SELECT * FROM anggota " + " WHERE idAnggota = '" + id + "'");

        try {
            while (rs.next()) {
                ang = new Anggota1841720049Nurus();
                ang.setmIdAnggota(rs.getInt("idAnggota"));
                ang.setmNama(rs.getString("nama"));
                ang.setmAlamat(rs.getString("alamat"));
                ang.setmTelepon(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ang;
    }

    public ArrayList<Anggota1841720049Nurus> getAll() {
        ArrayList<Anggota1841720049Nurus> ListAnggota = new ArrayList();

        ResultSet rs = DBHelper1841720049Nurus.selectQuery("SELECT * FROM anggota");

        try {
            while (rs.next()) {
                Anggota1841720049Nurus ang = new Anggota1841720049Nurus();
                ang.setmIdAnggota(rs.getInt("idAnggota"));
                ang.setmNama(rs.getString("nama"));
                ang.setmAlamat(rs.getString("alamat"));
                ang.setmTelepon(rs.getString("telepon"));

                ListAnggota.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListAnggota;
    }

    public ArrayList<Anggota1841720049Nurus> search(String keyword) {
        ArrayList<Anggota1841720049Nurus> ListAnggota = new ArrayList();

        String sql = "Select * from anggota where " + " nama like '%" + keyword + "%' " + " or alamat like '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720049Nurus.selectQuery(sql);

        try {
            while (rs.next()) {
                Anggota1841720049Nurus ang = new Anggota1841720049Nurus();
                ang.setmIdAnggota(rs.getInt("idAnggota"));
                ang.setmNama(rs.getString("nama"));
                ang.setmAlamat(rs.getString("alamat"));
                ang.setmTelepon(rs.getString("telepon"));

                ListAnggota.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListAnggota;
    }
    
    public void save(){
        if(getById(mIdAnggota).getmIdAnggota() == 0){
            String SQL = "Insert into anggota (nama,alamat,telepon) values(" 
                    + " '" +this.mNama + "', "
                    + " '" +this.mAlamat + "', "
                    + " '"+this.mTelepon+"' "
                    + " )";
                    this.mIdAnggota = DBHelper1841720049Nurus.insertQueryGetId(SQL);
        }else{
            String SQL = "Update anggota set"
                   + " nama = '" +this.mNama +"', "
                   + " alamat = '" +this.mAlamat +"', "
                   + " telepon = '"+this.mTelepon+"' "
                   +"Where idAnggota = '"+this.mIdAnggota+"'";
            DBHelper1841720049Nurus.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM anggota WHERE idAnggota = '"+this.mIdAnggota+"'";
        DBHelper1841720049Nurus.executeQuery(SQL);
    }
    
}
