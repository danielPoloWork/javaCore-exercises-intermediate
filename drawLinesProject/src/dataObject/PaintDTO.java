package dataObject; /**
 * Java program to draw a line in Applet
 */

import java.awt.*;
import javax.swing.*;

public class PaintDTO extends JComponent {

  public void paint(Graphics g) {
    // draw and display the line
    g.drawLine(30, 20, 80, 90);
  }
}
