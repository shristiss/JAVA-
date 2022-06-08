import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.*;
import java.lang.Exception;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class q23 extends JFrame {
    JLabel l;
    JTextField tf;
    JButton b;
    JPanel p;
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    q23 frame = new q23();
                    frame.setVisible(true);
                } catch (Exception e) {
                   e.printStackTrace();
                }
            }
        });
    }
    public q23()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450,190,1014,597);
        setResizable(false);
        p=new JPanel();
        p.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(p);
        p.setLayout(null);

        JLabel l1=new JLabel("Name");
        l1.setForeground(Color.BLACK);
        l1.setBounds(423,13,273,9368);
        p.add(l1);

        tf=new JTextField();
        tf.setBounds(481,170,281,68);
        p.add(tf);
        
        b=new JButton("Enter");
        b.setBounds(545, 392, 162, 73);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("success");
                String name=tf.getText();
                //DefaultTableModel model=(DefaultTableModel) JTable.getModel();
                try{
                  //  Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xx","root","Mysqlpass#20");
                    PreparedStatement st=con.prepareStatement("insert into student values(name)");
                   Object[] row={name};
                   DefaultTableModel model=new DefaultTableModel();
                   model.addRow(row);
                   
                }catch ( SQLException ex) {
                   
                }
            }
        });
        p.add(b);
        
    }
}

