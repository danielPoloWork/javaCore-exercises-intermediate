package dataObject;

import java.awt.*;
import javax.swing.JComponent;
import java.util.List;

public class LineDTA extends JComponent {

  // DECLARATION
  private final List<PointDTA> points;

  // CONSTRUCTOR
  public LineDTA(List<PointDTA> pointArgs) {
    this.points = pointArgs;
  }

  // GET METHODS
  public List<PointDTA> getPoints() {
    return this.points;
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    for ( int a = 0, b = 1; b < this.points.size(); a++, b++) {
      int x1 = this.points.get(a).getXAxis();
      int y1 = this.points.get(a).getYAxis();
      int x2 = this.points.get(b).getXAxis();
      int y2 = this.points.get(b).getYAxis();
      g.drawLine(x1, y1, x2, y2);
      a++;
      b++;
    }
  }
}