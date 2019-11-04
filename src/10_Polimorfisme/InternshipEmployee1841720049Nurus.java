package Percobaan1841720049Nurus;

/**
 *
 * @author Nurus Laily
 */
public class InternshipEmployee1841720049Nurus extends Employee1841720049Nurus{
    private int mLength;
    
    public InternshipEmployee1841720049Nurus(String name, int length){
        mLength = length;
        sName = name;
    }

    public int getmLengthNurus() {
        return mLength;
    }

    public void setmLengthNurus(int mLength) {
        this.mLength = mLength;
    }
    @Override
    public String getEmployeeInfoNurus(){
        String info = super.getEmployeeInfoNurus()+"\n";
        info += "Registered as intership employee for "+mLength+" month/s\n";
        return info;
    }
}
