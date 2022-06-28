public class Point {

  // DECLARATION
  private int xAxis;
  private int yAxis;

  // CONSTRUCTOR
  Point(int xAxisArg, int yAxisArg) {
    this.xAxis = xAxisArg;
    this.yAxis = yAxisArg;
  }

  // GET METHODS
  public int getXAxis() {
    return this.xAxis;
  }

  public int getYAxis() {
    return this.yAxis;
  }

  // SET METHODS
  public void setXAxis(int xAxisArg) {
    this.xAxis = xAxisArg;
  }

  public void setYAxis(int yAxisArg) {
    this.yAxis = yAxisArg;
  }
}