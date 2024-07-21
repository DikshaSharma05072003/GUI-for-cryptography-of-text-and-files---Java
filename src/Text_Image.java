import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Text_Image implements ActionListener {
    private static JTextField userText;
    private static JLabel label;
    private static JButton button2;
    private static JButton button;
    private static JButton button1;
    private static JLabel sucess;
    private static JFrame frame;
    private static JPanel panel;

    void display() {

        JPanel panel = new JPanel();
        frame = new JFrame("Encryption and Decryption:");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(panel);

        panel.setLayout(null);

        label = new JLabel("Select option:");
        label.setBounds(10, 20, 200, 25);
        panel.add(label);
        frame.setVisible(true);
        button = new JButton("Text:");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(this);
        panel.add(button);

        button2 = new JButton("Image/File/ Video:" );
        button2.setBounds(200, 80, 150, 25);
        button2.addActionListener(this);
        panel.add(button2);

        //JButton button1 ;
        button1=new JButton("back");
        button1.setBounds(100,200,100,30);
        button1.addActionListener(new Text_Image());
        panel.add(button1);

        sucess = new JLabel();
        sucess.setBounds(10, 110, 300, 25);
        panel.add(sucess);
        //frame.setVisible(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //frame.setVisible(false);
        if(e.getSource()==button){
            cf2 class2 = new cf2();
            class2.method();
        }
        else if(e.getSource()==button2){
            Image img = new Image();
            img.display();
        }
        else if(e.getSource()==button1)
        {
            LaunchPage l=new LaunchPage();
            l.display();
            frame.dispose();
        }
    }
}

