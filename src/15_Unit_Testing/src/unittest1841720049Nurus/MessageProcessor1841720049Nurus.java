package unittest1841720049Nurus;

/**
 *
 * @author Nurus Laily
 */
public class MessageProcessor1841720049Nurus {
    private String mSender, mRecipient, mMessage;

    public String getmSender() {
        return mSender;
    }

    public String getmRecipient() {
        return mRecipient;
    }

    public String getmMessage() {
        return mMessage;
    }

    public void setmSender(String mSender) {
        this.mSender = mSender;
    }

    public void setmRecipient(String mRecipient) {
        this.mRecipient = mRecipient;
    }

    public void setmMessage(String mMessage) {
        this.mMessage = mMessage;
    }
    public String messageFormat(){
        String message = String.format("Hai %s, you have message from %s.\nThe message as follows : %s", 
                this.mRecipient, this.mSender, this.mMessage);
        return message;
    }
    
    public void showMessage(){
        System.out.println(messageFormat());
    }
}
