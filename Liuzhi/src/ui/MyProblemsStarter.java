package ui;

import java.io.IOException;
import java.net.URL;

import com.jfoenix.controls.JFXDecorator;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MyProblemsStarter {
public void start() throws IOException {
		
		Stage  stage = new Stage();
		URL location = getClass().getResource("/ui/MyProblemsUi.fxml");
		FXMLLoader loader=new FXMLLoader();
		loader.setLocation(location);
		Parent root=loader.load();
        
        stage.setTitle("��￴");
		
      //�趨title��decorater
        JFXDecorator decorator = new JFXDecorator(stage, root);
        decorator.setCustomMaximize(true);
        decorator.getStyleClass().add("jfx-decorator");
       
        
		Scene scene=new Scene(decorator);
		stage.setScene(scene);
		
		//��ʼ�� with controller
		MyProblemController controller = loader.getController();
		controller.init();
		
		scene.getStylesheets().add("/ui/Allproblems.css");
		
		stage.show();
	}
	
}
