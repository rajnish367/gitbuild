package org.rajnish.restJersey.authentication;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
@Path("/secured")
@Produces(MediaType.APPLICATION_JSON)
public class BasicAuthentication
	{
		@Path("/message")
		@GET
		@Produces(MediaType.TEXT_PLAIN)
		public String secureMethod(){
			return "The API is secured ";
		}

	}
