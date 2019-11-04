package Percobaan1841720049Nurus;

/**
 *
 * @author Nurus Laily
 */
public class Tester1_1841720049Nurus {
    public static void main(String[] args) {
        PermanentEmployee1841720049Nurus pEmp = new PermanentEmployee1841720049Nurus("Dedik", 500);
        InternshipEmployee1841720049Nurus iEmp = new InternshipEmployee1841720049Nurus("Sunarto", 5);
        ElectricityBill1841720049Nurus eBill = new ElectricityBill1841720049Nurus(5, "A-1");
        Employee1841720049Nurus e;
        IPayable1841720049Nurus p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
        
    }
}
