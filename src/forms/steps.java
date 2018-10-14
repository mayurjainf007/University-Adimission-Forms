
package forms;
import java.awt.Color;
import javax.swing.*;
import java.awt.Font;
public class steps extends JFrame{
    Font f;
    JTextArea jta=new JTextArea();
    public steps(String title)
    {
        super(title);
        f=new Font("Arial",Font.BOLD+Font.ITALIC,18);
        add(jta);
        jta.append("\n\t\tWELCOME TO GTBIT\n\n");
        jta.append("    STEP 1. Register Yourself And Create Your Log_In Id.\n\n");
        jta.append("    STEP 2. Log_On To Your Account.\n\n");
        jta.append("    STEP 3. Submit Admission Form.\n\n");
        jta.append("    STEP 4. Wait For The Merit List.\n\n");
        jta.append("    STEP 5. After The Allotment Of Seat, Pay Fees And Generate Fee Reciept.\n\n");
        jta.setEditable(false);
        jta.setFont(f);
        jta.setForeground(Color.blue);
        jta.setBackground(Color.yellow);
            }
    public static void main(String[] args) 
    {
      steps s=new steps("STEPS TO FOLLOW");
      s.setSize(720,320);
      s.setLocation(400,200);
      s.setDefaultCloseOperation(EXIT_ON_CLOSE);
      s.setVisible(true);
    }
}