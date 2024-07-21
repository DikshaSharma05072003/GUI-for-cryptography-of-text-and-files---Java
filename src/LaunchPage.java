import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    private static JTextField userText;
    private static JFrame frame;
    private static JLabel label;
    private static JButton button2;
    private static JButton button;
    private static JLabel sucess;
    void display() {

        JPanel panel = new JPanel();
        frame = new JFrame("Encryption and Decryption:");

       // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(panel);
        //This is 
        panel.setLayout(null);

        label = new JLabel("Select");
        label.setBounds(10, 20, 200, 25);
        panel.add(label);
        frame.setVisible(true);
         button = new JButton("Encrypt" );
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new LaunchPage());
        panel.add(button);

        button2 = new JButton("Decrypt:" );
        button2.setBounds(150, 80, 80, 25);
        button2.addActionListener(new LaunchPage());
        panel.add(button2);

        sucess = new JLabel();
        sucess.setBounds(10, 110, 300, 25);
        panel.add(sucess);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button){
            Text_Image class2 = new Text_Image();
            class2.display();
           // frame.setVisible(false);

        }
        else if(e.getSource()==button2){
            cf3 class3 = new cf3();
            class3.method();
           // frame.setVisible(false);
        }
    }
}