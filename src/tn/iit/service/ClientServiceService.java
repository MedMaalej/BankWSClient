/**
 * ClientServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tn.iit.service;

public interface ClientServiceService extends javax.xml.rpc.Service {
    public java.lang.String getClientServicePortAddress();

    public tn.iit.service.ClientService getClientServicePort() throws javax.xml.rpc.ServiceException;

    public tn.iit.service.ClientService getClientServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
