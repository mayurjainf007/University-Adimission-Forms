package forms;
import java.awt.Color;
import javax.swing.*;
import java.awt.Font;
public class Fee extends JFrame
{
  JLabel l1,l2,l3,l4,l5,l6,l7;
  JLabel a1,a2,a3,a4,a5,a6,a7,a8,a9;
  JLabel b1,b2,b3,b4,b5,b6,b7,b8,b9;
  JLabel c1,c2,c3,c4,c5,c6,c7,c8,c9;
  JLabel d1,d2,d3,d4,d5,d6,d7,d8,d9;
  JLabel e1,e2,e3,e4,e5,e6,e7,e8,e9;
  JLabel i1,i2,i3,i4,j1,j2,j3,j4,j5,z3,z4,z5,z6;
  Font f1,f2;
  public Fee(String title)
  {
      super(title);
    f1 = new Font("Constania",Font.BOLD,20);
    f2 = new Font("Algerian", Font.BOLD,15);
    
    l1 = new JLabel("Bachelor Of Technology");
    l1.setFont(f1);
    i1 = new JLabel("Computer Science and Engineering");
    i2 = new JLabel("Information Technology");
    i3 = new JLabel("Electronics and Communication");
    i4 = new JLabel("Electrical and Electronics");
    
    l2 = new JLabel("Master Of Technology");
    l2.setFont(f1);
    j1 = new JLabel("Computer Science and Engineering");
    j2 = new JLabel("Information Technology");
    j3 = new JLabel("Electronics and Communication");
    j4 = new JLabel("Electrical and Electronics");
    j5 = new JLabel("Mechanical and Automation");
    
    
    l3 = new JLabel("Caution Money");
    l3.setFont(f2);
    z3 = new JLabel("(One Time, Refundable)");
    z3.setFont(f2);
    
    a1 = new JLabel("5,000");   
    a2 = new JLabel("5,000");   
    a3 = new JLabel("5,000");   
    a4 = new JLabel("5,000");   
    
    a5 = new JLabel("5,000");   
    a6 = new JLabel("5,000");     
    a7 = new JLabel("5,000");     
    a8 = new JLabel("5,000");     
    a9 = new JLabel("5,000");      
    
    l4 = new JLabel("University Exam Fee");
    l4.setFont(f2);
    z4 = new JLabel("(Per Year)");
    z4.setFont(f2);
    
    b1 = new JLabel("12,000");     
    b2 = new JLabel("12,000");     
    b3 = new JLabel("12,000");     
    b4 = new JLabel("12,000");     
    
    b5 = new JLabel("10,000");
    b6 = new JLabel("10,000");
    b7 = new JLabel("10,000");
    b8 = new JLabel("10,000");
    b9 = new JLabel("10,000");
    
    l5 = new JLabel("Student Activity Fee");
    l5.setFont(f2);
    z5 = new JLabel("(Per Year)");
    z5.setFont(f2);
    
    c1 = new JLabel("1,000");
    c2 = new JLabel("1,000");
    c3 = new JLabel("1,000");
    c4 = new JLabel("1,000");
    
    c5 = new JLabel("1,000");
    c6 = new JLabel("1,000");
    c7 = new JLabel("1,000");
    c8 = new JLabel("1,000");
    c9 = new JLabel("1,000");
    
    l6 = new JLabel("Academic/Tution Fee");
    l6.setFont(f2);
    z6 = new JLabel("(Per Year)");
    z6.setFont(f2);
    
    d1 = new JLabel("88,500");
    d2 = new JLabel("88,500");
    d3 = new JLabel("88,500");
    d4 = new JLabel("88,500");

    d5 = new JLabel("63,000");
    d6 = new JLabel("63,000");
    d7 = new JLabel("63,000");
    d8 = new JLabel("63,000");
    d9 = new JLabel("63,000");
    
    
    l7 = new JLabel("Total Amount");
    l7.setFont(f2);
    
    e1 = new JLabel("1,06,500");   
    e2 = new JLabel("1,06,500");   
    e3 = new JLabel("1,06,500");   
    e4 = new JLabel("1,06,500");   
 
    e5 = new JLabel("79,000");   
    e6 = new JLabel("79,000");     
    e7 = new JLabel("79,000");     
    e8 = new JLabel("79,000");     
    e9 = new JLabel("79,000");
    
    
    setLayout(null);
    l1.setBounds(5,60,300,30);
    l1.setForeground(Color.orange);
    i1.setBounds(5,100,200,30);
    i2.setBounds(5,140,200,30);
    i3.setBounds(5,180,200,30);
    i4.setBounds(5,220,200,30);
    
    l2.setBounds(5,300,300,30);
    l2.setForeground(Color.orange);
    j1.setBounds(5,340,200,30);
    j2.setBounds(5,380,200,30);
    j3.setBounds(5,420,200,30);
    j4.setBounds(5,460,200,30);
    j5.setBounds(5,500,200,30);
    
    l3.setBounds(300,20,200,20);
    l3.setForeground(Color.orange);
    z3.setBounds(300,40,200,20);
    z3.setForeground(Color.orange);
    
    a1.setBounds(350,100,100,30);
    a1.setForeground(Color.red);
    a2.setBounds(350,140,100,30);
    a2.setForeground(Color.red);
    a3.setBounds(350,180,100,30);
    a3.setForeground(Color.red);
    a4.setBounds(350,220,100,30);
    a4.setForeground(Color.red);
    a5.setBounds(350,340,100,30);
    a5.setForeground(Color.red);
    a6.setBounds(350,380,100,30);
    a6.setForeground(Color.red);
    a7.setBounds(350,420,100,30);
    a7.setForeground(Color.red);
    a8.setBounds(350,460,100,30);
    a8.setForeground(Color.red);
    a9.setBounds(350,500,100,30);
    a9.setForeground(Color.red);
    
    l4.setBounds(500,20,200,20);
    l4.setForeground(Color.orange);
    z4.setBounds(500,40,200,20);
    z4.setForeground(Color.orange);
    
    b1.setBounds(550,100,100,30);
    b1.setForeground(Color.red);
    b2.setBounds(550,140,100,30);
    b2.setForeground(Color.red);
    b3.setBounds(550,180,100,30);
    b3.setForeground(Color.red);
    b4.setBounds(550,220,100,30);
    b4.setForeground(Color.red);
    b5.setBounds(550,340,100,30);
    b5.setForeground(Color.red);
    b6.setBounds(550,380,100,30);
    b6.setForeground(Color.red);
    b7.setBounds(550,420,100,30);
    b7.setForeground(Color.red);
    b8.setBounds(550,460,100,30);
    b8.setForeground(Color.red);
    b9.setBounds(550,500,100,30);
    b9.setForeground(Color.red);
    
    l5.setBounds(700,20,200,20);
    l5.setForeground(Color.orange);
    z5.setBounds(700,40,200,20);
    z5.setForeground(Color.orange);
    
    c1.setBounds(750,100,100,30);
    c1.setForeground(Color.red);
    c2.setBounds(750,140,100,30);
    c2.setForeground(Color.red);
    c3.setBounds(750,180,100,30);
    c3.setForeground(Color.red);
    c4.setBounds(750,220,100,30);
    c4.setForeground(Color.red);
    c5.setBounds(750,340,100,30);
    c5.setForeground(Color.red);
    c6.setBounds(750,380,100,30);
    c6.setForeground(Color.red);
    c7.setBounds(750,420,100,30);
    c7.setForeground(Color.red);
    c8.setBounds(750,460,100,30);
    c8.setForeground(Color.red);
    c9.setBounds(750,500,100,30);
    c9.setForeground(Color.red);
    
    l6.setBounds(900,20,200,20);
    l6.setForeground(Color.orange);
    z6.setBounds(900,40,200,20);
    z6.setForeground(Color.orange);
    
    d1.setBounds(950,100,100,30);
    d1.setForeground(Color.red);
    d2.setBounds(950,140,100,30);
    d2.setForeground(Color.red);
    d3.setBounds(950,180,100,30);
    d3.setForeground(Color.red);
    d4.setBounds(950,220,100,30);
    d4.setForeground(Color.red);
    d5.setBounds(950,340,100,30);
    d5.setForeground(Color.red);
    d6.setBounds(950,380,100,30);
    d6.setForeground(Color.red);
    d7.setBounds(950,420,100,30);
    d7.setForeground(Color.red);
    d8.setBounds(950,460,100,30);
    d8.setForeground(Color.red);
    d9.setBounds(950,500,100,30);
    d9.setForeground(Color.red);
    
    l7.setBounds(1100,20,150,30);
    l7.setForeground(Color.orange);
    
    e1.setBounds(1150,100,100,30);
    e1.setForeground(Color.red);
    e2.setBounds(1150,140,100,30);
    e2.setForeground(Color.red);
    e3.setBounds(1150,180,100,30);
    e3.setForeground(Color.red);
    e4.setBounds(1150,220,100,30);
    e4.setForeground(Color.red);
    e5.setBounds(1150,340,100,30);
    e5.setForeground(Color.red);
    e6.setBounds(1150,380,100,30);
    e6.setForeground(Color.red);
    e7.setBounds(1150,420,100,30);
    e7.setForeground(Color.red);
    e8.setBounds(1150,460,100,30);
    e8.setForeground(Color.red);
    e9.setBounds(1150,500,100,30);
    e9.setForeground(Color.red);
    
    add(l1);add(l2);
    add(l3);add(l4);
    add(l5);add(l6);
    add(l7);
    add(i1);
    add(i2);add(i3);
    add(i4);add(j1);
    add(j2);add(j3);
    add(j4);add(j5);
    add(z3);add(z4);
    add(z5);add(z6);
    add(a1);add(a2);
    add(a3);add(a4);
    add(a5);add(a6);
    add(a7);add(a8);
    add(a9);
    add(b1);add(b2);
    add(b3);add(b4);
    add(b5);add(b6);
    add(b7);add(b8);
    add(b9);
    add(c1);add(c2);
    add(c3);add(c4);
    add(c5);add(c6);
    add(c7);add(c8);
    add(c9);
    add(d1);add(d2);
    add(d3);add(d4);
    add(d5);add(d6);
    add(d7);add(d8);
    add(d9);
    add(e1);add(e2);
    add(e3);add(e4);
    add(e5);add(e6);
    add(e7);add(e8);
    add(e9);    
  }
     public static void main(String[] args)
    {
      Fee obj=new Fee("Fee Structure");  
        obj.setSize(1300,600);
        obj.setLocation(40,100);
        obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
        obj.setVisible(true);
  }        
              
  }       

