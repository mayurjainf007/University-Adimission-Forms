package forms;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class admlogin extends JFrame implements ActionListener {
    JButton b1,b2;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField p1;
    String ad,pw;
    
    public admlogin(String title){
        super(title);
        b1=new JButton("Login");
        b2=new JButton("Cancel");
        l1=new JLabel("Admin Id");
        l2=new JLabel("KeyWord");
        t1=new JTextField();
        p1=new JPasswordField();
        setLayout(null);
        l1.setBounds(5,10,100,30);
        l2.setBounds(5,45,100,30);
        t1.setBounds(110,10,150,30);
        p1.setBounds(110,45,150,30);
        add(l1);add(l2);
        add(t1);add(p1);
        b1.setBounds(40,100,80,30);
        b2.setBounds(150,100,80,30);
        add(b1);add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        char [] p = p1.getPassword();
        pw = new String(p);
        ad = t1.getText();
        if(ae.getSource()==b2){   dispose();  }
        if(ae.getSource()==b1){    
          try {
            if(ad.equals("adminmj") && pw.equals("jainmj")){
                JOptionPane.showMessageDialog(null,"Welcome Administrator");
                admin adm = new admin("Administrator Pannel");
                dispose();
                adm.setSize(700,700);
                adm.setLocation(300,10);
                adm.setVisible(true);
                adm.getContentPane().setBackground(Color.ORANGE);
            }else{
                JOptionPane.showMessageDialog(null,"Incorrect Administrator");
            }
          }catch(Exception e){
              e.printStackTrace();
          }
        }
    }
    
    
    public static void main(String[] args)
    {
        admlogin log = new admlogin("Administrator Log_In"); 
        log.setSize(300,200);
        log.setLocation(450,150);
        log.setDefaultCloseOperation(EXIT_ON_CLOSE);
        log.setVisible(true);
    }
    
}
