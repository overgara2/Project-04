/*
Omar Vergara (20438054)
CSCI 3340-02
Project 3
2/23/2018
*/

package ticket;

import javafx.geometry.Pos;
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


/**
 * GUI and View component of the MVC
 * @author trick
 */
public class TicketView extends BorderPane{
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
        
        TicketModel data = new TicketModel();
        
        int i;
        
        HBox hBox1 = new HBox();
        HBox hBox2 = new HBox();
        VBox vBox1 = new VBox();                       
        
    /**
     * constructor for our TicketView class
     */
    public TicketView() {        
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
        setTop(hBox1);
        
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
        setCenter(grid);
        
        grid2.setAlignment(Pos.CENTER_RIGHT);
        grid2.setHgap(5);
        grid2.setVgap(5);
        grid2.addRow(0, button1);
        grid2.addRow(1, button2, button3);
        grid2.addRow(2, button4);
        grid2.addRow(3);
        grid2.addRow(4, button5);
        setLeft(grid2);
        
        
        paymentInfo.setMaxSize(330, 400);
        vBox1.getChildren().add(paymentInfo);

        vBox1.setAlignment(Pos.CENTER);
        setRight(vBox1);
        
        
        hBox2.getChildren().add(outputLabel);
        hBox2.setAlignment(Pos.CENTER);
        setBottom(hBox2);   
    }
}