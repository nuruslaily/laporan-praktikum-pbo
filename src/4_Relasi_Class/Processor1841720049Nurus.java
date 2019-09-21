package com.mycompany.percobaan1.relasi_kelas;

/**
 *
 * @author Nurus Laily
 */
public class Processor1841720049Nurus {
    private String mMerk;
    private double mCache;
    Processor1841720049Nurus(){
        
    }
    Processor1841720049Nurus(String merk, double cache){
        this.mMerk = merk;
        this.mCache = cache;
    }

    public String getmMerk() {
        return mMerk;
    }

    public void setmMerk(String mMerk) {
        this.mMerk = mMerk;
    }

    public double getmCache() {
        return mCache;
    }

    public void setmCache(double mCache) {
        this.mCache = mCache;
    }
    public void info(){
        System.out.printf("Merk Processor = %s\n", mMerk);
        System.out.printf("Cache Memory = %.2f\n", mCache);
    }
}
