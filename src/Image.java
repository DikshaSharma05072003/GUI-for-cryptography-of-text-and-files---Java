import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Image implements ActionListener {
    private static JTextField textField;
    private static JButton button2;
    private static JButton button;

    public static void operate(int key) {

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);
        File file = fileChooser.getSelectedFile();
        //file FileInputStream
        try {

            FileInputStream fis = new FileInputStream(file);

            byte[] data = new byte[fis.available()];
            fis.read(data);
            int i = 0;
            for (byte b : data) {
                System.out.println(b);
                data[i] = (byte) (b ^ key);
                i++;
            }

            FileOutputStream fos = new FileOutputStream(file);
            fos.write(data);
            fos.close();
            fis.close();
            JOptionPane.showMessageDialog(null, "Done");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void display() {

        JFrame f;
        f = new JFrame();
        f.setTitle("Image Operation");
        f.setSize(400, 400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Roboto", Font.BOLD, 25);
        //creating button
        button = new JButton();
        button.setText("Open Image/text file");
        button.addActionListener(new Image());
        button.setFont(font);
        button2 = new JButton();
        button2.setText("back");
        button2.addActionListener(new Image());
        //creating text field

        textField = new JTextField(10);
        textField.setFont(font);

        f.setLayout(new FlowLayout());

        f.add(button);
        f.add(button2);
        f.add(textField);
        f.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            //System.out.println("button clicked");
            String text = textField.getText();
            int temp = Integer.parseInt(text);
            operate(temp);
        } else if (e.getSource() == button2)
        {
            //f.dispose();
            LaunchPage l = new LaunchPage();
            l.display();
        }
    }
}