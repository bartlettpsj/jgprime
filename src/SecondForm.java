import javax.swing.*;

/**
 * Created by pbartlett on 1/1/16.
 */
public class SecondForm {

  private JTextArea textArea1;
  private JPanel panel1;

  public static void main(String[] args) {
    SecondForm form = new SecondForm();

    JFrame frame = new JFrame("SecondForm");

    frame.setContentPane(form.panel1);

//    frame.setContentPane(new SecondForm().panel1);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
