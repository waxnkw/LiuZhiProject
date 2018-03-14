package ui;

import java.io.IOException;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.fxml.FXML;

public class LoginUiController {
	@FXML
	private JFXTextField nameTextField;
	
	@FXML
	private JFXPasswordField passwordField;
	
	
	
	@FXML
	public void login() throws IOException{
		
		AllProblemsUiStarter starter = new AllProblemsUiStarter();
		starter.start();
		nameTextField.getScene().getWindow().hide();
	} 
}
