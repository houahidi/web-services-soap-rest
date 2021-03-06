package fr.orsys.clients.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBElement;

@Path("/clientsrs/json/")
public class ClientsRestJSON {
	
	private static List<Client> clients;
	
	
	static {
		
		clients = new ArrayList<>(10);
		clients.add(new Client(1,"Nom 1", "Prenom 1"));
		clients.add(new Client(2,"Nom 2", "Prenom 2"));
		clients.add(new Client(3,"Nom 3", "Prenom 3"));
		clients.add(new Client(4,"Nom 4", "Prenom 4"));
	}
	
	public ClientsRestJSON() {
		System.out.println("Phase : Instanciation");
		
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Client> searchClients(){
		return clients;
	}
	
	@GET
	@Path("/id/{ident: \\d+}")
	@Produces(MediaType.APPLICATION_JSON)
	public Client searchClientById(@PathParam("ident") long id){
		Client client = null;
		
		for (Client c : clients)
			if(c.getId() == id) {
				client = c;
				break;
			}	
		return client;
	}
	
	@GET
	@Path("/nom/{nom: [a-zA-Z0-9]*}/prenom/{prenom: [a-zA-Z0-9]*}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Client> searchClientByCriterias(@PathParam("nom") String nom,  @PathParam("prenom") String prenom){
		
		System.out.println("searchClientByCriterias : "+ nom + " "+prenom);
		List<Client> liste = new ArrayList<>();
		
		for (Client c : clients)
			if(c.getNom().toLowerCase().contains(nom) || c.getPrenom().toLowerCase().contains(prenom) ) {
				liste.add(c);
			}	
		return liste;
	}
	
	
	@DELETE
	@Path("/id/{ident: \\d+}")
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteClientById(@PathParam("ident") long id){
		Client client = null;
		
		for (Client c : clients)
			if(c.getId() == id) {
				client = c;
				break;
			}	
		if(client != null ) {
			clients.remove(client);
			return "OK";
		}else {
			return "KO";
		}
			
	}
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public List<Client> addClient(@FormParam("id") long id, 
							@FormParam("nom") String nom,
							@FormParam("prenom") String prenom){
		Client client = new Client(id, nom, prenom);
		clients.add(client);
		return clients;	
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Client> addClient(Client client){
		System.out.println("addClient POST XML");
		clients.add(client);
		return clients;	
	}
	
	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateClient(Client inClient){
		System.out.println("updateClient PUT");
		
		Client c = searchClientById(inClient.getId());
		
		if (c != null ) {
			
			//int indice = clients.indexOf(c);
			
			//clients.add(indice, inClient);
			c.setNom(inClient.getNom());
			c.setPrenom(inClient.getPrenom());
			return "OK";
		}
		return "KO";
	}

}
