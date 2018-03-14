package po;

public class QQ extends ContactWay{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9113787109923230629L;
	private long qqNum;
	
	@Override
	public String getContactInfo(){
		return qqNum+"";
	}
	
	public void setQqNum(long qqNum){
		this.qqNum = qqNum;
	}
}
