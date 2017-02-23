package core;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class App {

       @GET
       @Path("/dmitry")
       public String qa() {
    	   //Execute your web service in your browser: (http://localhost:89/RESTfull_3_WS/microsoft/dmitry)
             return "This is Microsoft web service using GET method by Dmitry Nakhabtsev"; }}

