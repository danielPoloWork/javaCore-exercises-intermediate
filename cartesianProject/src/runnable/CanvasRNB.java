package runnable;

import dataObject.LineDTO;
import dataObject.PointDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class CanvasRNB extends JComponent {

  public static void main(String[] args) {

    List<PointDTO> coordinatesList = setCoordinates();
    LineDTO line = new LineDTO(coordinatesList);

    getWindow(line);
  }

  private static void getWindow(LineDTO lineArgs) {
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

  private static List<PointDTO> setCoordinates() {
    List<PointDTO> points = new ArrayList<PointDTO>();

    PointDTO d01 = new PointDTO(100,100);
    PointDTO d02 = new PointDTO(100,600);
    PointDTO d03 = new PointDTO(100,600);
    PointDTO d04 = new PointDTO(400,600);
    PointDTO d05 = new PointDTO(400,600);
    PointDTO d06 = new PointDTO(400,300);
    PointDTO d07 = new PointDTO(400,300);
    PointDTO d08 = new PointDTO(100,100);

    PointDTO a01 = new PointDTO(500,100);
    PointDTO a02 = new PointDTO(500,600);
    PointDTO a03 = new PointDTO(500,100);
    PointDTO a04 = new PointDTO(800,100);
    PointDTO a05 = new PointDTO(800,100);
    PointDTO a06 = new PointDTO(800,600);
    PointDTO a07 = new PointDTO(500,300);
    PointDTO a08 = new PointDTO(800,300);

    PointDTO n01 = new PointDTO(900,100);
    PointDTO n02 = new PointDTO(900,600);
    PointDTO n03 = new PointDTO(1200,100);
    PointDTO n04 = new PointDTO(1200,600);
    PointDTO n05 = new PointDTO(900,100);
    PointDTO n06 = new PointDTO(1200,300);

    PointDTO i01 = new PointDTO(1300,100);
    PointDTO i02 = new PointDTO(1300,600);

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