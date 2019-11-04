package Percobaan1841720049Nurus;

/**
 *
 * @author Nurus Laily
 */
public class Tester4_1841720049Nurus {
    public static void main(String[] args) {
        Owner1841720049Nurus ow = new Owner1841720049Nurus();
        ElectricityBill1841720049Nurus eBill = new ElectricityBill1841720049Nurus(5, "R-1");
        ow.payNurus(eBill);//pay for electricity bill
        System.out.println("------------------------------------------------------------");
        
        PermanentEmployee1841720049Nurus pEmp = new PermanentEmployee1841720049Nurus("Dedik", 500);
        ow.payNurus(pEmp);//pay for permanent employee
        System.out.println("------------------------------------------------------------");
        
        InternshipEmployee1841720049Nurus iEmp = new InternshipEmployee1841720049Nurus("Sunarto", 5);
        ow.showMyEmployeeNurus(pEmp);//show permanent employee info
        System.out.println("------------------------------------------------------------");
        ow.showMyEmployeeNurus(iEmp);//show internship employee info
        
        ow.payNurus(pEmp);
    }
}
