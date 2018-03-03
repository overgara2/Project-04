/*
Omar Vergara (20438054)
CSCI 3340-02
Project 3
2/23/2018
*/

package ticket;

import java.util.ArrayList;


/**
 * Our "database" for the project, the model in MVC
 * @author trick
 */
public class TicketModel {
    Ticket currentTicket = new Ticket();
    ArrayList<Ticket> ticketList = new ArrayList();    

    /**
     * @return the ticketList
     */
    public ArrayList<Ticket> getTicketList() {
        return ticketList;
    }

    /**
     * @param ticketList the ticketList to set
     */
    public void setTicketList(ArrayList<Ticket> ticketList) {
        this.ticketList = ticketList;
    }
}
