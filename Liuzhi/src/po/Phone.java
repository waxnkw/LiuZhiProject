package po;

public class Phone extends ContactWay{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1471419027778436988L;
	private long phoneNum;
	
	@Override
	public String getContactInfo(){
		return phoneNum+"";
	}
	
	public void setQqNum(long phoneNum){
		this.phoneNum = phoneNum;
	}
}
