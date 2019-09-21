package com.mycompany.tugas.relasi_kelas;

/**
 *
 * @author Nurus Laily
 */
public class Studio1841720049Nurus {
    private String mFilm;
    private String mGenre;
    private String mStudioNomor;
    private String mKursiNomor;
    Studio1841720049Nurus(String film, String genre, String studio, String kursi){
        this.mFilm = film;
        this.mGenre = genre;
        this.mKursiNomor = kursi;
        this.mStudioNomor = studio;
    }
    public String getmFilm() {
        return mFilm;
    }

    public void setmFilm(String mFilm) {
        this.mFilm = mFilm;
    }

    public String getmGenre() {
        return mGenre;
    }

    public void setmGenre(String mGenre) {
        this.mGenre = mGenre;
    }

    public String getmStudioNomor() {
        return mStudioNomor;
    }

    public void setmStudioNomor(String mStudioNomor) {
        this.mStudioNomor = mStudioNomor;
    }

    public String getmKursiNomor() {
        return mKursiNomor;
    }

    public void setmKursiNomor(String mKursiNomor) {
        this.mKursiNomor = mKursiNomor;
    }

    public String info(){
        String info = " ";
        info += "Film: "+mFilm+"\n";
        info += "Genre: "+mGenre+"\n";
        info += "Studio Nomor: "+mStudioNomor+"\n";
        info += "Kursi Nomor: "+mKursiNomor+"\n";
        return info;
    }
}
