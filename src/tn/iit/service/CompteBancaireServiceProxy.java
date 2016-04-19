package tn.iit.service;

public class CompteBancaireServiceProxy implements tn.iit.service.CompteBancaireService {
  private String _endpoint = null;
  private tn.iit.service.CompteBancaireService compteBancaireService = null;
  
  public CompteBancaireServiceProxy() {
    _initCompteBancaireServiceProxy();
  }
  
  public CompteBancaireServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCompteBancaireServiceProxy();
  }
  
  private void _initCompteBancaireServiceProxy() {
    try {
      compteBancaireService = (new tn.iit.service.CompteBancaireServiceServiceLocator()).getCompteBancaireServicePort();
      if (compteBancaireService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)compteBancaireService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)compteBancaireService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (compteBancaireService != null)
      ((javax.xml.rpc.Stub)compteBancaireService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public tn.iit.service.CompteBancaireService getCompteBancaireService() {
    if (compteBancaireService == null)
      _initCompteBancaireServiceProxy();
    return compteBancaireService;
  }
  
  public tn.iit.service.CompteBancaireDTO getById(long arg0) throws java.rmi.RemoteException{
    if (compteBancaireService == null)
      _initCompteBancaireServiceProxy();
    return compteBancaireService.getById(arg0);
  }
  
  public int deleteCompteBancaire(long arg0) throws java.rmi.RemoteException{
    if (compteBancaireService == null)
      _initCompteBancaireServiceProxy();
    return compteBancaireService.deleteCompteBancaire(arg0);
  }
  
  public void updateCompte(tn.iit.service.CompteBancaireDTO arg0) throws java.rmi.RemoteException{
    if (compteBancaireService == null)
      _initCompteBancaireServiceProxy();
    compteBancaireService.updateCompte(arg0);
  }
  
  public tn.iit.service.CompteBancaireDTO[] showCompteBancaire() throws java.rmi.RemoteException{
    if (compteBancaireService == null)
      _initCompteBancaireServiceProxy();
    return compteBancaireService.showCompteBancaire();
  }
  
  public void ajoutCompteBancaire(tn.iit.service.CompteBancaireDTO arg0) throws java.rmi.RemoteException{
    if (compteBancaireService == null)
      _initCompteBancaireServiceProxy();
    compteBancaireService.ajoutCompteBancaire(arg0);
  }
  
  
}