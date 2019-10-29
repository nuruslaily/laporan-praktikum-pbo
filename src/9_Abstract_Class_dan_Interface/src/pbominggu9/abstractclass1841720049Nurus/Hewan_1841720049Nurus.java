package pbominggu9.abstractclass1841720049Nurus;

/**
 *
 * @author Nurus Laily
 */
public abstract class Hewan_1841720049Nurus {
    private int mUmur;
    
    protected Hewan_1841720049Nurus()
    {
        this.mUmur = 0;
    }
    
    public void bertambahUmurNurus()
    {
        this.mUmur += 1;
    }
    
    public abstract void bergerakNurus();
}
