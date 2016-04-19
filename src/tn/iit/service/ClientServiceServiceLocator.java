/**
 * ClientServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tn.iit.service;

public class ClientServiceServiceLocator extends org.apache.axis.client.Service implements tn.iit.service.ClientServiceService {

    public ClientServiceServiceLocator() {
    }


    public ClientServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ClientServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ClientServicePort
    private java.lang.String ClientServicePort_address = "http://localhost:8080/GestionBancaireEjb/ClientService";

    public java.lang.String getClientServicePortAddress() {
        return ClientServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ClientServicePortWSDDServiceName = "ClientServicePort";

    public java.lang.String getClientServicePortWSDDServiceName() {
        return ClientServicePortWSDDServiceName;
    }

    public void setClientServicePortWSDDServiceName(java.lang.String name) {
        ClientServicePortWSDDServiceName = name;
    }

    public tn.iit.service.ClientService getClientServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ClientServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getClientServicePort(endpoint);
    }

    public tn.iit.service.ClientService getClientServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            tn.iit.service.ClientServiceServiceSoapBindingStub _stub = new tn.iit.service.ClientServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getClientServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setClientServicePortEndpointAddress(java.lang.String address) {
        ClientServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (tn.iit.service.ClientService.class.isAssignableFrom(serviceEndpointInterface)) {
                tn.iit.service.ClientServiceServiceSoapBindingStub _stub = new tn.iit.service.ClientServiceServiceSoapBindingStub(new java.net.URL(ClientServicePort_address), this);
                _stub.setPortName(getClientServicePortWSDDServiceName());
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
        if ("ClientServicePort".equals(inputPortName)) {
            return getClientServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.iit.tn/", "ClientServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.iit.tn/", "ClientServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ClientServicePort".equals(portName)) {
            setClientServicePortEndpointAddress(address);
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
