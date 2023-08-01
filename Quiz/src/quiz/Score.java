package quiz;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener 
{
    JButton submit,back;
    Score(String name, int score) 
    {
        setSize(600, 500);
        setLocation(300, 300);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setUndecorated(true);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(20, 80, 250, 250);
        add(image);
        
        JLabel heading = new JLabel("Thankyou " + name + " for playing this Quiz");
        heading.setBounds(50, 30, 700, 40);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
        heading.setForeground(Color.BLACK);
        add(heading);
        
        JLabel lblscore = new JLabel("Your score: " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.BOLD, 30));
        lblscore.setForeground(new Color(198, 50, 255));
        add(lblscore);
        
        submit = new JButton("Play Again");
        submit.setBounds(380, 270, 120, 40);
        submit.setBackground(new Color(0, 0, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        back = new JButton("EXIT");
        back.setBounds(380, 325, 120, 40);
        back.setBackground(Color.RED);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource()==submit)
        {
            setVisible(false);
            new Login();
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

    public static void main(String[] args) {
        new Score("User", 0);
    }
    
}
