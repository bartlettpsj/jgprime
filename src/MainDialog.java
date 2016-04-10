import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class MainDialog extends JDialog {

  private JPanel contentPane;
  private JButton buttonJava;
  private JButton buttonGroovy;
  private JSpinner spinner1;
  private JPanel panel1;
  private JPanel panel3;
  private JButton primeGroovy3Button;
  private JButton primeGroovy2Button;

  public MainDialog() {
    buttonJava.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // Java
        int max = (int) spinner1.getModel().getValue();
        long start = System.currentTimeMillis();
        JPrime jPrime = new JPrime();
        int highest = jPrime.calculateHighestPrime(max);
        long time = System.currentTimeMillis() - start;
        System.out.printf("Java Duration %d ms. Highest prime is %d\n", time, highest);

        start = System.currentTimeMillis();
        ArrayList<Integer> a = jPrime.getPrimes(max);
        time = System.currentTimeMillis() - start;
        System.out.printf("Java Duration %d ms for %d primes\n", time, a.size());

      }
    });
    buttonGroovy.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // Groovy
        int max = (int) spinner1.getModel().getValue();
        long start = System.currentTimeMillis();
        GPrime gPrime = new GPrime();
        int highest = gPrime.calculateHighestPrime(max);
        long time = System.currentTimeMillis() - start;
        System.out.printf("Groovy Duration %d ms.  Highest prime is %d\n", time, highest);

        start = System.currentTimeMillis();
        List<Integer> a = GPrime.getPrimes(max);
        time = System.currentTimeMillis() - start;
        System.out.printf("Groovy Duration %d ms for %d primes\n", time, a.size());

      }
    });

    // Setup the Spinner
    SpinnerNumberModel spinnerModel = (SpinnerNumberModel) spinner1.getModel();
    spinnerModel.setMinimum(100);
    spinnerModel.setMaximum(100000);
    spinnerModel.setValue(100000);

    primeGroovy2Button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // Groovy 2
        int max = (int) spinner1.getModel().getValue();
        long start = System.currentTimeMillis();
        GPrime gPrime = new GPrime();
        int highest = gPrime.calculateHighestPrime(max);
        long time = System.currentTimeMillis() - start;
        System.out.printf("Groovy2 Duration %d ms.  Highest prime is %d\n", time, highest);

        start = System.currentTimeMillis();
        List<Integer> a = GPrime.getPrimes2(max);
        time = System.currentTimeMillis() - start;
        System.out.printf("Groovy2 Duration %d ms for %d primes\n", time, a.size());

      }
    });
    primeGroovy3Button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // Groovy 3
        int max = (int) spinner1.getModel().getValue();
        long start = System.currentTimeMillis();
        GPrime gPrime = new GPrime();
        int highest = gPrime.calculateHighestPrime(max);
        long time = System.currentTimeMillis() - start;
        System.out.printf("Groovy3 Duration %d ms.  Highest prime is %d\n", time, highest);

        start = System.currentTimeMillis();
        List<Integer> a = GPrime.getPrimes3(max);
        time = System.currentTimeMillis() - start;
        System.out.printf("Groovy3 Duration %d ms for %d primes\n", time, a.size());

      }
    });
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("MainDialog");

    frame.setContentPane(new MainDialog().contentPane);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
