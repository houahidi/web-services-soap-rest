package fr.orsys.hello.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/hellors")
public class HelloRest {
	
	

	public HelloRest() {
		
	}
	

	@GET
	@Produces(MediaType.TEXT_HTML)
	
	public String displayHello() {
		
		return "<html><body><h3>Bonjour tout le monde</h3></body></html>";
	}
	
	

	@GET
	@Path("/xml")
	@Produces(MediaType.TEXT_XML)	
	public String displayHelloXML() {
		
		return "<?xml version='1.0'?> <message>Bonjour tout le monde</message>";
	}
	
}
