
package gui;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author -DELL-
 */
public class GUI extends JFrame implements ActionListener {

    /**
     * @param args the command line arguments
     */
    
    private JFrame jframe;
    private JPanel p1,p2;
    private JButton btnAction,btnClose;
    public static void main(String[] args) {
        // TODO code application logic here
        new GUI();
        
        
    }
    
    
    public GUI()
    {
        jframe = new JFrame("This is Jframe");
        jframe.setLayout(new GridLayout(1,2));
        
        
        p1 = new JPanel(new FlowLayout());
        p2= new JPanel(new FlowLayout());
        
        btnAction = new JButton("Action");
        btnAction.addActionListener(this);
        
        
        btnClose = new JButton("Close");
        btnClose.addActionListener(this);
        
        
        
      p1.add(btnAction);
      p2.add(btnClose);
      
  
      
      
      jframe.add(p1);
      jframe.add(p2);
      jframe.setSize(360,80);
      jframe.setResizable(false);
      jframe.setLocationRelativeTo(null);
      jframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
      jframe.setVisible(true);
      
      
        
    }

    @Override

    public void actionPerformed(ActionEvent e) {
       String arg = e.getActionCommand();
       
       if(arg == "Action")
       {
         JOptionPane.showMessageDialog(null, "This is first GUI program");
       }else
           if(arg == "Close")
           {
             System.exit(0);
           }
       
    }
    
}
