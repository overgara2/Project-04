/*
Omar Vergara (20438054)
CSCI 3340-02
Project 3
2/23/2018
*/

package ticket;

import javafx.application.Platform;
import javafx.event.ActionEvent;


/**
 * This is our controller it uses TicketModel and TicketView to operate data
 * @author trick
 */
public class TicketController {
    TicketModel ticketModel;
    TicketView ticketView;

    /**
     * Class constructor using TicketModel and TicketView as parameters
     * @param tM    a TicketModel object
     * @param tV    a TicketView object
     */
    public TicketController(TicketModel tM, TicketView tV) {
        this.ticketModel = tM;
        this.ticketView = tV;
        attachHandlers();
    }
    
    /**
     * Attaches handlers for GUI
     * These are the button actions used last project
     */
    public void attachHandlers() {
        ticketView.button1.setOnAction((ActionEvent event) -> {
            Ticket currentTicket = new Ticket(ticketView.licenseTF.getText(),
                    ticketView.stateTF.getText(), ticketView.permitTF.getText(), ticketView.makeModelTF.getText(),
                    ticketView.colorTF.getText(), ticketView.reasonTF.getText(), ticketView.dateTF.getText(),
                    ticketView.timeTF.getText(), ticketView.locationTF.getText(), ticketView.issuerTF.getText(),
                    "Unpaid");
            
            ticketModel.getTicketList().add(currentTicket);
        });
        
        ticketView.button2.setOnAction((ActionEvent event) -> {
            
            try {                                  
                ticketView.outputLabel.setText(
                        "Ticket No. " + (ticketView.i+1) + "\t"
                        + ticketModel.getTicketList().get(ticketView.i).getPaidStatus() + "\n"
                        + "License:\t\tState:\t\tPermit:\n"
                        + ticketModel.getTicketList().get(ticketView.i).getLicense() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getState() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getPermit() + "\n"
                        + "Make/Model:\t\tColor:\n"
                        + ticketModel.getTicketList().get(ticketView.i).getMakeModel() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getColor() + "\n"
                        + "Reason:\n"
                        + ticketModel.getTicketList().get(ticketView.i).getReason() + "\n"
                        + "Date:\t\tLocation\n"
                        + ticketModel.getTicketList().get(ticketView.i).getDate() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getLocation() + "\n"
                        + "Time:\t\tIssuedBy:\n"
                        + ticketModel.getTicketList().get(ticketView.i).getTime() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getIssuer());
                
                ticketView.i++;
            }
            catch (IndexOutOfBoundsException e) {
                ticketView.outputLabel.setText("No ticket found.");
            }
                    
            });
        
        ticketView.button3.setOnAction((ActionEvent event) -> {      
            try {
                 ticketView.i--;
                
                ticketView.outputLabel.setText(
                        "Ticket No. " + (ticketView.i+1) + "\t"
                        + ticketModel.getTicketList().get(ticketView.i).getPaidStatus() + "\n"
                        + "License:\t\tState:\t\tPermit:\n"
                        + ticketModel.getTicketList().get(ticketView.i).getLicense() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getState() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getPermit() + "\n"
                        + "Make/Model:\t\tColor:\n"
                        + ticketModel.getTicketList().get(ticketView.i).getMakeModel() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getColor() + "\n"
                        + "Reason:\n"
                        + ticketModel.getTicketList().get(ticketView.i).getReason() + "\n"
                        + "Date:\t\tLocation\n"
                        + ticketModel.getTicketList().get(ticketView.i).getDate() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getLocation() + "\n"
                        + "Time:\t\tIssuedBy:\n"
                        + ticketModel.getTicketList().get(ticketView.i).getTime() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getIssuer());             
            }
            catch (IndexOutOfBoundsException e) {
                ticketView.outputLabel.setText("No ticket found.");
                ticketView.i = 0;
            }
            });
        
        ticketView.button4.setOnAction((ActionEvent event) -> {
            try {
            if (ticketModel.getTicketList().get(ticketView.i).getPaidStatus().equalsIgnoreCase("Unpaid")) {
                ticketModel.getTicketList().get(ticketView.i).setPaidStatus("Paid");
                
                    ticketView.outputLabel.setText(
                        "Ticket No. " + (ticketView.i+1) + "\t"
                        + ticketModel.getTicketList().get(ticketView.i).getPaidStatus() + "\n"
                        + "License:\t\tState:\t\tPermit:\n"
                        + ticketModel.getTicketList().get(ticketView.i).getLicense() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getState() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getPermit() + "\n"
                        + "Make/Model:\t\tColor:\n"
                        + ticketModel.getTicketList().get(ticketView.i).getMakeModel() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getColor() + "\n"
                        + "Reason:\n"
                        + ticketModel.getTicketList().get(ticketView.i).getReason() + "\n"
                        + "Date:\t\tLocation\n"
                        + ticketModel.getTicketList().get(ticketView.i).getDate() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getLocation() + "\n"
                        + "Time:\t\tIssuedBy:\n"
                        + ticketModel.getTicketList().get(ticketView.i).getTime() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getIssuer()); 
            }                
            else {
                ticketModel.getTicketList().get(ticketView.i).setPaidStatus("Unpaid");
                
                    ticketView.outputLabel.setText(
                        "Ticket No. " + (ticketView.i+1) + "\t"
                        + ticketModel.getTicketList().get(ticketView.i).getPaidStatus() + "\n"
                        + "License:\t\tState:\t\tPermit:\n"
                        + ticketModel.getTicketList().get(ticketView.i).getLicense() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getState() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getPermit() + "\n"
                        + "Make/Model:\t\tColor:\n"
                        + ticketModel.getTicketList().get(ticketView.i).getMakeModel() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getColor() + "\n"
                        + "Reason:\n"
                        + ticketModel.getTicketList().get(ticketView.i).getReason() + "\n"
                        + "Date:\t\tLocation\n"
                        + ticketModel.getTicketList().get(ticketView.i).getDate() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getLocation() + "\n"
                        + "Time:\t\tIssuedBy:\n"
                        + ticketModel.getTicketList().get(ticketView.i).getTime() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getIssuer());
            }
            }
            catch (IndexOutOfBoundsException e) {
                ticketView.i--;
                if (ticketModel.getTicketList().get(ticketView.i).getPaidStatus().equalsIgnoreCase("Unpaid")) {
                ticketModel.getTicketList().get(ticketView.i).setPaidStatus("Paid");
                
                    ticketView.outputLabel.setText(
                        "Ticket No. " + (ticketView.i+1) + "\t"
                        + ticketModel.getTicketList().get(ticketView.i).getPaidStatus() + "\n"
                        + "License:\t\tState:\t\tPermit:\n"
                        + ticketModel.getTicketList().get(ticketView.i).getLicense() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getState() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getPermit() + "\n"
                        + "Make/Model:\t\tColor:\n"
                        + ticketModel.getTicketList().get(ticketView.i).getMakeModel() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getColor() + "\n"
                        + "Reason:\n"
                        + ticketModel.getTicketList().get(ticketView.i).getReason() + "\n"
                        + "Date:\t\tLocation\n"
                        + ticketModel.getTicketList().get(ticketView.i).getDate() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getLocation() + "\n"
                        + "Time:\t\tIssuedBy:\n"
                        + ticketModel.getTicketList().get(ticketView.i).getTime() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getIssuer()); 
            }                
            else {
                ticketModel.getTicketList().get(ticketView.i).setPaidStatus("Unpaid");
                
                    ticketView.outputLabel.setText(
                        "Ticket No. " + (ticketView.i+1) + "\t"
                        + ticketModel.getTicketList().get(ticketView.i).getPaidStatus() + "\n"
                        + "License:\t\tState:\t\tPermit:\n"
                        + ticketModel.getTicketList().get(ticketView.i).getLicense() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getState() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getPermit() + "\n"
                        + "Make/Model:\t\tColor:\n"
                        + ticketModel.getTicketList().get(ticketView.i).getMakeModel() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getColor() + "\n"
                        + "Reason:\n"
                        + ticketModel.getTicketList().get(ticketView.i).getReason() + "\n"
                        + "Date:\t\tLocation\n"
                        + ticketModel.getTicketList().get(ticketView.i).getDate() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getLocation() + "\n"
                        + "Time:\t\tIssuedBy:\n"
                        + ticketModel.getTicketList().get(ticketView.i).getTime() + "\t\t"
                        + ticketModel.getTicketList().get(ticketView.i).getIssuer());
            }
            }
            });
        
        ticketView.button5.setOnAction((ActionEvent event) -> {    
             Platform.exit();
         });
    }        
}
