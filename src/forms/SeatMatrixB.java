package forms;
import java.awt.Color;
import javax.swing.*;
public class SeatMatrixB extends JFrame 
{
  JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36;
  SeatMatrixB(String title)
  {
    super(title);
    l1=new JLabel("Bachelor Of Technology");
    l2=new JLabel("Computer Science");
    l3=new JLabel("Information Technology");
    l4=new JLabel("Electronics and Communication");
    l5=new JLabel("Electrical and Electronics");
    l7=new JLabel("GEN");
    l8 =new JLabel("40");
    l9 =new JLabel("40");
    l10=new JLabel("40");
    l11=new JLabel("12");
    l13=new JLabel("SC");
    l14=new JLabel("10");
    l15=new JLabel("08");
    l16=new JLabel("09");
    l17=new JLabel("03");
    l19=new JLabel("ST");
    l20=new JLabel("00");
    l21=new JLabel("03");
    l22=new JLabel("00");
    l23=new JLabel("01");
    l25=new JLabel("OTHER");
    l26=new JLabel("10");
    l27=new JLabel("10");
    l28=new JLabel("10");
    l29=new JLabel("05");
    l31=new JLabel("TOTAL");
    l32=new JLabel("180");
    l33=new JLabel("180");
    l34=new JLabel("180");
    l35=new JLabel("60");
    setLayout(null);
    l1.setBounds(5,10,300,30);
    l2.setBounds(5,50,200,30);
    l2.setForeground(Color.blue);
    l3.setBounds(5,90,200, 30);
    l3.setForeground(Color.blue);
    l4.setBounds(5,130,200,30);
    l4.setForeground(Color.blue);
    l5.setBounds(5,170,200,30);
    l5.setForeground(Color.blue);
    add(l1);add(l2);add(l3);add(l4);add(l5);
    l7.setBounds(260,10,100,30);
    l8.setBounds(260,50,100,30);
    l8.setForeground(Color.red);
    l9.setBounds(260,90,100,30);
    l9.setForeground(Color.red);
    l10.setBounds(260,130,100,30);
    l10.setForeground(Color.red);
    l11.setBounds(260,170,100,30);
    l11.setForeground(Color.red);
    add(l7);add(l8);add(l9);add(l10);add(l11);
    l13.setBounds(360,10,100,30);
    l14.setBounds(360,50,100,30);
    l14.setForeground(Color.red);
    l15.setBounds(360,90,100,30);
    l15.setForeground(Color.red);
    l16.setBounds(360,130,100,30);
    l16.setForeground(Color.red);
    l17.setBounds(360,170,100,30);
    l17.setForeground(Color.red);
    add(l13);add(l14);add(l15);add(l16);add(l17);
    l19.setBounds(460,10,100,30);
    l20.setBounds(460,50,100,30);
    l20.setForeground(Color.red);
    l21.setBounds(460,90,100,30);
    l21.setForeground(Color.red);
    l22.setBounds(460,130,100,30);
    l22.setForeground(Color.red);
    l23.setBounds(460,170,100,30);
    l23.setForeground(Color.red);
    add(l19);add(l20);add(l21);add(l22);add(l23);
    l25.setBounds(560,10,100,30);
    l26.setBounds(560,50,100,30);
    l26.setForeground(Color.red);
    l27.setBounds(560,90,100,30);
    l27.setForeground(Color.red);
    l28.setBounds(560,130,100,30);
    l28.setForeground(Color.red);
    l29.setBounds(560,170,100,30);
    l29.setForeground(Color.red);
    add(l25);add(l26);add(l27);add(l28);add(l29);
    l31.setBounds(660,10,100,30);
    l32.setBounds(660,50,100,30);
    l32.setForeground(Color.red);
    l33.setBounds(660,90,100,30);
    l33.setForeground(Color.red);
    l34.setBounds(660,130,100,30);
    l34.setForeground(Color.red);
    l35.setBounds(660,170,100,30);
    l35.setForeground(Color.red);
    add(l31);add(l32);add(l33);add(l34);add(l35);
  }
   public static void main(String[] args)
    {
        SeatMatrixB obj=new SeatMatrixB("Seat Matrix BTech");  
        obj.setSize(725,250);
        obj.setLocation(250,150);
        obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
        obj.setVisible(true);
    }
}