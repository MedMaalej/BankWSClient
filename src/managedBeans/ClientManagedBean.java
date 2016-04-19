package managedBeans;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ContextNotActiveException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.flow.FlowScoped;
import javax.xml.rpc.ServiceException;

import tn.iit.service.Client;
import tn.iit.service.ClientDTO;
import tn.iit.service.ClientService;
import tn.iit.service.ClientServiceServiceLocator;
import tn.iit.service.CompteBancaireDTO;

@ManagedBean(name = "client")
@SessionScoped
@FlowScoped("flow")
public class ClientManagedBean {
	private long id;
	private String nom;
	private String prenom;
	private String cin;
	private String adresse;
	private long rib;
	private float solde;
	private List<CompteBancaireDTO> comptes;
	private static List<ClientDTO> allClients;

	public ClientManagedBean() {
		getAll();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public long getRib() {
		return rib;
	}

	public void setRib(long rib) {
		this.rib = rib;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public List<ClientDTO> getAllClients() {
		return allClients;
	}

	public void setAllClients(List<ClientDTO> allClients) {
		this.allClients = allClients;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public List<CompteBancaireDTO> getComptes() {
		return comptes;
	}

	public void setComptes(List<CompteBancaireDTO> comptes) {
		this.comptes = comptes;
	}

	public void getClientInfoById() {

		try {
			ClientServiceServiceLocator locator = new ClientServiceServiceLocator();
			ClientService service = locator.getClientServicePort();
			ClientDTO client = service.getClientById(id);
			nom = client.getNom();
			prenom = client.getPrenom();
			adresse = client.getAdresse();
			cin = client.getCin();
			getAllComptes();
			// System.out.println(id);

		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ContextNotActiveException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void getAll() {
		try {
			List<ClientDTO> list = new ArrayList<ClientDTO>();
			ClientServiceServiceLocator locator = new ClientServiceServiceLocator();
			ClientService service = locator.getClientServicePort();

			ClientDTO[] clients = service.allClient();
			for (int i = 0; i < clients.length; i++) {
				list.add(clients[i]);
				// System.out.println(clients[i].getNom());
			}
			allClients = list;
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void getAllComptes() {
		try {
			List<CompteBancaireDTO> list = new ArrayList<CompteBancaireDTO>();
			ClientServiceServiceLocator locator = new ClientServiceServiceLocator();
			ClientService service = locator.getClientServicePort();
			Client client = new Client();
			client.setId(id);
			client.setNom(nom);
			client.setPrenom(prenom);
			client.setCin(cin);
			client.setAdresse(adresse);
			CompteBancaireDTO[] comptesArray = service.getComptes(client);
			for (int i = 0; i < comptesArray.length; i++) {
				list.add(comptesArray[i]);
				System.out.println(comptesArray[i].getRib());

			}
			comptes = list;
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
