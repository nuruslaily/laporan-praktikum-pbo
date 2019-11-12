package ManajemenLayout1841720049Nurus;

/**
 *
 * @author Nurus Laily
 */
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Grid1841720049Nurus extends JFrame{
    private static final int mFRAME_WIDTH = 600;
    private static final int mFRAME_HEIGHT = 200;
    private JPanel mPanel;
    
    public Grid1841720049Nurus(){
        mPanel = new JPanel();
        mPanel.setLayout(new GridLayout(4, 2));
        mPanel.add(new JButton("1"));
        mPanel.add(new JButton("2"));
        mPanel.add(new JButton("3"));
        mPanel.add(new JButton("4"));
        mPanel.add(new JButton("5"));
        mPanel.add(new JButton("6"));
        mPanel.add(new JButton("7"));
        mPanel.add(new JButton("8"));
        
        add(mPanel);
        setSize(mFRAME_WIDTH, mFRAME_HEIGHT);
        setTitle("Grid Layout Demo");
    }
}
