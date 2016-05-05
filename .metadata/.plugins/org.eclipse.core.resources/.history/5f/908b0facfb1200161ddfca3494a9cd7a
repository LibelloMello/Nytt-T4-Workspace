package se.lu.ics.grupp11.ERP;

public class WebServiceERPSoapProxy implements se.lu.ics.grupp11.ERP.WebServiceERPSoap {
  private String _endpoint = null;
  private se.lu.ics.grupp11.ERP.WebServiceERPSoap webServiceERPSoap = null;
  
  public WebServiceERPSoapProxy() {
    _initWebServiceERPSoapProxy();
  }
  
  public WebServiceERPSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebServiceERPSoapProxy();
  }
  
  private void _initWebServiceERPSoapProxy() {
    try {
      webServiceERPSoap = (new se.lu.ics.grupp11.ERP.WebServiceERPLocator()).getWebServiceERPSoap();
      if (webServiceERPSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webServiceERPSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webServiceERPSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webServiceERPSoap != null)
      ((javax.xml.rpc.Stub)webServiceERPSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public se.lu.ics.grupp11.ERP.WebServiceERPSoap getWebServiceERPSoap() {
    if (webServiceERPSoap == null)
      _initWebServiceERPSoapProxy();
    return webServiceERPSoap;
  }
  
  public java.lang.String hello() throws java.rmi.RemoteException{
    if (webServiceERPSoap == null)
      _initWebServiceERPSoapProxy();
    return webServiceERPSoap.hello();
  }
  
  public java.lang.String[][] getAllEmployeesRelatives() throws java.rmi.RemoteException{
    if (webServiceERPSoap == null)
      _initWebServiceERPSoapProxy();
    return webServiceERPSoap.getAllEmployeesRelatives();
  }
  
  public java.lang.String[][] getAllEmployees() throws java.rmi.RemoteException{
    if (webServiceERPSoap == null)
      _initWebServiceERPSoapProxy();
    return webServiceERPSoap.getAllEmployees();
  }
  
  public java.lang.String[][] getAllSickEmployees2004() throws java.rmi.RemoteException{
    if (webServiceERPSoap == null)
      _initWebServiceERPSoapProxy();
    return webServiceERPSoap.getAllSickEmployees2004();
  }
  
  public java.lang.String[][] getEmployeeWithMostAbsence() throws java.rmi.RemoteException{
    if (webServiceERPSoap == null)
      _initWebServiceERPSoapProxy();
    return webServiceERPSoap.getEmployeeWithMostAbsence();
  }
  
  public java.lang.String[][] getCronusKeys() throws java.rmi.RemoteException{
    if (webServiceERPSoap == null)
      _initWebServiceERPSoapProxy();
    return webServiceERPSoap.getCronusKeys();
  }
  
  public java.lang.String[][] getCronusIndexes() throws java.rmi.RemoteException{
    if (webServiceERPSoap == null)
      _initWebServiceERPSoapProxy();
    return webServiceERPSoap.getCronusIndexes();
  }
  
  public java.lang.String[][] getCronusTableConstraints() throws java.rmi.RemoteException{
    if (webServiceERPSoap == null)
      _initWebServiceERPSoapProxy();
    return webServiceERPSoap.getCronusTableConstraints();
  }
  
  public java.lang.String[][] getCronusTables() throws java.rmi.RemoteException{
    if (webServiceERPSoap == null)
      _initWebServiceERPSoapProxy();
    return webServiceERPSoap.getCronusTables();
  }
  
  public java.lang.String[][] getCronusTables1() throws java.rmi.RemoteException{
    if (webServiceERPSoap == null)
      _initWebServiceERPSoapProxy();
    return webServiceERPSoap.getCronusTables1();
  }
  
  public java.lang.String[][] getCronusEmployeeColumns() throws java.rmi.RemoteException{
    if (webServiceERPSoap == null)
      _initWebServiceERPSoapProxy();
    return webServiceERPSoap.getCronusEmployeeColumns();
  }
  
  public java.lang.String[][] getCronusEmployeeColumns1() throws java.rmi.RemoteException{
    if (webServiceERPSoap == null)
      _initWebServiceERPSoapProxy();
    return webServiceERPSoap.getCronusEmployeeColumns1();
  }
  
  public void updateEmployee(java.lang.String id, java.lang.String name) throws java.rmi.RemoteException{
    if (webServiceERPSoap == null)
      _initWebServiceERPSoapProxy();
    webServiceERPSoap.updateEmployee(id, name);
  }
  
  public void addEmployee(java.lang.String id, java.lang.String name) throws java.rmi.RemoteException{
    if (webServiceERPSoap == null)
      _initWebServiceERPSoapProxy();
    webServiceERPSoap.addEmployee(id, name);
  }
  
  public void deleteEmployee(java.lang.String id) throws java.rmi.RemoteException{
    if (webServiceERPSoap == null)
      _initWebServiceERPSoapProxy();
    webServiceERPSoap.deleteEmployee(id);
  }
  
  
}