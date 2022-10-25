import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class App {
    // JFrame
    static JFrame jFrame;

    // text area
    static JTextArea jTextArea;

    static String bacaFile(){
        String isiFile = "";
        try {
            // ganti "/tmp/sample3.data" dengan path file teks yang akan dibaca
            File myObj = new File("/tmp/sample3.data");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                isiFile = isiFile + myReader.nextLine();
                // System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println(isiFile);
        return isiFile;
    }

    public static void main(String[] args) {
        // create a new frame to store text field and button
        jFrame = new JFrame("File Reader");

        // create a text area, specifying the rows and columns
        jTextArea = new JTextArea("test");

        Font font = new Font("Verdana", Font.BOLD, 20);
        jTextArea.setFont(font);

        jTextArea.setText(bacaFile());
        jTextArea.setBounds(0,0, 400,400);

        jFrame.add(jTextArea);
        // set the size of frame
        jFrame.setSize(400, 400);
        jFrame.setLayout(null);
        jFrame.setVisible(true); 
    }
}
