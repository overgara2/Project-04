/*
Omar Vergara (20438054)
CSCI 3340-02
Project 3
2/23/2018
*/

package main;

import javafx.application.Application;
import javafx.scene.Scene;
import ticket.*;
import javafx.stage.Stage;

/**
 * Our main class
 * @author trick
 */
public class TicketCitation extends Application {
    
    /**
     * Starts our MVC application
     * @param primaryStage 
     */
    @Override
    public void start(Stage primaryStage) {
        //Initializing our MVC within the main method
        TicketView tV = new TicketView();
        TicketModel tM = new TicketModel();
        TicketController tC = new TicketController(tM, tV);
        
        //Creates the scene with the TicketView class
        Scene scene = new Scene(tV, 1000, 600);
        
        primaryStage.setTitle("Parking Ticket Citation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
