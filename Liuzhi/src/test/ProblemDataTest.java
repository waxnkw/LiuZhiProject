package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dataImp.ProblemDataImpl;
import po.Date;
import po.Payment;
import po.Problem;

public class ProblemDataTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Problem problem = new Problem();
		problem.setUserId("66666");
		problem.setDescription("fadsf");
		problem.setPayment(new Payment(20));
		problem.setBeginDate(new Date());
		problem.setEndDate(new Date());
		ProblemDataImpl impl = new ProblemDataImpl();
		impl.save(problem);
	}

}
