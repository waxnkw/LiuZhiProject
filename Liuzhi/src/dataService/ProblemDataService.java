package dataService;

import java.util.ArrayList;

import po.Problem;

public interface ProblemDataService {
	public boolean save(Problem Problem);
	public boolean update(Problem newProblem);
	public ArrayList<Problem> queryAll();
	public Problem queryById(String id);
	public Problem queryByUser(String userId);
}
