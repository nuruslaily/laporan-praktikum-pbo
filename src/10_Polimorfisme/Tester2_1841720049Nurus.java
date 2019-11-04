package Percobaan1841720049Nurus;

/**
 *
 * @author Nurus Laily
 */
public class Tester2_1841720049Nurus {
    public static void main(String[] args) {
        PermanentEmployee1841720049Nurus pEmp = new PermanentEmployee1841720049Nurus("Dedik", 500);
        Employee1841720049Nurus e;
        e = pEmp;
        System.out.println(""+e.getEmployeeInfoNurus());
        System.out.println("-------------------------");
        System.out.println(""+pEmp.getEmployeeInfoNurus());
    }
}
