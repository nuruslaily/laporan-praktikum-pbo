package Percobaan1841720049Nurus;

/**
 *
 * @author Nurus Laily
 */
public class PermanentEmployee1841720049Nurus extends Employee1841720049Nurus implements IPayable1841720049Nurus{
    private int mSalary;
    
    public PermanentEmployee1841720049Nurus(String name, int salary){
        this.sName = name;
        mSalary = salary;
    }

    public int getmSalary() {
        return mSalary;
    }

    public void setmSalary(int mSalary) {
        this.mSalary = mSalary;
    }
    @Override
    public int getPaymentAmountNurus(){
        return (int)(mSalary+0.05*mSalary);
    }
    @Override
    public String getEmployeeInfoNurus(){
        String info = super.getEmployeeInfoNurus()+"\n";
        info += "Registered as permanent employee with salary "+mSalary+"\n";
        return info;
    }
    
}
