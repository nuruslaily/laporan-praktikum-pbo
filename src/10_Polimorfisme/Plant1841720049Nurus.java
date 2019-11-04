package Tugas1841720049Nurus;

/**
 *
 * @author Nurus Laily
 */
public class Plant1841720049Nurus {
    public void doDestroy (IDestroyable1841720049Nurus d){
        if (d instanceof WalkingZombie1841720049Nurus){
            WalkingZombie1841720049Nurus wz = (WalkingZombie1841720049Nurus) d;
            wz.destroyedNurus();
        }else if (d instanceof JumpingZombie1841720049Nurus){
            JumpingZombie1841720049Nurus jz = (JumpingZombie1841720049Nurus) d;
            jz.destroyedNurus();
        }else if (d instanceof Barrier1841720049Nurus){
            Barrier1841720049Nurus b = (Barrier1841720049Nurus) d;
            b.destroyedNurus();
        }
    }
}
