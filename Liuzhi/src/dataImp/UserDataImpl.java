package dataImp;

import java.io.File;
import java.util.ArrayList;

import assistant.ContactWayEnum;
import assistant.ReadAndWriteUserInfoSer;
import dataService.UserDataService;
import po.UserInfo;

public class UserDataImpl implements UserDataService{

	private static ArrayList<UserInfo> userInfos;
	private static String PATH = "data"+ File.separator + "userInfo" + File.separator;
	
	
	public UserDataImpl() {
		if(userInfos==null){userInfos = getAllFromSer();}
	}
	
	@Override
	public boolean save(UserInfo userInfo) {
		userInfo.generateId();
		userInfos.add(userInfo);
		return write(userInfo);
	}

	@Override
	public boolean update(UserInfo newUserInfo) {
		UserInfo userInfo = queryById(newUserInfo.getId());
		userInfos.remove(userInfo);
		userInfos.add(newUserInfo);
		return write(newUserInfo);
	}

	@Override
	public UserInfo queryById(String id) {
		for(UserInfo userInfo: userInfos){
			if(userInfo.getId().equals(id)){
				return userInfo;
			}
		}
		return null;
	}

	@Override
	public UserInfo isValidUser(String name, String password) {
		for(UserInfo userInfo: userInfos){
			String phoneNum = userInfo.getContactWayList().get(ContactWayEnum.PHONE).getContactInfo();
			if((name.equals(userInfo.getName())||phoneNum.equals(name))&&password.equals(userInfo.getPassword())){
				return userInfo;
			}
		}
		return null;
	}

	@Override
	public UserInfo queryByProblem(String problemId) {
		for(UserInfo userInfo: userInfos){
			ArrayList<String> problemIds = userInfo.getProblems();
			if(problemIds.contains(problemId)){return userInfo;}
		}
		return null;
	}
	
	
	public ArrayList<UserInfo> getAllFromSer(){
		ArrayList<UserInfo> userInfoList = new ArrayList<>();
		File dir = new File(PATH);
		String[] userInfoIds = dir.list();
		if(userInfoIds==null){return new ArrayList<UserInfo>();}
		for(String id: userInfoIds){
			UserInfo userInfo = read(id);
			userInfoList.add(userInfo);
		}
		return userInfoList;
	}
	
	public boolean write(UserInfo userInfo){
		String userInfoId = userInfo.getId();
		String path = PATH + userInfoId;
		if(!userInfoId.contains("ser")){path+=".ser";}
		System.out.println(path);
		return ReadAndWriteUserInfoSer.writeObj(userInfo, path);
	}
	
	public UserInfo read(String userId){
		String path = PATH+ userId;
		if(!userId.contains("ser")){path+=".ser";}
		return ReadAndWriteUserInfoSer.readObj(path);
	}
	

}
