package domain;

/**
 * @author Alperen Ekin-Seymur Babaþlý,230201010-220201064
 *
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class SingleActivity extends ActivityType implements HobbyActivity,MandatoryActivity  {

	public SingleActivity(String name, String date, Statu statu) {
		super(name, date, statu);
	}

	@Override
	public void makePostponed(ActivityType act, String newDate) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy-hh:mm");
		Date date1;
		date1=sdf.parse(newDate);
		act.setDate(date1);
		act.setStatu(Statu.PENDING);
	}
	@Override
	public void setCurrentDate(String currentdate) {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy-hh:mm");
		try {
			currentDate = sdf.parse(currentdate);
			cal.setTime(currentDate);
			this.currentDate=cal.getTime();		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public Date getCurrentDate() {
		return currentDate;
	}
	public void addtoList(ActivityType activity,ArrayList<ActivityType> activityList,ArrayList<ActivityType> hobbyList) {
		if(hobbyList==null) {
			activityList.add(activity);
		}
		else {
			activityList.add(activity);
			hobbyList.add(activity);
		}	
	}
}
