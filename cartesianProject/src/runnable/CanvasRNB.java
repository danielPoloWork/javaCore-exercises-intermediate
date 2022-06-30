package runnable;

import dataObject.LineDTA;
import dataObject.PointDTA;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class CanvasRNB extends JComponent {

  public static void main(String[] args) {

    List<PointDTA> coordinatesList = setCoordinates();
    LineDTA line = new LineDTA(coordinatesList);

    getWindow(line);
  }

  private static void getWindow(LineDTA lineArgs) {
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

  private static List<PointDTA> setCoordinates() {
    List<PointDTA> points = new ArrayList<PointDTA>();

    PointDTA d01 = new PointDTA(100,100);
    PointDTA d02 = new PointDTA(100,600);
    PointDTA d03 = new PointDTA(100,600);
    PointDTA d04 = new PointDTA(400,600);
    PointDTA d05 = new PointDTA(400,600);
    PointDTA d06 = new PointDTA(400,300);
    PointDTA d07 = new PointDTA(400,300);
    PointDTA d08 = new PointDTA(100,100);

    PointDTA a01 = new PointDTA(500,100);
    PointDTA a02 = new PointDTA(500,600);
    PointDTA a03 = new PointDTA(500,100);
    PointDTA a04 = new PointDTA(800,100);
    PointDTA a05 = new PointDTA(800,100);
    PointDTA a06 = new PointDTA(800,600);
    PointDTA a07 = new PointDTA(500,300);
    PointDTA a08 = new PointDTA(800,300);

    PointDTA n01 = new PointDTA(900,100);
    PointDTA n02 = new PointDTA(900,600);
    PointDTA n03 = new PointDTA(1200,100);
    PointDTA n04 = new PointDTA(1200,600);
    PointDTA n05 = new PointDTA(900,100);
    PointDTA n06 = new PointDTA(1200,300);

    PointDTA i01 = new PointDTA(1300,100);
    PointDTA i02 = new PointDTA(1300,600);

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