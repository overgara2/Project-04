/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parkingticketcitationgui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author srv_veralab
 */
public class GUI extends Application{
        BorderPane root = new BorderPane();
        GridPane grid = new GridPane();
        GridPane grid2 = new GridPane();
        
        Label titleLabel = new Label();
        Label licenseLabel = new Label();
        Label stateLabel = new Label();
        Label permitLabel = new Label();
        Label makeModelLabel = new Label();
        Label colorLabel = new Label();
        Label reasonLabel = new Label();
        Label dateLabel = new Label();
        Label timeLabel = new Label();
        Label locationLabel = new Label();
        Label issuerLabel = new Label();
        Label outputLabel = new Label();

        
        TextField licenseTF = new TextField();
        TextField stateTF = new TextField();
        TextField permitTF = new TextField();
        TextField makeModelTF = new TextField();
        TextField colorTF = new TextField();
        TextField reasonTF = new TextField();
        TextField dateTF = new TextField();
        TextField timeTF = new TextField();
        TextField locationTF = new TextField();
        TextField issuerTF = new TextField();
        TextField paymentInfoTF = new TextField();
        
        Text paidStatus = new Text();
        
        TextArea paymentInfo = new TextArea();
        TextArea ticketInfo = new TextArea();
        
        Button button1 = new Button();
        Button button2 = new Button();
        Button button3 = new Button();
        Button button4 = new Button();
        Button button5 = new Button();
        
        Data data = new Data();
        
        int i;
        
