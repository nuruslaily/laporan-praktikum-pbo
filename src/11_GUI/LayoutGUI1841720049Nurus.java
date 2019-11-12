package ManajemenLayout1841720049Nurus;

/**
 *
 * @author Nurus Laily
 */

import javax.swing.JFrame;
public class LayoutGUI1841720049Nurus extends JFrame{
    public static void main(String[] args) {
        JFrame frame = new Border1841720049Nurus();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        JFrame frame2 = new Grid1841720049Nurus();
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);
        
        JFrame frame3 = new Box1841720049Nurus();
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setVisible(true);
    }
}
