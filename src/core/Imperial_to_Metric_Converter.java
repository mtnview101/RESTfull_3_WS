package core;

import java.text.DecimalFormat;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/")
public class Imperial_to_Metric_Converter {
      DecimalFormat df = new DecimalFormat("####0.00");
      
      @GET
      @Path("/dmitry")
      public String qa() {
   	   //Execute your web service in your browser: (http://localhost:89/RESTfull_3_WS/microsoft/dmitry)
            return "Today is Postman event day. Web service is using GET method by Dmitry Nakhabtsev"; }
      
      @GET
      @Path("xml/kg=>lb/{input}")
      @Produces("application/xml")
      public String kg_to_lb_xml(
      //Execute your web service in your browser: (http://localhost:89/RESTfull_3_WS/microsoft/xml/kg=>lb/100)
                   @DefaultValue("1") 
                   @PathParam("input") Double input) {
                   Double kg = input;
                   Double lb = kg * 2.2046;
      
                   String kg_out = df.format(kg).toString();
                   String lb_out = df.format(lb).toString();
            return "<calc conversion=\"kg to lb\">" + "<kg>" + kg_out + "</kg>" + "<lb>" + lb_out + "</lb>" + "</calc>";
      }
      
      @GET
      @Path("json/kg=>lb/{input}")
      @Produces("application/json")
      public String kg_to_lb_json(
      //Execute your web service in your browser: (http://localhost:89/RESTfull_3_WS/microsoft/json/kg=>lb/100)
                   @DefaultValue("1") 
                   @PathParam("input") Double input) {
                   Double kg = input;
                   Double lb = kg * 2.2046;
      
                   String kg_out = df.format(kg).toString();
                   String lb_out = df.format(lb).toString();
                   return "{\"calc\": {\"conversion\": \"kg to lb\", \"kg\": " + kg_out + ", \"lb\": " + lb_out + "}}";
      }
}

