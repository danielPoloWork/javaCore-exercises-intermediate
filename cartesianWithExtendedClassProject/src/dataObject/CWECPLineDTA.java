package dataObject;

// This kind of structure must be used only in specific situation.
public class CWECPLineDTA extends CWECPPointDTA {

  private CWECPPointDTA endPoint;

  CWECPLineDTA(int xAxisArg, int yAxisArg, int pointXArg, int pointYArg) {
    super(xAxisArg, yAxisArg);
    this.endPoint = new CWECPPointDTA(pointXArg, pointYArg);
  }

  CWECPLineDTA(int xAxisArg, int yAxisArg) {
    super(xAxisArg, yAxisArg);
  }

  public CWECPPointDTA getEndPoint() {
    return this.endPoint;
  }
}
