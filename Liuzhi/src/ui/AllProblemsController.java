package ui;

import java.io.IOException;
import java.net.URL;

import blImp.MyProblemBlockStubs;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import po.ProblemBlock;

public class AllProblemsController {

	//@FXML
	//private JFXListView<MyBlock<ProblemBlock>> listView;
	//private JFXListView<ProblemBlock> listView;
	
	@FXML
	private ScrollPane contentScrollPane;
	
	@FXML
	private VBox contentVBox;
	
	public void init(){

		ObservableList<ProblemBlock> myBlocks = FXCollections.observableArrayList();
		myBlocks.add(MyProblemBlockStubs.createProblemBlock1());
		myBlocks.add(MyProblemBlockStubs.createProblemBlock2());
//		int len = myBlocks.size();
//		int index = 0;
//		
//		listView.setCellFactory(list->{
//			
//			MyBlock<ProblemBlock> block = new MyBlock<>();
//			
//			block.updateListView(list);
//			block.init(myBlocks.get(index));
//			return block;
//		});
//		listView.setItems(myBlocks);
		
		ObservableList<MyBlock<ProblemBlock>> myBlocksUi = FXCollections.observableArrayList();
		MyBlock<ProblemBlock> block1 = new MyBlock<>();
		block1.init(myBlocks.get(0));
		myBlocksUi.add(block1);
		
		MyBlock<ProblemBlock> block2 = new MyBlock<>();
		block2.init(myBlocks.get(1));
		myBlocksUi.add(block2);
		
		
		MyBlock<ProblemBlock> block3 = new MyBlock<>();
		block3.init(myBlocks.get(1));
		myBlocksUi.add(block3);
		
		MyBlock<ProblemBlock> block4 = new MyBlock<>();
		block4.init(myBlocks.get(1));
		myBlocksUi.add(block4);
		
		MyBlock<ProblemBlock> block5 = new MyBlock<>();
		block5.init(myBlocks.get(1));
		myBlocksUi.add(block5);
//		listView.getItems().addAll(myBlocksUi);
		
		contentScrollPane.resize(contentScrollPane.getWidth(), contentScrollPane.getPrefHeight()*2);
		contentVBox.resize(contentVBox.getWidth(),contentVBox.getPrefHeight()*2);

		for(MyBlock<ProblemBlock> block :myBlocksUi){
			block.resize(contentVBox.getWidth(), block.getHeight());
		}
		contentVBox.getChildren().addAll(myBlocksUi);
	}
	
	@FXML
	public void changeToMyProblemsUi() throws IOException{
		contentVBox.getChildren().clear();
		ObservableList<ProblemBlock> myBlocks = FXCollections.observableArrayList();
		myBlocks.add(MyProblemBlockStubs.createProblemBlock1());
		myBlocks.add(MyProblemBlockStubs.createProblemBlock2());

		ObservableList<MyBlock<ProblemBlock>> myBlocksUi = FXCollections.observableArrayList();
		MyBlock<ProblemBlock> block1 = new MyBlock<>();
		block1.init(myBlocks.get(1));
		myBlocksUi.add(block1);
		
		
		for(MyBlock<ProblemBlock> block :myBlocksUi){
			block.resize(contentVBox.getWidth(), block.getHeight());
		}
		contentVBox.getChildren().addAll(myBlocksUi);
		
	}
	
	@FXML
	public void changeToAllProblemsUi() throws IOException{
		contentVBox.getChildren().clear();
		this.init();
	}
	
	@FXML 
	public void changeToMyUserInfo() throws IOException{
		URL location = getClass().getResource("/ui/MyUserInfoUi.fxml");
		FXMLLoader loader=new FXMLLoader();
		loader.setLocation(location);
		AnchorPane root=loader.load();
		MyUserInfoUiController controller = loader.getController();
		controller.init();
		contentVBox.getChildren().clear();
		contentVBox.getChildren().add(root);
	}
}
