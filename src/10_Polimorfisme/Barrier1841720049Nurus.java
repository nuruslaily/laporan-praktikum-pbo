package Tugas1841720049Nurus;

/**
 *
 * @author Nurus Laily
 */
public class Barrier1841720049Nurus implements IDestroyable1841720049Nurus{
    private int mStrength;
    public Barrier1841720049Nurus(int strength){
        mStrength = strength;
    }

    public int getmStrength() {
        return mStrength;
    }

    public void setmStrength(int mStrength) {
        this.mStrength = mStrength;
    }
    public void destroy(){
        mStrength -= mStrength*0.1;
    }
    
    public void destroyedNurus() {
       destroy();
    }
    public String getBarierInfoNurus(){
        return "\nBarrier Strength = "+mStrength;
    }
}
