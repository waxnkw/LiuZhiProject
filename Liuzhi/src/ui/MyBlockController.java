package ui;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import po.ProblemBlock;

public class MyBlockController {
	@FXML
	Label titleLabel;
	
	@FXML
	Label moneyLabel;
	
	@FXML
	JFXTextArea contentTextArea;
	
	@FXML
	Label phoneNumLabel;
	
	public void init(ProblemBlock block){
		titleLabel.setText(block.getTitle());
		moneyLabel.setText(block.getPayment()+"");
		contentTextArea.setText(block.getContent());
		phoneNumLabel.setText(block.getPhoneNum());
	}

	
}
