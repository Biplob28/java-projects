
package loginSystem;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class welcome {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("HELLO");

    welcome(String UserID){
        welcomeLabel.setBounds(0, 0, 200, 100);
        welcomeLabel.setFont(new Font(null, Font.PLAIN,25));
        welcomeLabel.setText("Hello"+""+ UserID);



        frame.add(welcomeLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    }
