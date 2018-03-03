/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingticketcitationgui;

import java.util.ArrayList;

/**
 *
 * @author srv_veralab
 */
public class Data {
    private ArrayList<Ticket> ticketList = new ArrayList();    

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
