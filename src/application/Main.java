package application;
import java.awt.Frame;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;
import javafx.scene.image.*;
 
public class Main  extends Application {
	
	Stage window;
	Scene homePage, spacePage;
	Image bgHome = new Image("file:img/homeBackGroud.jpg"); 
	Image bgSpace = new Image("file:img/spaceBg.jpg"); 
	int widthStage = 1300; 
	int heightStage = 800; 
	
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
    	
    	window = primaryStage;
    	
    	// content for the home page
    	Button btnStart = new Button();
    	btnStart.setText("START");
    	btnStart.setOnAction(e -> window.setScene(spacePage));
    	ImageView bgH=new ImageView(bgHome);
    	bgH.setFitHeight(heightStage);
    	bgH.setFitWidth(widthStage);
    	
	
    	
    	// content for space page
    	Button homeBtn = new Button("Home");
    	homeBtn.setOnAction(e -> window.setScene(homePage));
    	ImageView bgS=new ImageView(bgSpace);
    	bgS.setFitHeight(heightStage);
    	bgS.setFitWidth(widthStage);
    	
    	
    	
    	// layout home page 
    	StackPane layoutHome = new StackPane ();
    	layoutHome.getChildren().addAll(bgH,btnStart);
    	homePage = new Scene(layoutHome,widthStage,heightStage);
    
    	
    
    	
    	// layout space 
    	StackPane spaceLayout = new StackPane();
    	Sphere mySphere = new Sphere(50);
    	spaceLayout.getChildren().addAll(bgS,homeBtn);
    	spacePage = new Scene(spaceLayout,widthStage,heightStage);
    	

    	
    	
    	window.setTitle("Landing on Titan");
    	window.setScene(homePage);
        window.show();
    }
}