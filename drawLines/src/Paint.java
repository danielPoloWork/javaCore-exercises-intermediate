/**
 * Java program to draw a line in Applet
 */

import java.awt.*;
import javax.swing.*;

class Paint extends JComponent {

  public void paint(Graphics g) {
    // draw and display the line
    g.drawLine(30, 20, 80, 90);
  }
}
