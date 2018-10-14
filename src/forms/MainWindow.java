package forms;
import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*; 
import java.sql.*;
import javax.swing.*;

public class MainWindow extends JFrame implements ActionListener,MouseListener{
    
    JMenuBar mb;
    JMenu nMain,nPlac,nFeeStruct,nSeat,nFaculty,nCon;
    JMenuItem fExit,fB,fM,fplp,fplc,finst,fadmi;
    JLabel l1,l2,l3,l4,l10,l11,l12,l13;
    Font f,f1,f2;
    JButton b2,b3;
    
    public MainWindow(){
        
        l1  = new JLabel("Guru Tegh Bahadur Institute Of Technology");
        l2  = new JLabel("GTBIT was established in 1999 by Delhi Sikh Gurdwara Management Committee (DSGMC) with a vision to take higher education to a new level."); 
        l3  = new JLabel("It is the premier institute of the country and is known for its high standards in teaching and research and attracts eminent scholars to its faculty.");
        l4  = new JLabel("This institute aims to stimulate both the hearts and minds of scholars, empower them to contribute to the welfare of the society at large.");
        l12 = new JLabel("NOTIFICATIONS");l12.setVisible(false);
        l13 = new JLabel("Merit List Declared");l13.setVisible(false);
            
            l10 = new JLabel(new ImageIcon("logo.jpg"));
            l11 = new JLabel(new ImageIcon("1.jpg"));
            
        mb = new JMenuBar();
            nMain       = new JMenu("     Main                   ");
            nPlac       = new JMenu("Placements             ");
            nFeeStruct  = new JMenu("Fee Structure          ");
            nSeat       = new JMenu("Seat Matrix            ");
            nFaculty    = new JMenu("Faculty                ");
            nCon        = new JMenu("Contact Us             ");
        
            fplp    = new JMenuItem("Previous Placements");
            fplc    = new JMenuItem("Current Placements");
            fExit   = new JMenuItem("Exit");
            finst   = new JMenuItem("Instruction");
            fadmi   = new JMenuItem("Admin Log");
            fB      = new JMenuItem("BTech");
            fM      = new JMenuItem("MTech");
            
        b2 = new JButton("Log_In");        
        b3 = new JButton("Register");
        
        nPlac.add(fplp);
        nPlac.add(fplc);
        nMain.add(fadmi);
        nMain.add(finst);
        nMain.add(fExit);
        nSeat.add(fB);
        nSeat.add(fM);
        mb.add(nMain);
        mb.add(nPlac);
        mb.add(nFeeStruct);
        mb.add(nSeat);
        mb.add(nFaculty);
        mb.add(nCon);
        
        f  = new Font("Constantia", Font.BOLD,45);
        f1 = new Font("Arial", Font.BOLD,14);
        f2 = new Font("Algerian", Font.BOLD,20);
        
        l1.setForeground(Color.orange);
        l2.setForeground(Color.CYAN);
        l3.setForeground(Color.CYAN);
        l4.setForeground(Color.CYAN);
        
        l1.setFont(f);
        l2.setFont(f1);
        l3.setFont(f1);
        l4.setFont(f1);
        
        setLayout(null);
        l1.setBounds(125,15,1000,50);
        l2.setBounds(50,630,1200,30);
        l3.setBounds(50,650,1200,30);
        l4.setBounds(50,670,1000,30);
        l10.setBounds(10,10,100,100);
        l11.setBounds(0,110,1400,515);
        l12.setBounds(1150,275,200,30);
        l13.setBounds(1140,325,200,30);
        add(l12);add(l13);

        
        l12.setForeground(Color.red);
        l13.setForeground(Color.orange);
        l12.setFont(f2);
        l13.setFont(f2);
        b3.setBounds(1125,670,100,30);
        b2.setBounds(1250,670,100,30);
        b2.setBackground(Color.green);
        b3.setBackground(Color.green);
        add(b2);add(b3);
        
        mb.setBounds(225,75,600,30);
        mb.setBackground(Color.white);
        mb.setForeground(Color.black);
        add(l1);add(l2);
        add(l3);add(l4);
        add(l10);add(l11);
        add(mb);
        
        try{
            Database db = new Database();
            Connection con = db.connect();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from merit");   //for notification
            if(rs.next()){
                l12.setVisible(true);
                l13.setVisible(true);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }       
        
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        nFeeStruct.addMouseListener(this);
        nFaculty.addMouseListener(this);
        nCon.addMouseListener(this);
        
        fplp.addMouseListener(this);
        fplc.addMouseListener(this);
        fExit.addMouseListener(this);
        finst.addMouseListener(this);
        fadmi.addMouseListener(this);
        fB.addMouseListener(this);
        fM.addMouseListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b3){
            Register reg=new Register("Registration");
            reg.setSize(300,250);
            reg.setLocation(420,240);
            reg.setVisible(true);
        }
        if(ae.getSource() == b2){
            login log=new login("Log_In");  
            log.setSize(300,200);
            log.setLocation(450,150);
            log.setVisible(true);
        }
    }
    @Override
    public void mouseClicked(MouseEvent me){
        if(me.getSource() == nFeeStruct){
            Fee obj=new Fee("Fee Structure");  
            obj.setSize(700,550);
            obj.setLocation(350,100);
            obj.setVisible(true);
        }
        if(me.getSource() == nFaculty){
            faculty obj=new faculty("Faculty Information");  
            obj.setSize(450,450);
            obj.setLocation(500,150);
            obj.setVisible(true);
        }
        if(me.getSource() == nCon){
            address obj=new address("Contact Us");  
            obj.setSize(320,200);
            obj.setLocation(500,150);
            obj.setVisible(true);
        }
    }
    @Override
    public void mousePressed(MouseEvent me){
      if(me.getSource() == fplp){
         placem1 obj=new placem1("PREVIOUS YEAR PLACEMENT");  
         obj.setSize(500,500);
         obj.setLocation(350,150);
         obj.setVisible(true);  
       }
       if(me.getSource() == fplc){
         placem obj=new placem("CURRENT YEAR PLACEMENT");  
         obj.setSize(500,500);
         obj.setLocation(350,150);
         obj.setVisible(true);  
       }
       if(me.getSource() == fExit)
           System.exit(0);
       if(me.getSource() == finst){
            steps s=new steps("Instructions To Follow");
            s.setSize(675,330);
            s.setLocation(400,200);
            s.setVisible(true);
        }
       if(me.getSource() == fadmi){
            admlogin logi = new admlogin("Administrator Pannel");  
            logi.setSize(300,200);
            logi.setLocation(300,10);
            logi.setVisible(true);
            logi.setDefaultCloseOperation(EXIT_ON_CLOSE);
            logi.getContentPane().setBackground(Color.ORANGE);
        }
       if(me.getSource() == fB){
           SeatMatrixB obj=new SeatMatrixB("Seat Matrix BTech");  
           obj.setSize(725,250);
           obj.setLocation(250,150);
           obj.setVisible(true);
       }
       if(me.getSource() == fM){
           SeatMatrixM obj=new SeatMatrixM("Seat Matrix MTech");  
           obj.setSize(730,300);
           obj.setLocation(250,150);
           obj.setVisible(true);
       }
    }
    @Override
    public void mouseReleased(MouseEvent e){}
    @Override
    public void mouseEntered(MouseEvent e){}
    @Override
    public void mouseExited(MouseEvent e){}
    
    public static void main(String[] args){
        MainWindow obj=new MainWindow();
        obj.getContentPane().setBackground(Color.black);
        obj.setSize(1400,750);
        obj.setLocation(-10,0);
        obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
        obj.setVisible(true);
    }
}