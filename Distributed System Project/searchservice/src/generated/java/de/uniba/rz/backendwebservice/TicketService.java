
package de.uniba.rz.backendwebservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TicketService", targetNamespace = "http://backendWebService.rz.uniba.de/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TicketService {


    /**
     * 
     * @param typeOrdinal
     * @param priorityOrdinal
     * @param topic
     * @param description
     * @param reporter
     * @return
     *     returns de.uniba.rz.backendwebservice.Ticket
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createNewTicket", targetNamespace = "http://backendWebService.rz.uniba.de/", className = "de.uniba.rz.backendwebservice.CreateNewTicket")
    @ResponseWrapper(localName = "createNewTicketResponse", targetNamespace = "http://backendWebService.rz.uniba.de/", className = "de.uniba.rz.backendwebservice.CreateNewTicketResponse")
    @Action(input = "http://backendWebService.rz.uniba.de/TicketService/createNewTicketRequest", output = "http://backendWebService.rz.uniba.de/TicketService/createNewTicketResponse")
    public Ticket createNewTicket(
        @WebParam(name = "reporter", targetNamespace = "")
        String reporter,
        @WebParam(name = "topic", targetNamespace = "")
        String topic,
        @WebParam(name = "description", targetNamespace = "")
        String description,
        @WebParam(name = "typeOrdinal", targetNamespace = "")
        int typeOrdinal,
        @WebParam(name = "priorityOrdinal", targetNamespace = "")
        int priorityOrdinal);

    /**
     * 
     * @return
     *     returns java.util.List<de.uniba.rz.backendwebservice.Ticket>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllTicket", targetNamespace = "http://backendWebService.rz.uniba.de/", className = "de.uniba.rz.backendwebservice.GetAllTicket")
    @ResponseWrapper(localName = "getAllTicketResponse", targetNamespace = "http://backendWebService.rz.uniba.de/", className = "de.uniba.rz.backendwebservice.GetAllTicketResponse")
    @Action(input = "http://backendWebService.rz.uniba.de/TicketService/getAllTicketRequest", output = "http://backendWebService.rz.uniba.de/TicketService/getAllTicketResponse")
    public List<Ticket> getAllTicket();

}
