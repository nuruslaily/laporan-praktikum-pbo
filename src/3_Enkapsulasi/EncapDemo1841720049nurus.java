package minggu3;

/**
 *
 * @author Nurus Laily
 */
public class EncapDemo1841720049nurus {
    private String mName;
    private int mAge;
    
    public String getNameNurus(){
        return mName;
    }
    public void setNameNurus(String newName){
        mName = newName;
    }
    public int getAgeNurus(){
        return mAge;
    }
    public void setAgeNurus(int newAge){
        if(newAge<30&&newAge>18){
            mAge = 30;
        }
        else{
            mAge = newAge;
        }
    }
}
