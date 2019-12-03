package backend1841720049Nurus;

/**
 *
 * @author Nurus Laily
 */
import java.util.ArrayList;
import java.sql.*;
public class Buku1841720049Nurus {
    private int mIdbuku;
    private Kategori1841720049Nurus mKategori = new Kategori1841720049Nurus();
    private String mJudul;
    private String mPenerbit;
    private String mPenulis;

    public int getmIdbuku() {
        return mIdbuku;
    }

    public void setmIdbuku(int mIdbuku) {
        this.mIdbuku = mIdbuku;
    }

    public Kategori1841720049Nurus getmKategori() {
        return mKategori;
    }

    public void setmKategori(Kategori1841720049Nurus mKategori) {
        this.mKategori = mKategori;
    }

    public String getmJudul() {
        return mJudul;
    }

    public void setmJudul(String mJudul) {
        this.mJudul = mJudul;
    }

    public String getmPenerbit() {
        return mPenerbit;
    }

    public void setmPenerbit(String mPenerbit) {
        this.mPenerbit = mPenerbit;
    }

    public String getmPenulis() {
        return mPenulis;
    }

    public void setmPenulis(String mPenulis) {
        this.mPenulis = mPenulis;
    }
    
    public Buku1841720049Nurus() {
    
    }

    public Buku1841720049Nurus(Kategori1841720049Nurus mKategori, String mJudul, String mPenerbit, String mPenulis) {
        this.mKategori = mKategori;
        this.mJudul = mJudul;
        this.mPenerbit = mPenerbit;
        this.mPenulis = mPenulis;
    }
    
    public Buku1841720049Nurus getById(int id) {
        Buku1841720049Nurus buku = new Buku1841720049Nurus();
        ResultSet rs = DBHelper1841720049Nurus.selectQuery("SELECT "
                                            + " b.idbuku AS idbuku,"
                                            + " b.judul AS judul,"
                                            + " b.penerbit AS penerbit,"
                                            + " b.penulis AS penulis,"
                                            + " k.idkategori AS idkategori,"
                                            + " k.nama AS nama,"
                                            + " k.keterangan AS keterangan"
                                            + " FROM buku b"
                                            + " LEFT JOIN kategori k ON b.idkategori = k.idkategori"
                                            + " WHERE b.idbuku = '" + id + "'");
        try {
            while(rs.next()) {
                buku = new Buku1841720049Nurus();
                buku.setmIdbuku(rs.getInt("idbuku"));
                buku.getmKategori().setmIdkategori(rs.getInt("idkategori"));
                buku.getmKategori().setmNama(rs.getString("nama"));
                buku.getmKategori().setmKeterangan(rs.getString("keterangan"));
                buku.setmJudul(rs.getString("judul"));
                buku.setmPenerbit(rs.getString("penerbit"));
                buku.setmPenulis(rs.getString("penulis"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return buku;
    }
    
    public ArrayList<Buku1841720049Nurus> getAll() {
        ArrayList<Buku1841720049Nurus> ListBuku = new ArrayList();
        ResultSet rs = DBHelper1841720049Nurus.selectQuery("SELECT "
                                            + " b.idbuku AS idbuku,"
                                            + " b.judul AS judul,"
                                            + " b.penerbit AS penerbit,"
                                            + " b.penulis AS penulis,"
                                            + " k.idkategori AS idkategori,"
                                            + " k.nama AS nama,"
                                            + " k.keterangan AS keterangan"
                                            + " FROM buku b"
                                            + " LEFT JOIN kategori k ON b.idkategori = k.idkategori");
        try {
            while(rs.next()) {
                Buku1841720049Nurus buku = new Buku1841720049Nurus();
                buku.setmIdbuku(rs.getInt("idbuku"));
                buku.getmKategori().setmIdkategori(rs.getInt("idkategori"));
                buku.getmKategori().setmNama(rs.getString("nama"));
                buku.getmKategori().setmKeterangan(rs.getString("keterangan"));
                buku.setmJudul(rs.getString("judul"));
                buku.setmPenerbit(rs.getString("penerbit"));
                buku.setmPenulis(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    public ArrayList<Buku1841720049Nurus> search(String keyword) {
        ArrayList<Buku1841720049Nurus> ListBuku = new ArrayList();
        ResultSet rs = DBHelper1841720049Nurus.selectQuery("SELECT "
                                            + " b.idbuku AS idbuku,"
                                            + " b.judul AS judul,"
                                            + " b.penerbit AS penerbit,"
                                            + " b.penulis AS penulis,"
                                            + " k.idkategori AS idkategori,"
                                            + " k.nama AS nama,"
                                            + " k.keterangan AS keterangan"
                                            + " FROM buku b"
                                            + " LEFT JOIN kategori k ON b.idkategori = k.idkategori"
                                            + " WHERE b.judul LIKE '%" + keyword + "%'"
                                                    + " OR b.penerbit LIKE '%" + keyword + "%'"
                                                    + " OR b.penulis LIKE '%" + keyword + "%'");
        try {
            while(rs.next()) {
                Buku1841720049Nurus buku = new Buku1841720049Nurus();
                buku.setmIdbuku(rs.getInt("idbuku"));
                buku.getmKategori().setmIdkategori(rs.getInt("idkategori"));
                buku.getmKategori().setmNama(rs.getString("nama"));
                buku.getmKategori().setmKeterangan(rs.getString("keterangan"));
                buku.setmJudul(rs.getString("judul"));
                buku.setmPenerbit(rs.getString("penerbit"));
                buku.setmPenulis(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    public void save() {
        if(getById(mIdbuku).getmIdbuku() == 0) {
            String SQL = "INSERT INTO buku (judul, idkategori, penulis, penerbit) VALUES("
                        + "'" + this.mJudul + "', "
                        + "'" + this.getmKategori().getmIdkategori() + "', "
                        + "'" + this.mPenulis + "', "
                        + "'" + this.mPenerbit + "'"
                        + ")";
            this.mIdbuku = DBHelper1841720049Nurus.insertQueryGetId(SQL);
        }
        else {
            String SQL = "UPDATE buku SET"
                        + " judul = '" + this.mJudul + "', "
                        + " idkategori = '" + this.getmKategori().getmIdkategori() + "', "
                        + " penulis = '" + this.mPenulis + "', "
                        + " penerbit = '" + this.mPenerbit + "' "
                        + " WHERE idbuku = '" + this.mIdbuku + "'";
            DBHelper1841720049Nurus.executeQuery(SQL);
        }
    }
    
    public void delete() {
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.mIdbuku + "'";
        DBHelper1841720049Nurus.executeQuery(SQL);
    }

}
