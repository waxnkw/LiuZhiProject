package dataImp;

import java.io.File;
import java.util.ArrayList;

import assistant.ReadAndWriteProblemSer;
import dataService.ProblemDataService;
import po.Problem;

public class ProblemDataImpl implements ProblemDataService{
	private static ArrayList<Problem> problems;
	
	private static String PATH = "data"+ File.separator + "problem" + File.separator;
	
	public ProblemDataImpl() {
		if(problems==null){
			problems = getAllFromSer();
		}
	}
	
	@Override
	public boolean save(Problem problem) {
		problem.generateId();
		problems.add(problem);
		return write(problem);
	}

	@Override
	public boolean update(Problem newProblem) {
		Problem problem = queryById(newProblem.getId());
		problems.remove(problem);
		problems.add(newProblem);
		return write(newProblem);
	}

	@Override
	public ArrayList<Problem> queryAll() {
		return problems;
	}

	@Override
	public Problem queryById(String id) {
		for(Problem problem: problems){
			if(problem.getId().equals(id)){
				return problem;
			}
		}
		return null;
	}

	@Override
	public Problem queryByUser(String userId) {
		for(Problem problem: problems){
			if(problem.getUserId().equals(userId)){
				return problem;
			}
		}
		return null;
	}
	
	public ArrayList<Problem> getAllFromSer(){
		ArrayList<Problem> problemList = new ArrayList<>();
		File dir = new File(PATH);
		String[] problemIds = dir.list();
		if(problemIds==null){return new ArrayList<Problem>();}
		for(String id: problemIds){
			Problem problem = read(id);
			problemList.add(problem);
		}
		return problemList;
	}
	
	public boolean write(Problem problem){
		String problemId = problem.getId();
		String path = PATH + problemId;
		if(!problemId.contains("ser")){path+=".ser";}
		System.out.println(path);
		return ReadAndWriteProblemSer.writeObj(problem, path);
	}
	
	public Problem read(String problemId){
		String path = PATH+ problemId;
		if(!problemId.contains("ser")){path+=".ser";}
		return ReadAndWriteProblemSer.readObj(path);
	}
}
