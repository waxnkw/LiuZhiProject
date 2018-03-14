package blImp;

import po.ProblemBlock;

public class MyProblemBlockStubs {
	public static ProblemBlock createProblemBlock1(){
		ProblemBlock block = new ProblemBlock();
		block.setContent("北京的火车票真的太难买了，用老婆孩子四个手机，抢了两天，结果一张票都没抢到。求助大佬给抢一张去北京的火车票或者高铁。");
		block.setPayment(20);
		block.setPhoneNum("18851831150");
		block.setTitle("买票");
		return block;
		
	}
	
	public static ProblemBlock createProblemBlock2(){
		ProblemBlock block = new ProblemBlock();
		block.setContent("孩子英语成绩老不好，能不能给找一个有外国生活经验的补习老师，给孩子辅导一下英语。主要是口语和语法方面。");
		block.setPayment(28);
		block.setPhoneNum("188000000000");
		block.setTitle("补习");
		return block;
		
	}
}
