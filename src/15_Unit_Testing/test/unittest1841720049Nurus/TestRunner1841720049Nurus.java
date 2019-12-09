package unittest1841720049Nurus;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author Nurus Laily
 */
public class TestRunner1841720049Nurus {
    public static void main(String[] args) {
        Result mResult = new JUnitCore().runClasses(MessageProcessorTest1841720049Nurus.class);
        showMessageResult(mResult, MessageProcessorTest1841720049Nurus.class.getSimpleName());
        
        mResult = new JUnitCore().runClasses(Kategori1841720049NurusTest.class);
        showMessageResult(mResult, Kategori1841720049NurusTest.class.getSimpleName());
    }
    private static void showMessageResult(Result mResult, String className){
        if(mResult.wasSuccessful()){
            System.out.format("The Result Test from %s : %s\n", className, mResult.wasSuccessful());
        }else{
            for(Failure failure : mResult.getFailures()){
                System.out.println(failure);
            }
        }
    }
}
