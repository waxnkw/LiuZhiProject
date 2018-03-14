package application;
	
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import ui.AllProblemsUiStarter;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Stage stage = primaryStage;
			URL location = getClass().getResource("/ui/LoginUi.fxml");
			FXMLLoader loader=new FXMLLoader();
			loader.setLocation(location);
			Parent root=loader.load();
			
			Scene scene=new Scene(root);
			stage.setScene(scene);
			
			stage.getScene().setFill(null);
			stage.show();
			
//			AllProblemsUiStarter starter = new AllProblemsUiStarter();
//			starter.start();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
