package domain;

/**
 * @author Alperen Ekin-Seymur Babaþlý,230201010-220201064
 *
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ActivityType {
	protected Calendar cal=Calendar.getInstance();
	private String name;
	private Date date;
	protected Date currentDate;
	private Statu statu;
	public ActivityType(String name, String date, Statu statu) {
		setName(name);
		setDate(date);
		setStatu(statu);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(String date) {
		if(date==null) {
			return;
		}
		else {
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy-hh:mm");
			Date date1;
			try {
				date1 = sdf.parse(date);
				cal.setTime(date1);
				this.date=cal.getTime();		
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	public Statu getStatu() {
		return statu;
	}
	public void setStatu(Statu statu) {
		this.statu = statu;
	}
	public void setDate(Date date1) {
		Calendar cal=Calendar.getInstance();
		cal.setTime(date1);
		this.date=cal.getTime();	
	}
}
