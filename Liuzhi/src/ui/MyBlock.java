package ui;

import java.io.IOException;
import java.net.URL;

import com.jfoenix.controls.JFXListCell;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import po.ProblemBlock;

public class MyBlock<T> extends Label{
	public MyBlock(){
		super();
		
	}
	
	public void init(ProblemBlock block) {
		URL location = getClass().getResource("/ui/MyBlock.fxml");
		FXMLLoader flLoader = new FXMLLoader(location);
		Parent root = null;
		try {
			root = flLoader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		VBox vBox = (VBox)root;
		MyBlockController controller = flLoader.getController();
		controller.init(block);
		
		this.setGraphic(vBox);
		this.getStylesheets().add("/ui/AllProblems.css");
		this.setEffect(new DropShadow(40,Color.GREY));
	}
}
