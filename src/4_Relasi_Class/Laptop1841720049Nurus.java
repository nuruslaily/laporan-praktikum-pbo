package com.mycompany.percobaan1.relasi_kelas;

/**
 *
 * @author Nurus Laily
 */
public class Laptop1841720049Nurus {
    private String mMerk;
    private Processor1841720049Nurus mProc;
    Laptop1841720049Nurus(){
        
    }
    Laptop1841720049Nurus(String merk, Processor1841720049Nurus proc){
        this.mMerk = merk;
        this.mProc = proc;
    }

    public String getmMerk() {
        return mMerk;
    }

    public void setmMerk(String mMerk) {
        this.mMerk = mMerk;
    }

    public Processor1841720049Nurus getmProc() {
        return mProc;
    }

    public void setmProc(Processor1841720049Nurus mProc) {
        this.mProc = mProc;
    }
    
    public void info() {
        System.out.println("Merk Laptop = " + mMerk);
        mProc.info();
    }
    
}
