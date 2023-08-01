
package quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        setSize(800, 650);
        setLocation(350, 100);
        setUndecorated(true);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Quiz Competition");
        heading.setBounds(120, 30, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
        heading.setForeground(Color.RED);
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(60, 100, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setForeground(Color.GRAY);
        rules.setText(
            "<html>"+ 
                "1. Participants must meet specified eligibility criteria to participate." + "<br><br>" +
                "2. Clearly outline the competition format and challenge types." + "<br><br>" +
                "3. Organizers will communicate all essential information related to the competition effectively." + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions." + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. Clearly communicate prize distribution details before the competition." + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 120, 40);
        back.setBackground(Color.RED);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 120, 40);
        start.setBackground(new Color(70, 255, 50));
        start.setForeground(Color.BLACK);
        start.addActionListener(this);
        add(start);
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
