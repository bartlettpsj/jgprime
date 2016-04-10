import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Created by pbartlett on 1/1/16.
 */
public class MainForm {

  private JButton javaCalculateButton;

  public static void main(String[] args) {
    JFrame frame = new JFrame("MainForm");
    frame.setContentPane(new MainForm().panel1);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }

  private JPanel panel1;

  public MainForm() {
    javaCalculateButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // The button click
      }
    });
  }
}
