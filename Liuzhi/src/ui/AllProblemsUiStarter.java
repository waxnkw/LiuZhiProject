package ui;

import java.io.IOException;
import java.net.URL;

import com.jfoenix.controls.JFXDecorator;
import com.jfoenix.controls.JFXListCell;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.svg.SVGGlyph;
import com.jfoenix.svg.SVGGlyphLoader;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class AllProblemsUiStarter {
	
	public void start() throws IOException {
		
		Stage  stage = new Stage();
		URL location = getClass().getResource("/ui/AllProblems.fxml");
		FXMLLoader loader=new FXMLLoader();
		loader.setLocation(location);
		Parent root=loader.load();
		
      //设定title的decorater
        JFXDecorator decorator = new JFXDecorator(stage, root);
        decorator.setCustomMaximize(true);
        decorator.getStyleClass().add("jfx-decorator");
        decorator.setText("帮帮看");
        
		Scene scene=new Scene(decorator);
		stage.setScene(scene);
		
		//初始化 with controller
		AllProblemsController controller = loader.getController();
		controller.init();
		
		scene.getStylesheets().add("/ui/Allproblems.css");
		 
		stage.show();
	}
	
	public void start(Stage stage){
		
	}
}
