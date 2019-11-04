package Percobaan1841720049Nurus;

/**
 *
 * @author Nurus Laily
 */
public class Owner1841720049Nurus {
    public void payNurus(IPayable1841720049Nurus p){
        System.out.println("Total Payment = "+p.getPaymentAmountNurus());
        if(p instanceof ElectricityBill1841720049Nurus){
            ElectricityBill1841720049Nurus eb = (ElectricityBill1841720049Nurus) p;
            System.out.println(""+eb.getBillInfoNurus());
        }else if(p instanceof PermanentEmployee1841720049Nurus){
            PermanentEmployee1841720049Nurus pe = (PermanentEmployee1841720049Nurus) p;
            pe.getEmployeeInfoNurus();
            System.out.println(""+pe.getEmployeeInfoNurus());
        }
        
    }
    public void showMyEmployeeNurus(Employee1841720049Nurus e){
        System.out.println(""+e.getEmployeeInfoNurus());
        if(e instanceof PermanentEmployee1841720049Nurus)
            System.out.println("You have to pay her/him monthly!!!");
        else
            System.out.println("No need to pay him/her :)");
    }
}
