package se.lu.ics.grupp11;

public class FileServiceSoapProxy implements se.lu.ics.grupp11.FileServiceSoap {
  private String _endpoint = null;
  private se.lu.ics.grupp11.FileServiceSoap fileServiceSoap = null;
  
  public FileServiceSoapProxy() {
    _initFileServiceSoapProxy();
  }
  
  public FileServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initFileServiceSoapProxy();
  }
  
  private void _initFileServiceSoapProxy() {
    try {
      fileServiceSoap = (new se.lu.ics.grupp11.FileServiceLocator()).getFileServiceSoap();
      if (fileServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)fileServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)fileServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (fileServiceSoap != null)
      ((javax.xml.rpc.Stub)fileServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public se.lu.ics.grupp11.FileServiceSoap getFileServiceSoap() {
    if (fileServiceSoap == null)
      _initFileServiceSoapProxy();
    return fileServiceSoap;
  }
  
  public java.lang.String readFile(java.lang.String name) throws java.rmi.RemoteException{
    if (fileServiceSoap == null)
      _initFileServiceSoapProxy();
    return fileServiceSoap.readFile(name);
  }
  
  
}