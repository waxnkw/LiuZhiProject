package po;

import java.io.Serializable;
import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Date implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = -5407874967802305946L;

	/**
     * 日期字符串的格式
     */
	static final String BILL_DRAFT_ID_FORMAT = "yyyy-MM-dd_HH_mm_ss";
	static final String FORMAT="yyyy-MM-dd_HH:mm:ss";
	static final String YMD_FORMAT="yyyy.MM.dd";
	static final String BILL_ID_FORMAT="yyyyMMdd";
	static final String ID_FORMAT = "yyyy-MMdd-hh-mm-ss";
	
	private Calendar calendar;

	/**
     * 用一个日期的string构造一个日期的辅助类
     */
	public Date(String date) throws ParseException{
		try{
		calendar=Calendar.getInstance();
		SimpleDateFormat format=new SimpleDateFormat(FORMAT);
		calendar.setTime(format.parse(date));
		calendar.getTime();
		}catch(ParseException e){
			throw e;
		}

	}
	public Date(int year,int month,int date,int hourOfDay,int minute){
		calendar = Calendar.getInstance();
		calendar.set(year, month-1, date, hourOfDay, minute);
	}


	/**
     * 用当下时间构造一个日期的辅助类
     */
	public Date() {
		calendar = Calendar.getInstance();
		calendar.getTime();
	}

	/**
     * 得到该日期的字符串格式
     *
     * @return 该日期的字符串格式
     */
	public String getDate(){
		String string = (new SimpleDateFormat(FORMAT)).format(calendar.getTime());
		return string;
	}
	
	/**
     * 得到该日期年月日的字符串格式
     *
     * @return 该日期年月日的字符串格式
     */
	public String getYMDDate(){
		String string =  (new SimpleDateFormat(YMD_FORMAT)).format(calendar.getTime());
		return string;
	}
	
	/**
     * 生成该促销策略的Id部分
     * 格式：2017-1204-01-56
     * @return 促销策略的Id部分
     */
	public String generateId(){
		String  string=(new SimpleDateFormat(ID_FORMAT)).format(calendar.getTime());
		return string;
	}
	
	/**
     * 得到该日期的Calendar格式
     *
     * @return 该日期的Calendar格式
     */
	public Calendar getCalendar(){
		return this.calendar;
	}

	/**
     * 比较当前日期与目标日期
     *
     * @return 0:相等  1:当前日期较晚  -1:当前日期较早
     */
	public int compareTo(Date anothorDateUtility){
		return calendar.compareTo(anothorDateUtility.getCalendar());
	}

	/**
     * 比较当前日期是否在该日期范围内
     *
     * @return true:在日期范围内  false:不在日期范围内
     */
	public boolean isInDateArea(Date begin,Date end){
		if(calendar.compareTo(begin.getCalendar())>=0
				&&calendar.compareTo(end.getCalendar())<=0){
			return true;
		}
		return false;
	}

}
