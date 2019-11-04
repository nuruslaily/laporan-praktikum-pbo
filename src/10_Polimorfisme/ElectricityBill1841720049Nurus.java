package Percobaan1841720049Nurus;

/**
 *
 * @author Nurus Laily
 */
public class ElectricityBill1841720049Nurus implements IPayable1841720049Nurus{
    private int mKwh;
    private String mCategory;
    
    public ElectricityBill1841720049Nurus(int kwh, String category){
        mKwh = kwh;
        mCategory = category;
    }

    public int getmKwhNurus() {
        return mKwh;
    }

    public void setmKwhNurus(int mKwh) {
        this.mKwh = mKwh;
    }

    public String getmCategoryNurus() {
        return mCategory;
    }

    public void setmCategoryNurus(String mCategory) {
        this.mCategory = mCategory;
    }
    @Override
    public int getPaymentAmountNurus(){
        return mKwh*getBasePriceNurus();
    }
    public int getBasePriceNurus(){
        int bPrice = 0;
        switch(mCategory){
            case "R-1" : bPrice = 100; break;
            case "R-2" : bPrice = 200; break;
        }
        return bPrice;
    }
    public String getBillInfoNurus(){
        return "kWH = "+mKwh+"\n"+
                "Category = "+mCategory+"("+getBasePriceNurus()+" per kWH)\n";
    }
}