        HBox hBox1 = new HBox();
        HBox hBox2 = new HBox();
        VBox vBox1 = new VBox();
        
        
        
        
        
        
    @Override
    public void start(Stage primaryStage) {
        
        titleLabel.setText("Parking Ticket Citation");
        titleLabel.setFont(Font.font("", 24));
        licenseLabel.setText("License:");
        stateLabel.setText("State:");
        permitLabel.setText("Permit:");
        makeModelLabel.setText("Make/Model:"); 
        colorLabel.setText("Color:");
        reasonLabel.setText("Reason:"); 
        dateLabel.setText("Date:"); 
        timeLabel.setText("Time:"); 
        locationLabel.setText("Location:");
        issuerLabel.setText("Issuer:");
        
        button1.setText("Submit");
        button2.setText("Print Next");
        button3.setText("Print Previous");
        button4.setText("Paid/Unpaid");
        button5.setText("Exit");
        
        paymentInfo.setText("Payments can be made at the following office:\n"
                + "Business Office, Tandy 107\n"
                + "Monday thru Friday: 8:00am-5:00pm\n"
                + "$25 per citation, other fees may apply\n"
                + "$100 for boot removal\n\n"
                + "Payment can be mailed to the following address:\n\n"
                + "TSC\n"
                + "C/O Finance Dept\n"
                + "80 Fort Brown\n"
                + "Brownsville, TX 78520\n\n"
                + "DO NOT MAIL IN CASH!\n"
                + "For more information on parking citations please visit:\n"
                + "www.tsc.edu/parking");
        
        i = 0;
        
        hBox1.getChildren().add(titleLabel);
        hBox1.setAlignment(Pos.CENTER);
        root.setTop(hBox1);
        
        grid.setAlignment(Pos.CENTER);
        grid.addRow(0, licenseLabel, stateLabel, permitLabel);
        grid.addRow(1, licenseTF, stateTF, permitTF);
        grid.addRow(2, makeModelLabel, colorLabel);
        grid.addRow(3, makeModelTF, colorTF);
        grid.addRow(4, reasonLabel);
        grid.addRow(5, reasonTF);
        grid.addRow(6, dateLabel, locationLabel);
        grid.addRow(7, dateTF, locationTF);
        grid.addRow(8, timeLabel, issuerLabel);
        grid.addRow(9, timeTF, issuerTF);
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setAlignment(Pos.CENTER);
        root.setCenter(grid);
        
        grid2.setAlignment(Pos.CENTER_RIGHT);
        grid2.setHgap(5);
        grid2.setVgap(5);
        grid2.addRow(0, button1);
        grid2.addRow(1, button2, button3);
        grid2.addRow(2, button4);
        grid2.addRow(3);
        grid2.addRow(4, button5);
        root.setLeft(grid2);
        
        
        paymentInfo.setMaxSize(330, 400);
        vBox1.getChildren().add(paymentInfo);

        vBox1.setAlignment(Pos.CENTER);
        root.setRight(vBox1);
        
        
        hBox2.getChildren().add(outputLabel);
        hBox2.setAlignment(Pos.CENTER);
        root.setBottom(hBox2);
     
        
        
        
        
        
        button1.setOnAction((ActionEvent event) -> {
            Ticket currentTicket = new Ticket(licenseTF.getText(),
                    stateTF.getText(), permitTF.getText(), makeModelTF.getText(),
                    colorTF.getText(), reasonTF.getText(), dateTF.getText(),
                    timeTF.getText(), locationTF.getText(), issuerTF.getText(),
                    "Unpaid");
            
            data.getTicketList().add(currentTicket);
        });              
        
        
        button2.setOnAction((ActionEvent event) -> {
            
            try {                                  
                outputLabel.setText(
                        "Ticket No. " + (i+1) + "\t"
                        + data.getTicketList().get(i).getPaidStatus() + "\n"
                        + "License:\t\tState:\t\tPermit:\n"
                        + data.getTicketList().get(i).getLicense() + "\t\t"
                        + data.getTicketList().get(i).getState() + "\t\t"
                        + data.getTicketList().get(i).getPermit() + "\n"
                        + "Make/Model:\t\tColor:\n"
                        + data.getTicketList().get(i).getMakeModel() + "\t\t"
                        + data.getTicketList().get(i).getColor() + "\n"
                        + "Reason:\n"
                        + data.getTicketList().get(i).getReason() + "\n"
                        + "Date:\t\tLocation\n"
                        + data.getTicketList().get(i).getDate() + "\t\t"
                        + data.getTicketList().get(i).getLocation() + "\n"
                        + "Time:\t\tIssuedBy:\n"
                        + data.getTicketList().get(i).getTime() + "\t\t"
                        + data.getTicketList().get(i).getIssuer());
                
                i++;
            }
            catch (IndexOutOfBoundsException e) {
                outputLabel.setText("No ticket found.");
            }
                    
            });
        
        button3.setOnAction((ActionEvent event) -> {      
            try {
                i--;
                
                outputLabel.setText(
                        "Ticket No. " + (i+1) + "\t"
                        + data.getTicketList().get(i).getPaidStatus() + "\n"
                        + "License:\t\tState:\t\tPermit:\n"
                        + data.getTicketList().get(i).getLicense() + "\t\t"
                        + data.getTicketList().get(i).getState() + "\t\t"
                        + data.getTicketList().get(i).getPermit() + "\n"
                        + "Make/Model:\t\tColor:\n"
                        + data.getTicketList().get(i).getMakeModel() + "\t\t"
                        + data.getTicketList().get(i).getColor() + "\n"
                        + "Reason:\n"
                        + data.getTicketList().get(i).getReason() + "\n"
                        + "Date:\t\tLocation\n"
                        + data.getTicketList().get(i).getDate() + "\t\t"
                        + data.getTicketList().get(i).getLocation() + "\n"
                        + "Time:\t\tIssuedBy:\n"
                        + data.getTicketList().get(i).getTime() + "\t\t"
                        + data.getTicketList().get(i).getIssuer());             
            }
            catch (IndexOutOfBoundsException e) {
                outputLabel.setText("No ticket found.");
                i = 0;
            }
            }); 
        
        button4.setOnAction((ActionEvent event) -> {
            try {
            if (data.getTicketList().get(i).getPaidStatus().equalsIgnoreCase("Unpaid")) {
                data.getTicketList().get(i).setPaidStatus("Paid");
                
                outputLabel.setText(
                        "Ticket No. " + (i+1) + "\t"
                        + data.getTicketList().get(i).getPaidStatus() + "\n"
                        + "License:\t\tState:\t\tPermit:\n"
                        + data.getTicketList().get(i).getLicense() + "\t\t"
                        + data.getTicketList().get(i).getState() + "\t\t"
                        + data.getTicketList().get(i).getPermit() + "\n"
                        + "Make/Model:\t\tColor:\n"
                        + data.getTicketList().get(i).getMakeModel() + "\t\t"
                        + data.getTicketList().get(i).getColor() + "\n"
                        + "Reason:\n"
                        + data.getTicketList().get(i).getReason() + "\n"
                        + "Date:\t\tLocation\n"
                        + data.getTicketList().get(i).getDate() + "\t\t"
                        + data.getTicketList().get(i).getLocation() + "\n"
                        + "Time:\t\tIssuedBy:\n"
                        + data.getTicketList().get(i).getTime() + "\t\t"
                        + data.getTicketList().get(i).getIssuer()); 
            }                
            else {
                data.getTicketList().get(i).setPaidStatus("Unpaid");
                
                outputLabel.setText(
                        "Ticket No. " + (i+1) + "\t"
                        + data.getTicketList().get(i).getPaidStatus() + "\n"
                        + "License:\t\tState:\t\tPermit:\n"
                        + data.getTicketList().get(i).getLicense() + "\t\t"
                        + data.getTicketList().get(i).getState() + "\t\t"
                        + data.getTicketList().get(i).getPermit() + "\n"
                        + "Make/Model:\t\tColor:\n"
                        + data.getTicketList().get(i).getMakeModel() + "\t\t"
                        + data.getTicketList().get(i).getColor() + "\n"
                        + "Reason:\n"
                        + data.getTicketList().get(i).getReason() + "\n"
                        + "Date:\t\tLocation\n"
                        + data.getTicketList().get(i).getDate() + "\t\t"
                        + data.getTicketList().get(i).getLocation() + "\n"
                        + "Time:\t\tIssuedBy:\n"
                        + data.getTicketList().get(i).getTime() + "\t\t"
                        + data.getTicketList().get(i).getIssuer()); 
            }
            }
            catch (IndexOutOfBoundsException e) {
                i--;
                
                if (data.getTicketList().get(i).getPaidStatus().equalsIgnoreCase("Unpaid")) {
                data.getTicketList().get(i).setPaidStatus("Paid");
                
                outputLabel.setText(
                        "Ticket No. " + (i+1) + "\t"
                        + data.getTicketList().get(i).getPaidStatus() + "\n"
                        + "License:\t\tState:\t\tPermit:\n"
                        + data.getTicketList().get(i).getLicense() + "\t\t"
                        + data.getTicketList().get(i).getState() + "\t\t"
                        + data.getTicketList().get(i).getPermit() + "\n"
                        + "Make/Model:\t\tColor:\n"
                        + data.getTicketList().get(i).getMakeModel() + "\t\t"
                        + data.getTicketList().get(i).getColor() + "\n"
                        + "Reason:\n"
                        + data.getTicketList().get(i).getReason() + "\n"
                        + "Date:\t\tLocation\n"
                        + data.getTicketList().get(i).getDate() + "\t\t"
                        + data.getTicketList().get(i).getLocation() + "\n"
                        + "Time:\t\tIssuedBy:\n"
                        + data.getTicketList().get(i).getTime() + "\t\t"
                        + data.getTicketList().get(i).getIssuer()); 
            }                
            else {
                data.getTicketList().get(i).setPaidStatus("Unpaid");
                
                outputLabel.setText(
                        "Ticket No. " + (i+1) + "\t"
                        + data.getTicketList().get(i).getPaidStatus() + "\n"
                        + "License:\t\tState:\t\tPermit:\n"
                        + data.getTicketList().get(i).getLicense() + "\t\t"
                        + data.getTicketList().get(i).getState() + "\t\t"
                        + data.getTicketList().get(i).getPermit() + "\n"
                        + "Make/Model:\t\tColor:\n"
                        + data.getTicketList().get(i).getMakeModel() + "\t\t"
                        + data.getTicketList().get(i).getColor() + "\n"
                        + "Reason:\n"
                        + data.getTicketList().get(i).getReason() + "\n"
                        + "Date:\t\tLocation\n"
                        + data.getTicketList().get(i).getDate() + "\t\t"
                        + data.getTicketList().get(i).getLocation() + "\n"
                        + "Time:\t\tIssuedBy:\n"
                        + data.getTicketList().get(i).getTime() + "\t\t"
                        + data.getTicketList().get(i).getIssuer()); 
            }
            }
            });
        
         button5.setOnAction((ActionEvent event) -> {    
             Platform.exit();
         });
        
        Scene scene = new Scene(root, 1000, 600);
        
        primaryStage.setTitle("Parking Ticket Citation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
