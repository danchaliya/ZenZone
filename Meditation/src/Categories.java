import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Categories implements ActionListener {
    JFrame frame = new JFrame("Categories");
    JButton category1Button = new JButton("Start");
    JButton category2Button = new JButton("Start");
    JButton category3Button = new JButton("Start");
    JButton category4Button = new JButton("Start");
    String categoryName1 = "temporary string take user input later";
    
    Categories(){
        
        //size and location of frame
        frame.setSize(1600,800);
        frame.setLocation(0,0);

        //pressing x quits the program
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JFrame.setDefaultLookAndFeelDecorated(true);

        //text information for category 1
        JLabel category1JLabel = new JLabel(categoryName1);
        category1JLabel.setBounds(900, 50, 200, 30);
        ImageIcon imageIcon1 = new ImageIcon("path/to/image.jpg");
        JLabel image1Label = new JLabel(imageIcon1);
        image1Label.setBounds(100, 50, 200, 200);
        category1Button.setBounds(900, 150, 100, 30);
        category1Button.addActionListener(this);

        JLabel category2JLabel = new JLabel("Category 2 Information");
        category2JLabel.setBounds(100, 250, 200, 30);
        ImageIcon imageIcon2 = new ImageIcon("path/to/image.jpg");
        JLabel image2Label = new JLabel(imageIcon2);
        image1Label.setBounds(900, 250, 200, 200);
        category2Button.setBounds(100,350,100,30);
        category2Button.addActionListener(this);

        JLabel category3JLabel = new JLabel("Category 3 Information");
        category3JLabel.setBounds(900, 450, 200, 30);
        ImageIcon imageIcon3 = new ImageIcon("path/to/image.jpg");
        JLabel image3Label = new JLabel(imageIcon3);
        image1Label.setBounds(100, 450, 200, 200);
        category3Button.setBounds(900,550,100,30);
        category3Button.addActionListener(this);

        JLabel category4JLabel = new JLabel("Category 4 Information");
        category4JLabel.setBounds(100, 650, 200, 30);
        ImageIcon imageIcon4 = new ImageIcon("path/to/image.jpg");
        JLabel image4Label = new JLabel(imageIcon4);
        image1Label.setBounds(900, 650, 200, 200);
        category4Button.setBounds(100,750,100,30);
        category4Button.addActionListener(this);

        //add elements to the frame
        frame.add(category1JLabel);
        frame.add(category2JLabel);
        frame.add(category3JLabel);
        frame.add(category4JLabel);
        frame.add(category1Button);
        frame.add(category2Button);
        frame.add(category3Button);
        frame.add(category4Button);
        frame.add(image1Label);
        frame.add(image2Label);
        frame.add(image3Label);
        frame.add(image4Label);
        frame.setLayout(null);
        frame.setVisible(true);


        


    }

    public static String categoryName(String categoryNameString){
        return categoryNameString;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == category1Button){
            
            Level category = new Level("Catagory Name 1");
            frame.dispose();
        }

        if(e.getSource() == category2Button){
            Level category = new Level("Category Name 2");
            frame.dispose();
        }

        if(e.getSource() == category3Button){
            Level category = new Level("Category Name 3");
            frame.dispose();
        }

        if(e.getSource() == category4Button){
            Level category = new Level("Category Name 4");
            frame.dispose();
        }
    
    }
}
