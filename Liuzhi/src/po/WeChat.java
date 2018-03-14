package po;

public class WeChat extends ContactWay{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6570954583738799328L;

	private String weChatNum;
	
	@Override
	public String getContactInfo(){
		return weChatNum+"";
	}
	
	public void setQqNum(String weChatNum){
		this.weChatNum = weChatNum;
	}
}
