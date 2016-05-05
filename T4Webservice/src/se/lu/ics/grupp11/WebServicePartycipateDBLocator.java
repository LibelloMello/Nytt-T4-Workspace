/**
 * WebServicePartycipateDBLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package se.lu.ics.grupp11;

public class WebServicePartycipateDBLocator extends org.apache.axis.client.Service implements se.lu.ics.grupp11.WebServicePartycipateDB {

    public WebServicePartycipateDBLocator() {
    }


    public WebServicePartycipateDBLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebServicePartycipateDBLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebServicePartycipateDBSoap
    private java.lang.String WebServicePartycipateDBSoap_address = "http://localhost:21970/WebServicePartycipateDB.asmx";

    public java.lang.String getWebServicePartycipateDBSoapAddress() {
        return WebServicePartycipateDBSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebServicePartycipateDBSoapWSDDServiceName = "WebServicePartycipateDBSoap";

    public java.lang.String getWebServicePartycipateDBSoapWSDDServiceName() {
        return WebServicePartycipateDBSoapWSDDServiceName;
    }

    public void setWebServicePartycipateDBSoapWSDDServiceName(java.lang.String name) {
        WebServicePartycipateDBSoapWSDDServiceName = name;
    }

    public se.lu.ics.grupp11.WebServicePartycipateDBSoap getWebServicePartycipateDBSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebServicePartycipateDBSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebServicePartycipateDBSoap(endpoint);
    }

    public se.lu.ics.grupp11.WebServicePartycipateDBSoap getWebServicePartycipateDBSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            se.lu.ics.grupp11.WebServicePartycipateDBSoapStub _stub = new se.lu.ics.grupp11.WebServicePartycipateDBSoapStub(portAddress, this);
            _stub.setPortName(getWebServicePartycipateDBSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebServicePartycipateDBSoapEndpointAddress(java.lang.String address) {
        WebServicePartycipateDBSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (se.lu.ics.grupp11.WebServicePartycipateDBSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                se.lu.ics.grupp11.WebServicePartycipateDBSoapStub _stub = new se.lu.ics.grupp11.WebServicePartycipateDBSoapStub(new java.net.URL(WebServicePartycipateDBSoap_address), this);
                _stub.setPortName(getWebServicePartycipateDBSoapWSDDServiceName());
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
        if ("WebServicePartycipateDBSoap".equals(inputPortName)) {
            return getWebServicePartycipateDBSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://grupp11.ics.lu.se/", "WebServicePartycipateDB");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://grupp11.ics.lu.se/", "WebServicePartycipateDBSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebServicePartycipateDBSoap".equals(portName)) {
            setWebServicePartycipateDBSoapEndpointAddress(address);
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
