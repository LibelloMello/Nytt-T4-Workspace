package se.lu.ics.grupp11;

public class WebServicePartycipateDBSoapProxy implements se.lu.ics.grupp11.WebServicePartycipateDBSoap {
  private String _endpoint = null;
  private se.lu.ics.grupp11.WebServicePartycipateDBSoap webServicePartycipateDBSoap = null;
  
  public WebServicePartycipateDBSoapProxy() {
    _initWebServicePartycipateDBSoapProxy();
  }
  
  public WebServicePartycipateDBSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebServicePartycipateDBSoapProxy();
  }
  
  private void _initWebServicePartycipateDBSoapProxy() {
    try {
      webServicePartycipateDBSoap = (new se.lu.ics.grupp11.WebServicePartycipateDBLocator()).getWebServicePartycipateDBSoap();
      if (webServicePartycipateDBSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webServicePartycipateDBSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webServicePartycipateDBSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webServicePartycipateDBSoap != null)
      ((javax.xml.rpc.Stub)webServicePartycipateDBSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public se.lu.ics.grupp11.WebServicePartycipateDBSoap getWebServicePartycipateDBSoap() {
    if (webServicePartycipateDBSoap == null)
      _initWebServicePartycipateDBSoapProxy();
    return webServicePartycipateDBSoap;
  }
  
  public se.lu.ics.grupp11.Event[] getEvents() throws java.rmi.RemoteException{
    if (webServicePartycipateDBSoap == null)
      _initWebServicePartycipateDBSoapProxy();
    return webServicePartycipateDBSoap.getEvents();
  }
  
  public se.lu.ics.grupp11.User[] getUsers() throws java.rmi.RemoteException{
    if (webServicePartycipateDBSoap == null)
      _initWebServicePartycipateDBSoapProxy();
    return webServicePartycipateDBSoap.getUsers();
  }
  
  
}