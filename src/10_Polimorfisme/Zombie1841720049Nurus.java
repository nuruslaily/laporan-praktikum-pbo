package Tugas1841720049Nurus;

/**
 *
 * @author Nurus Laily
 */
public abstract class Zombie1841720049Nurus implements IDestroyable1841720049Nurus{
    protected int sHealth;
    protected int sLevel;
    
    public abstract void healNurus();
    @Override
    public abstract void destroyedNurus();
    public String getZombieInfoNurus(){
        return "\nHealth = "+sHealth+"\nLevel = "+sLevel;
    }
}
