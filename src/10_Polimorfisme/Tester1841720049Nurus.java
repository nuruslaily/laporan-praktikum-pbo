package Tugas1841720049Nurus;

/**
 *
 * @author Nurus Laily
 */
public class Tester1841720049Nurus {
    public static void main(String[] args) {
        WalkingZombie1841720049Nurus wz = new WalkingZombie1841720049Nurus(100,1);
        JumpingZombie1841720049Nurus jz = new JumpingZombie1841720049Nurus(100,2);
        Barrier1841720049Nurus b = new Barrier1841720049Nurus(100);
        Plant1841720049Nurus p =new Plant1841720049Nurus();
        
        System.out.println(""+wz.getZombieInfoNurus());
        System.out.println(""+jz.getZombieInfoNurus());
        System.out.println(""+b.getBarierInfoNurus());
        System.out.println("--------------------------");
        for(int i =0;i<4;i++){//Destroy the enemies 4 times
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println(""+wz.getZombieInfoNurus());
        System.out.println(""+jz.getZombieInfoNurus());
        System.out.println(""+b.getBarierInfoNurus());
    }
}
