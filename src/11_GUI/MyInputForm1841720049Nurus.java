package HelloGui1841720049Nurus;

/**
 *
 * @author Nurus Laily
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MyInputForm1841720049Nurus extends JFrame{
    private static final int mFRAME_WIDTH = 600;
    private static final int mFRAME_HEIGHT = 200;
    private JLabel mALabel;
    private JLabel mBLabel;
    private JLabel mCLabel;
    private JTextField mAField;
    private JTextField mBField;
    private JButton mButton;
    private JPanel mPanel;
    
    public MyInputForm1841720049Nurus(){
        mCreateTextFieldNurus();
        mCreateButtonNurus();
        mCreatePanelNurus();
        setSize(mFRAME_WIDTH, mFRAME_WIDTH);
    }
    
    private void mCreateTextFieldNurus(){
        mALabel = new JLabel("Nilai A: ");
        mBLabel = new JLabel("Nilai C: ");
        mCLabel = new JLabel("Hasil: ");
        
        final int FIELD_WIDTH = 10;
        mAField = new JTextField(FIELD_WIDTH);
        mAField.setText("0");
        mBField = new JTextField(FIELD_WIDTH);
        mBField.setText("0");
    }
    
    private void mCreateButtonNurus(){
        mButton = new JButton("Calculate");
        class AddInterestListener implements ActionListener{
            
            @Override
            public void actionPerformed(ActionEvent event) {
                int a = Integer.valueOf(mAField.getText());
                int b = Integer.valueOf(mBField.getText());
                int c = a+b;
                mCLabel.setText("Hasil: "+c);
            }
            
        }
        ActionListener listener = new AddInterestListener();
        mButton.addActionListener(listener);
    }
    private void mCreatePanelNurus(){
        mPanel  = new JPanel();
        mPanel.add(mALabel);
        mPanel.add(mAField);
        mPanel.add(mBLabel);
        mPanel.add(mBField);
        mPanel.add(mButton);
        mPanel.add(mCLabel);
        add(mPanel);
    }
    public static void main(String[] args) {
        JFrame frame = new MyInputForm1841720049Nurus();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}









