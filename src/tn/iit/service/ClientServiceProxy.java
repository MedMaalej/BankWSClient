package tn.iit.service;

public class ClientServiceProxy implements tn.iit.service.ClientService {
  private String _endpoint = null;
  private tn.iit.service.ClientService clientService = null;
  
  public ClientServiceProxy() {
    _initClientServiceProxy();
  }
  
  public ClientServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initClientServiceProxy();
  }
  
  private void _initClientServiceProxy() {
    try {
      clientService = (new tn.iit.service.ClientServiceServiceLocator()).getClientServicePort();
      if (clientService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)clientService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)clientService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (clientService != null)
      ((javax.xml.rpc.Stub)clientService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public tn.iit.service.ClientService getClientService() {
    if (clientService == null)
      _initClientServiceProxy();
    return clientService;
  }
  
  public tn.iit.service.CompteBancaireDTO[] getComptes(tn.iit.service.Client arg0) throws java.rmi.RemoteException{
    if (clientService == null)
      _initClientServiceProxy();
    return clientService.getComptes(arg0);
  }
  
  public tn.iit.service.ClientDTO getClientById(long arg0) throws java.rmi.RemoteException{
    if (clientService == null)
      _initClientServiceProxy();
    return clientService.getClientById(arg0);
  }
  
  public void ajoutClient(tn.iit.service.ClientDTO arg0) throws java.rmi.RemoteException{
    if (clientService == null)
      _initClientServiceProxy();
    clientService.ajoutClient(arg0);
  }
  
  public tn.iit.service.ClientDTO[] allClient() throws java.rmi.RemoteException{
    if (clientService == null)
      _initClientServiceProxy();
    return clientService.allClient();
  }
  
  public void modifierClient(tn.iit.service.ClientDTO arg0) throws java.rmi.RemoteException{
    if (clientService == null)
      _initClientServiceProxy();
    clientService.modifierClient(arg0);
  }
  
  public void supprimerClient(long arg0) throws java.rmi.RemoteException{
    if (clientService == null)
      _initClientServiceProxy();
    clientService.supprimerClient(arg0);
  }
  
  public tn.iit.service.ClientDTO getClientByCin(java.lang.String arg0) throws java.rmi.RemoteException{
    if (clientService == null)
      _initClientServiceProxy();
    return clientService.getClientByCin(arg0);
  }
  
  
}