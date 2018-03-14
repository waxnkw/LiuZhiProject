package ui;

import blImp.MyProblemBlockStubs;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import po.ProblemBlock;

public class MyProblemController {

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

		ObservableList<MyBlock<ProblemBlock>> myBlocksUi = FXCollections.observableArrayList();
		MyBlock<ProblemBlock> block1 = new MyBlock<>();
		block1.init(myBlocks.get(0));
		myBlocksUi.add(block1);
		
		MyBlock<ProblemBlock> block2 = new MyBlock<>();
		block2.init(myBlocks.get(1));
		myBlocksUi.add(block2);
		
		for(MyBlock<ProblemBlock> block :myBlocksUi){
			block.resize(contentVBox.getWidth(), block.getHeight());
		}
		contentVBox.getChildren().addAll(myBlocksUi);
		
		
	}
	
	
}
