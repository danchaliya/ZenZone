import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Meditation implements ActionListener{
    Meditation(){
        JFrame frame = new JFrame("Meditation");
        //size and location of frame
        frame.setSize(1540,820);
        frame.setLocation(0,0);


        //pressing x quits the program
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JFrame.setDefaultLookAndFeelDecorated(true);

        JLabel title = new JLabel();
        title.setBounds();
        
        ImageIcon imageIcon1 = new ImageIcon("path/to/image.jpg");
        JLabel imageLabel = new JLabel(imageIcon1);
        imageLabel.setBounds();

        JLabel info = new JLabel("Script to be read");
        info.setBounds();

        frame.add(title);
        frame.add(imageLabel);
        frame.add(info);

        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
