package backend1841720049Nurus;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Nurus Laily
 */
public class Peminjaman1841720049Nurus {
    private int idpeminjaman;
    private Anggota1841720049Nurus anggota = new Anggota1841720049Nurus();
    private Buku1841720049Nurus buku = new Buku1841720049Nurus();
    private String tanggalpinjam;
    private String tanggalkembali;

    public Peminjaman1841720049Nurus() {
    }

    public Peminjaman1841720049Nurus(Anggota1841720049Nurus anggota, Buku1841720049Nurus buku, String tanggalpinjam, String tanggalkembali) {        
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalpinjam = tanggalpinjam;
        this.tanggalkembali = tanggalkembali;
    }    

    public int getIdpeminjaman() {
        return idpeminjaman;
    }

    public void setIdpeminjaman(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }

    public Anggota1841720049Nurus getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota1841720049Nurus anggota) {
        this.anggota = anggota;
    }

    public Buku1841720049Nurus getBuku() {
        return buku;
    }

    public void setBuku(Buku1841720049Nurus buku) {
        this.buku = buku;
    }

    public String getTanggalpinjam() {
        return tanggalpinjam;
    }

    public void setTanggalpinjam(String tanggalpinjam) {
        this.tanggalpinjam = tanggalpinjam;
    }

    public String getTanggalkembali() {
        return tanggalkembali;
    }

    public void setTanggalkembali(String tanggalkembali) {
        this.tanggalkembali = tanggalkembali;
    }

    
    
    public Peminjaman1841720049Nurus getById(int id){
        Peminjaman1841720049Nurus peminjaman = new Peminjaman1841720049Nurus();
        ResultSet rs = DBHelper1841720049Nurus.selectQuery("SELECT "
                                        +"      p.idpeminjaman AS idpeminjaman, "
                                        +"      p.tanggalpinjam AS tanggalpinjam, "
                                        +"      p.tanggalkembali AS tanggalkembali, "
                                        +"      b.idbuku AS idbuku, "
                                        +"      b.judul AS judul, "
                                        +"      b.penerbit AS penerbit, "
                                        +"      b.penulis AS penulis, "
                                        +"      k.idkategori AS idkategori, "
                                        +"      k.nama AS nama_kategori, "
                                        +"      k.keterangan AS keterangan, "
                                        +"      a.idanggota AS idanggota, "
                                        +"      a.nama AS nama_anggota, "
                                        +"      a.alamat AS alamat, "
                                        +"      a.telepon AS telepon"
                                        +"      FROM peminjaman p"
                                        +"      LEFT JOIN buku b ON p.idbuku = b.idbuku "
                                        +"      LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                                        +"      LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                                        +"      WHERE p.idpeminjaman = '"+ id + "'");
        try {
            while(rs.next()){
                peminjaman = new Peminjaman1841720049Nurus();
                peminjaman.setIdpeminjaman(rs.getInt("idbuku"));
                peminjaman.getAnggota().setmIdAnggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setmNama(rs.getString("nama_anggota"));
                peminjaman.getAnggota().setmAlamat(rs.getString("alamat"));
                peminjaman.getAnggota().setmTelepon(rs.getString("telepon"));
                peminjaman.getBuku().setmIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().getmKategori().setmIdkategori(rs.getInt("idkategori"));
                peminjaman.getBuku().getmKategori().setmNama(rs.getString("nama_kategori"));
                peminjaman.getBuku().getmKategori().setmKeterangan(rs.getString("keterangan"));
                peminjaman.getBuku().setmJudul(rs.getString("judul"));
                peminjaman.getBuku().setmPenerbit(rs.getString("penerbit"));
                peminjaman.getBuku().setmPenulis(rs.getString("penulis"));
                peminjaman.setTanggalpinjam(rs.getDate("tanggalpinjam").toString());
                peminjaman.setTanggalkembali(rs.getDate("tanggalkembali").toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return peminjaman;
    }
    
    public ArrayList<Peminjaman1841720049Nurus> getAll(){
        ArrayList<Peminjaman1841720049Nurus> ListPeminjaman = new ArrayList();
        ResultSet rs = DBHelper1841720049Nurus.selectQuery("SELECT "
                                        +"      p.idpeminjaman AS idpeminjaman, "
                                        +"      p.tanggalpinjam AS tanggalpinjam, "
                                        +"      p.tanggalkembali AS tanggalkembali, "
                                        +"      b.idbuku AS idbuku, "
                                        +"      b.judul AS judul, "
                                        +"      b.penerbit AS penerbit, "
                                        +"      b.penulis AS penulis, "
                                        +"      k.idkategori AS idkategori, "
                                        +"      k.nama AS nama_kategori, "
                                        +"      k.keterangan AS keterangan, "
                                        +"      a.idanggota AS idanggota, "
                                        +"      a.nama AS nama_anggota, "
                                        +"      a.alamat AS alamat, "
                                        +"      a.telepon AS telepon"
                                        +"      FROM peminjaman p"
                                        +"      LEFT JOIN buku b ON p.idbuku = b.idbuku "
                                        +"      LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                                        +"      LEFT JOIN anggota a ON p.idanggota = a.idanggota ");
        
        try {
            while(rs.next()){
                Peminjaman1841720049Nurus peminjaman = new Peminjaman1841720049Nurus();
                peminjaman.setIdpeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setmIdAnggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setmNama(rs.getString("nama_anggota"));
                peminjaman.getAnggota().setmAlamat(rs.getString("alamat"));
                peminjaman.getAnggota().setmTelepon(rs.getString("telepon"));
                peminjaman.getBuku().setmIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().getmKategori().setmIdkategori(rs.getInt("idkategori"));
                peminjaman.getBuku().getmKategori().setmNama(rs.getString("nama_kategori"));
                peminjaman.getBuku().getmKategori().setmKeterangan(rs.getString("keterangan"));
                peminjaman.getBuku().setmJudul(rs.getString("judul"));
                peminjaman.getBuku().setmPenerbit(rs.getString("penerbit"));
                peminjaman.getBuku().setmPenulis(rs.getString("penulis"));
                peminjaman.setTanggalpinjam(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalkembali(rs.getString("tanggalkembali"));
                
                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ListPeminjaman;
    }
    
    public ArrayList<Peminjaman1841720049Nurus> search(String keyword){
        ArrayList<Peminjaman1841720049Nurus> ListPeminjaman = new ArrayList();
        ResultSet rs = DBHelper1841720049Nurus.selectQuery("SELECT "
                                        +"      p.idpeminjaman AS idpeminjaman, "
                                        +"      p.tanggalpinjam AS tanggalpinjam, "
                                        +"      p.tanggalkembali AS tanggalkembali, "
                                        +"      b.idbuku AS idbuku, "
                                        +"      b.judul AS judul, "
                                        +"      b.penerbit AS penerbit, "
                                        +"      b.penulis AS penulis, "
                                        +"      k.idkategori AS idkategori, "
                                        +"      k.nama AS nama_kategori, "
                                        +"      k.keterangan AS keterangan, "
                                        +"      a.idanggota AS idanggota, "
                                        +"      a.nama AS nama_anggota, "
                                        +"      a.alamat AS alamat, "
                                        +"      a.telepon AS telepon"
                                        +"      FROM peminjaman p"
                                        +"      LEFT JOIN buku b ON p.idbuku = b.idbuku "
                                        +"      LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                                        +"      LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                                        +"      WHERE p.tanggalpinjam LIKE '%" + keyword + "%' "
                                        +"          OR p.tanggalkembali LIKE '%" + keyword + "%' ");
        
        try {
            while(rs.next()){
                Peminjaman1841720049Nurus peminjaman = new Peminjaman1841720049Nurus();
                peminjaman.setIdpeminjaman(rs.getInt("idbuku"));
                peminjaman.getAnggota().setmIdAnggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setmNama(rs.getString("nama_anggota"));
                peminjaman.getAnggota().setmAlamat(rs.getString("alamat"));
                peminjaman.getAnggota().setmTelepon(rs.getString("telepon"));
                peminjaman.getBuku().setmIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().getmKategori().setmIdkategori(rs.getInt("idkategori"));
                peminjaman.getBuku().getmKategori().setmNama(rs.getString("nama_kategori"));
                peminjaman.getBuku().getmKategori().setmKeterangan(rs.getString("keterangan"));
                peminjaman.getBuku().setmJudul(rs.getString("judul"));
                peminjaman.getBuku().setmPenerbit(rs.getString("penerbit"));
                peminjaman.getBuku().setmPenulis(rs.getString("penulis"));
                peminjaman.setTanggalpinjam(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalkembali(rs.getString("tanggalkembali"));
                
                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ListPeminjaman;
    }
    
    public void save(){
        if(getById(idpeminjaman).getIdpeminjaman()== 0){
            String SQL = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) VALUES("
                    +"      '"+ this.getAnggota().getmIdAnggota()+"', "
                    +"      '"+ this.getBuku().getmIdbuku()+"', "
                    +"      '"+ this.tanggalpinjam + "', "
                    +"      '"+ this.tanggalkembali + "' "
                    +"      )";
            this.idpeminjaman = DBHelper1841720049Nurus.insertQueryGetId(SQL);
            
        } else {
            String SQL = "UPDATE peminjaman SET "
                    +"      idanggota = '"+ this.getAnggota().getmIdAnggota() + "', "
                    +"      idbuku = '"+ this.getBuku().getmIdbuku()+"', "
                    +"      tanggalpinjam = '"+ this.tanggalpinjam +"', "
                    +"      tanggalkembali = '"+ this.tanggalkembali +"' "
                    +"      WHERE idpeminjaman = '"+this.idpeminjaman + "'";
            DBHelper1841720049Nurus.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.idpeminjaman + "'";
        DBHelper1841720049Nurus.executeQuery(SQL);
    }   
    
}
