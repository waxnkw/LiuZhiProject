package dataService;

import po.UserInfo;

public interface UserDataService {
	public boolean save(UserInfo userInfo);
	public boolean update(UserInfo newUserInfo);
//	public ArrayList<UserInfo> queryAll();
	public UserInfo queryById(String id);
	public UserInfo isValidUser(String name, String password);
	public UserInfo queryByProblem(String problemId);

}
