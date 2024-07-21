import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class cf2 implements ActionListener {
    private static JTextField userText;
    private static JFrame frame;
    private static JLabel label;
    private static JButton button;
    private static JLabel sucess;
    JButton button1 ;

    void method(){

        JPanel panel = new JPanel();
        frame = new JFrame("Encryption:");

        frame.setSize(300, 300);
        frame.add(panel);

        panel.setLayout(null);

        label = new JLabel("Enter Text:");
        label.setBounds(10, 20, 200, 25);
        panel.add(label);
        userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);
        frame.setVisible(true);
        button = new JButton("Encrypt");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new cf2());
        panel.add(button);

        button1=new JButton("back");
        button1.setBounds(200,80,100,30);
        //button1.addActionListener(new cf3());
        button1.addActionListener(new cf2());
        panel.add(button1);

        sucess = new JLabel();
        sucess.setBounds(10, 110, 300, 25);
        panel.add(sucess);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button)
        {
            String user =userText.getText();
            String cipherText = "";
            for (int ii = 0; ii < user.length(); ii++) {
                String alpha="abcdefghijklmnopqrstuvwxyz";;
                int charPosition = alpha.indexOf(user.charAt(ii));
                int keyVal = (1 + charPosition) % 26;
                char replaceVal = alpha.charAt(keyVal);
                cipherText += replaceVal;
            }

            sucess.setText("The Encrypted text is:\n"+cipherText);
        }
        else if(e.getSource() == button1)
        {
            frame.dispose();
            LaunchPage l = new LaunchPage();
            l.display();
        }
    }
}