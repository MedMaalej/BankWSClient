/**
 * CompteBancaireService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tn.iit.service;

public interface CompteBancaireService extends java.rmi.Remote {
    public tn.iit.service.CompteBancaireDTO getById(long arg0) throws java.rmi.RemoteException;
    public int deleteCompteBancaire(long arg0) throws java.rmi.RemoteException;
    public void updateCompte(tn.iit.service.CompteBancaireDTO arg0) throws java.rmi.RemoteException;
    public tn.iit.service.CompteBancaireDTO[] showCompteBancaire() throws java.rmi.RemoteException;
    public void ajoutCompteBancaire(tn.iit.service.CompteBancaireDTO arg0) throws java.rmi.RemoteException;
}
