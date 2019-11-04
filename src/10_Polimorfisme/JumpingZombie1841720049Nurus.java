package Tugas1841720049Nurus;

/**
 *
 * @author Nurus Laily
 */
public class JumpingZombie1841720049Nurus extends Zombie1841720049Nurus{
    public JumpingZombie1841720049Nurus(int health, int level){
        sHealth= health;
        sLevel = level;
    }
    
    public void healNurus(){
        if (sLevel == 1){
            sHealth += sHealth*2/100;
        }else if (sLevel == 2){
            sHealth += sHealth*3/100;
        }else if(sLevel == 3){
            sHealth += sHealth*4/100;
        }
    }
    public void destroyedNurus(){
        sHealth -= sHealth*0.093;
    }
    public String getZombieinfo(){
        String info = "Jumping Zombie Data = ";
        info += super.getZombieInfoNurus()+"\n";
        return info;

    }

}
