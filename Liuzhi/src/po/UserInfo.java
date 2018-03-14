package po;

import java.io.Serializable;
import java.util.ArrayList;

import assistant.SexEnum;

public class UserInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8492797970817907613L;
	
	private String id;
	private String password;
	private ContactWayList contactWayList;
	private ArrayList<String> problems;
	private String name;
	private SexEnum sex;
	public ContactWayList getContactWayList() {
		return contactWayList;
	}
	public void setContactWayList(ContactWayList contactWayList) {
		this.contactWayList = contactWayList;
	}
	public ArrayList<String> getProblems() {
		return problems;
	}
	public void setProblems(ArrayList<String> problems) {
		this.problems = problems;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SexEnum getSex() {
		return sex;
	}
	public void setSex(SexEnum sex) {
		this.sex = sex;
	}
	public String getId() {
		return id;
	}
	public void generateId() {
		this.id = new Date().generateId();
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
