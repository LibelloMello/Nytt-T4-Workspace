/**
 * FileServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package se.lu.ics.grupp11;

public class FileServiceLocator extends org.apache.axis.client.Service implements se.lu.ics.grupp11.FileService {

    public FileServiceLocator() {
    }


    public FileServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FileServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FileServiceSoap
    private java.lang.String FileServiceSoap_address = "http://localhost:15285/FileService.asmx";

    public java.lang.String getFileServiceSoapAddress() {
        return FileServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FileServiceSoapWSDDServiceName = "FileServiceSoap";

    public java.lang.String getFileServiceSoapWSDDServiceName() {
        return FileServiceSoapWSDDServiceName;
    }

    public void setFileServiceSoapWSDDServiceName(java.lang.String name) {
        FileServiceSoapWSDDServiceName = name;
    }

    public se.lu.ics.grupp11.FileServiceSoap getFileServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FileServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFileServiceSoap(endpoint);
    }

    public se.lu.ics.grupp11.FileServiceSoap getFileServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            se.lu.ics.grupp11.FileServiceSoapStub _stub = new se.lu.ics.grupp11.FileServiceSoapStub(portAddress, this);
            _stub.setPortName(getFileServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFileServiceSoapEndpointAddress(java.lang.String address) {
        FileServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (se.lu.ics.grupp11.FileServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                se.lu.ics.grupp11.FileServiceSoapStub _stub = new se.lu.ics.grupp11.FileServiceSoapStub(new java.net.URL(FileServiceSoap_address), this);
                _stub.setPortName(getFileServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("FileServiceSoap".equals(inputPortName)) {
            return getFileServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://grupp11.ics.lu.se/", "FileService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://grupp11.ics.lu.se/", "FileServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FileServiceSoap".equals(portName)) {
            setFileServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
