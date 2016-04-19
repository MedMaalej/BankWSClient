/**
 * ClientService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tn.iit.service;

public interface ClientService extends java.rmi.Remote {
    public tn.iit.service.CompteBancaireDTO[] getComptes(tn.iit.service.Client arg0) throws java.rmi.RemoteException;
    public tn.iit.service.ClientDTO getClientById(long arg0) throws java.rmi.RemoteException;
    public void ajoutClient(tn.iit.service.ClientDTO arg0) throws java.rmi.RemoteException;
    public tn.iit.service.ClientDTO[] allClient() throws java.rmi.RemoteException;
    public void modifierClient(tn.iit.service.ClientDTO arg0) throws java.rmi.RemoteException;
    public void supprimerClient(long arg0) throws java.rmi.RemoteException;
    public tn.iit.service.ClientDTO getClientByCin(java.lang.String arg0) throws java.rmi.RemoteException;
}
