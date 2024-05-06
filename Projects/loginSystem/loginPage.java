package loginSystem;

import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton loginbutton = new JButton("login");
    JButton resetButoon = new JButton("reset");
    JTextField userIdFeild = new JTextField();
    JPasswordField UserPasswordFeild = new JPasswordField();
    JLabel userIdLabel = new JLabel("UserID");
    JLabel userPasswordLabel = new JLabel("Password");
    JLabel UserMessage = new JLabel();

    HashMap<String, String> loginInfo = new HashMap<String, String>();

    loginPage(HashMap<String, String> originalloginPage) {
        loginInfo = originalloginPage;
        userIdLabel.setBounds(50, 100, 75, 25);
        userPasswordLabel.setBounds(50, 150, 100, 25);

        UserMessage.setBounds(50, 250, 250, 35);
        UserMessage.setFont(new Font(null, Font.ITALIC, 25));

        userIdFeild.setBounds(125, 100, 200, 25);
        UserPasswordFeild.setBounds(125, 150, 200, 25);

        loginbutton.setBounds(50, 200, 100, 25);
        loginbutton.setFocusable(false);
        loginbutton.addActionListener(this);
        resetButoon.setBounds(200, 200, 100, 25);
        resetButoon.setFocusable(false);
        resetButoon.addActionListener(this);

        frame.add(userIdLabel);
        frame.add(userPasswordLabel);
        frame.add(UserMessage);
        frame.add(userIdFeild);
        frame.add(UserPasswordFeild);
        frame.add(loginbutton);
        frame.add(resetButoon);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButoon) {
            userIdFeild.setText("");
            UserPasswordFeild.setText("");
        }

        if (e.getSource() == loginbutton) {
            String UserID = userIdFeild.getText();
            String UserPassword = String.valueOf(UserPasswordFeild.getPassword());
    
            if (loginInfo.containsKey(UserID)) {
                if (loginInfo.get(UserID).equals(UserPassword)) {
                    UserMessage.setForeground(Color.green);
                    UserMessage.setText("Login Succesfully");
                    frame.dispose();
                    welcome welcomePage = new welcome(UserID);

                }
                else{
                    UserMessage.setForeground(Color.red);
                    UserMessage.setText("Wrong Password");
                }

            }
            else{
                UserMessage.setForeground(Color.red);
                UserMessage.setText("UserName Not found");
            }

        }

    }
}
