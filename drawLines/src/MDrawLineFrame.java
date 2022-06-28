import javax.swing.JFrame;

public class MDrawLineFrame {

  public static void main(String[] a) {

    // creating object of JFrame(Window popup)
    JFrame window = new JFrame();

    // setting closing operation
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // setting size of the pop window
    window.setBounds(30, 30, 200, 200);

    // setting canvas for draw
    window.getContentPane().add(new Paint());

    // set visibility
    window.setVisible(true);
  }
}
