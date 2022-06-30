package dataObject;

// This kind of structure must be used only in specific situation.
public class CWECPLineDTO extends CWECPPointDTO {

  private CWECPPointDTO endPoint;

  CWECPLineDTO(int xAxisArg, int yAxisArg, int pointXArg, int pointYArg) {
    super(xAxisArg, yAxisArg);
    this.endPoint = new CWECPPointDTO(pointXArg, pointYArg);
  }

  CWECPLineDTO(int xAxisArg, int yAxisArg) {
    super(xAxisArg, yAxisArg);
  }

  public CWECPPointDTO getEndPoint() {
    return this.endPoint;
  }
}
