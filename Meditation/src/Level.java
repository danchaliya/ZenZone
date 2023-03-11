import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
public class Level implements ActionListener{

    String level ="";
    String time = "";

    
    
    Level(String categoryName){
        JFrame frame = new JFrame(categoryName);
        JButton start = new JButton("Start");

        //size and location of frame
        frame.setSize(1540,820);
        frame.setLocation(0,0);


        //pressing x quits the program
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JFrame.setDefaultLookAndFeelDecorated(true);


        JLabel title = new JLabel(categoryName);

        JLabel level = new JLabel("Level");
        JRadioButton level1 = new JRadioButton("Level 1");
        JRadioButton level2 = new JRadioButton("Level 2");
        JRadioButton level3 = new JRadioButton("Level 3");

        JLabel time = new JLabel("Time");
        JRadioButton time1 = new JRadioButton("Time 1");
        JRadioButton time2 = new JRadioButton("Time 2");
        JRadioButton time3 = new JRadioButton("Time 3");

        title.setBounds(650,75,100,30);

        level.setBounds(100, 200, 100, 30);
        level1.setBounds(100,230,100,30);
        level2.setBounds(100,260,100,30);
        level3.setBounds(100,290,100,30);

        time.setBounds(100, 400, 100, 30);
        time1.setBounds(100, 430, 100, 30);
        time2.setBounds(100, 460, 100, 30);
        time3.setBounds(100, 490, 100, 30);

        start.setBounds(650, 750, 100, 30);

        frame.add(title);
        frame.add(level);
        frame.add(level1);
        frame.add(level2);
        frame.add(level3);
        frame.add(time);
        frame.add(time1);
        frame.add(time2);
        frame.add(time3);
        frame.add(start);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        
    }
}
