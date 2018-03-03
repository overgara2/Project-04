/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vergara_omar_project01;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author srv_veralab
 */
public class GUI  extends Application{
    BorderPane root = new BorderPane();
    GridPane grid = new GridPane();


    Label title = new Label();
    Label label1 = new Label();
    Label label2 = new Label();
    Label label3 = new Label();
    Label label4 = new Label();
    Label label7 = new Label();
    Label label8 = new Label();


    TextField tf1 = new TextField();
    TextField tf2 = new TextField();
    TextField tf3 = new TextField();
    TextField tf4 = new TextField();
    TextField tf5 = new TextField();
    TextField tf10 = new TextField();
    TextField tf11 = new TextField();

    Button button1 = new Button();
    Button button2 = new Button();
    
    HBox hbox1 = new HBox();
    VBox vbox1 = new VBox();
    
    Data data = new Data();
    
    
    public void start(Stage primaryStage) {
        Image image = new Image("Penguins.jpg");
        ImageView iv = new ImageView(image);
        iv.setFitHeight(76.8);
        iv.setFitWidth(102.4);
        
        title.setText("Gmail Request Form");
        title.setFont(Font.font("", 24));
        
        label1.setText("Name");
        label2.setText("Choose your username");
        label3.setText("Create a password");
        label4.setText("Confirm your password");
        label7.setText("Mobile phone");
        label8.setText("Your current email address");
        
        tf1.setText("First");
        tf2.setText("Last");
        tf3.setAlignment(Pos.BASELINE_RIGHT);
        tf3.setText("@gmail.com");
        
        button1.setText("Add");
        button2.setText("Print");
        
        grid.addRow(0, label1);
        grid.addRow(1, tf1, tf2);
        grid.addRow(2, label2);
        grid.addRow(3, tf3);
        grid.addRow(4, label3);
        grid.addRow(5, tf4);
        grid.addRow(6, label4);
        grid.addRow(7, tf5);
        grid.addRow(8, label7);
        grid.addRow(9, tf10);
        grid.addRow(10, label8);
        grid.addRow(11, tf11);
        grid.addRow(13, hbox1);
        grid.setAlignment(Pos.TOP_CENTER);

        hbox1.getChildren().addAll(button1, button2);
        vbox1.getChildren().addAll(iv, title);
        vbox1.setAlignment(Pos.CENTER);
        
        root.setTop(vbox1);
        root.setCenter(grid);

        
        
        button1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                Information currentObject = new Information(tf1.getText(), 
                        tf2.getText(), tf3.getText(), tf4.getText(), 
                        tf5.getText(), tf10.getText(), tf11.getText());
                
                data.getData().add(currentObject);
            }
        });
        
        button2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                GridPane outputGrid = new GridPane();
                root.setRight(outputGrid);
                
                Label outputTitle = new Label();
                outputTitle.setText("We recieved requests from:");
                outputGrid.addRow(0, outputTitle);
                
                for(int i = 0; i < data.getData().size(); i++) {
                    Label currentLabel = new Label();
                    
                    currentLabel.setText(
                              data.getData().get(i).getFirstName() + " "
                            + data.getData().get(i).getLastName() +"\t"
                            + data.getData().get(i).getUsername());
                    
                    outputGrid.addRow((i+1), currentLabel);
                }
            }
        });
        
        
        Scene scene = new Scene(root, 800, 600);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}