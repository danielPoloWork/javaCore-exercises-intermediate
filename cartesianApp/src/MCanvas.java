import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class MCanvas extends JComponent {

  public static void main(String[] args) {

    List<Point> coordinatesList = setCoordinates();
    Line line = new Line(coordinatesList);

    getWindow(line);
  }

  private static void getWindow(Line lineArgs) {
    // creating object of JFrame(Window popup)
    JFrame window = new JFrame();
    // setting closing operation
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // setting size of the pop window
    window.setBounds(30, 30, 1500, 700);
    // setting canvas for draw
    window.getContentPane().add(lineArgs);
    // set visibility
    window.setVisible(true);
  }

  private static List<Point> setCoordinates() {
    List<Point> points = new ArrayList<Point>();

    Point d01 = new Point(100,100);
    Point d02 = new Point(100,600);
    Point d03 = new Point(100,600);
    Point d04 = new Point(400,600);
    Point d05 = new Point(400,600);
    Point d06 = new Point(400,300);
    Point d07 = new Point(400,300);
    Point d08 = new Point(100,100);

    Point a01 = new Point(500,100);
    Point a02 = new Point(500,600);
    Point a03 = new Point(500,100);
    Point a04 = new Point(800,100);
    Point a05 = new Point(800,100);
    Point a06 = new Point(800,600);
    Point a07 = new Point(500,300);
    Point a08 = new Point(800,300);

    Point n01 = new Point(900,100);
    Point n02 = new Point(900,600);
    Point n03 = new Point(1200,100);
    Point n04 = new Point(1200,600);
    Point n05 = new Point(900,100);
    Point n06 = new Point(1200,300);

    Point i01 = new Point(1300,100);
    Point i02 = new Point(1300,600);

    points.add(d01);
    points.add(d02);
    points.add(d03);
    points.add(d04);
    points.add(d05);
    points.add(d06);
    points.add(d07);
    points.add(d08);

    points.add(a01);
    points.add(a02);
    points.add(a03);
    points.add(a04);
    points.add(a05);
    points.add(a06);
    points.add(a07);
    points.add(a08);

    points.add(n01);
    points.add(n02);
    points.add(n03);
    points.add(n04);
    points.add(n05);
    points.add(n06);

    points.add(i01);
    points.add(i02);

    return points;
  }
}