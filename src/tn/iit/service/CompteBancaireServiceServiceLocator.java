/**
 * CompteBancaireServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tn.iit.service;

public class CompteBancaireServiceServiceLocator extends org.apache.axis.client.Service implements tn.iit.service.CompteBancaireServiceService {

    public CompteBancaireServiceServiceLocator() {
    }


    public CompteBancaireServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CompteBancaireServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CompteBancaireServicePort
    private java.lang.String CompteBancaireServicePort_address = "http://localhost:8080/GestionBancaireEjb/CompteBancaireService";

    public java.lang.String getCompteBancaireServicePortAddress() {
        return CompteBancaireServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CompteBancaireServicePortWSDDServiceName = "CompteBancaireServicePort";

    public java.lang.String getCompteBancaireServicePortWSDDServiceName() {
        return CompteBancaireServicePortWSDDServiceName;
    }

    public void setCompteBancaireServicePortWSDDServiceName(java.lang.String name) {
        CompteBancaireServicePortWSDDServiceName = name;
    }

    public tn.iit.service.CompteBancaireService getCompteBancaireServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CompteBancaireServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCompteBancaireServicePort(endpoint);
    }

    public tn.iit.service.CompteBancaireService getCompteBancaireServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            tn.iit.service.CompteBancaireServiceServiceSoapBindingStub _stub = new tn.iit.service.CompteBancaireServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCompteBancaireServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCompteBancaireServicePortEndpointAddress(java.lang.String address) {
        CompteBancaireServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (tn.iit.service.CompteBancaireService.class.isAssignableFrom(serviceEndpointInterface)) {
                tn.iit.service.CompteBancaireServiceServiceSoapBindingStub _stub = new tn.iit.service.CompteBancaireServiceServiceSoapBindingStub(new java.net.URL(CompteBancaireServicePort_address), this);
                _stub.setPortName(getCompteBancaireServicePortWSDDServiceName());
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
        if ("CompteBancaireServicePort".equals(inputPortName)) {
            return getCompteBancaireServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.iit.tn/", "CompteBancaireServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.iit.tn/", "CompteBancaireServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CompteBancaireServicePort".equals(portName)) {
            setCompteBancaireServicePortEndpointAddress(address);
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
