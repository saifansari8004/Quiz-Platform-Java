package quiz;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener
{
    JButton rules, back ;
    JTextField tname;
    public Login()
    {
        setSize(1200, 500);
        setLocation(200, 150);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setUndecorated(true);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 450, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 600, 500);
        add(image);
        
        JLabel heading = new JLabel("WELCOME TO OUR QUIZ");
        heading.setBounds(650, 60, 600, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground( Color.blue);
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 140, 300, 25);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 22));
        name.setForeground(Color.MAGENTA);
        add(name);
        
        tname = new JTextField();
        tname.setBounds(735, 200, 300, 40);
        tname.setFont(new Font("Times New Roman", Font.BOLD, 30));
        add(tname);
        
        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 40);
        rules.setBackground(new Color(50, 255, 50));
        rules.setForeground(Color.BLACK);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(915, 270, 120, 40);
        back.setBackground(Color.RED);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == rules) {
            String name = tname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource()==back)
        {
            int res = JOptionPane.showConfirmDialog(this,"Do you want to close");
            if(res == JOptionPane.YES_OPTION)
            {
                System.exit(0);
            }
        }
    }
    public static void main(String[] args) 
    {
        new Login();
    }
}
