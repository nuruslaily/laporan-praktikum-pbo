package unittest1841720049Nurus;
import org.junit.Assert;
import org.junit.Test;
/**
 *
 * @author Nurus Laily
 */
public class MessageProcessorTest1841720049Nurus {
    MessageProcessor1841720049Nurus mProcessor;
    public MessageProcessorTest1841720049Nurus(){
    mProcessor = new MessageProcessor1841720049Nurus();
    mProcessor.setmSender("Ronaldo");
    mProcessor.setmRecipient("Rafael");
    mProcessor.setmMessage("Whats up bro?");
    
    }
    @Test
    public void testshowMessage(){
        String expectedResult = "Hai Rafael, you have message from Ronaldo."+"\nThe message as follows : Whats up bro?";
        Assert.assertEquals(expectedResult, mProcessor.messageFormat());
    }
}
















