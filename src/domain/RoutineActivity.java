package domain;

/**
 * @author Alperen Ekin-Seymur Babaþlý,230201010-220201064
 *
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class RoutineActivity extends ActivityType implements HobbyActivity,MandatoryActivity {
	private String frequency;
	private Date deadline;
	public RoutineActivity(String name, String date, Statu statu,String frequency,String deadline) {
		super(name, date, statu);
		setFrequency(frequency);
		setDeadline(deadline);
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		if(frequency==null) {
			return;
		}
		else {
			this.frequency = frequency;
		}
	}
	public void nextdaylyactivities(RoutineActivity act,ArrayList<ActivityType> activityList,ArrayList<ActivityType> hobbyList) {
		if(hobbyList==null) {
			activityList.add(act);
			Calendar cal=Calendar.getInstance();
			int repeat=Integer.parseInt(act.getFrequency());
			int index=activityList.indexOf(act);
			for(int i=0;i<repeat-1;i++) {
				cal.setTime(activityList.get(i+index).getDate());
				cal.add(Calendar.DATE, +repeat);
				RoutineActivity nextacts=new RoutineActivity(act.getName(),null,act.getStatu(), act.getFrequency(), null);
				nextacts.setDate(cal.getTime());
				activityList.add(nextacts);
			}
		}
		else {
			activityList.add(act);
			hobbyList.add(act);
			Calendar cal=Calendar.getInstance();
			int repeat=Integer.parseInt(act.getFrequency());
			int index=activityList.indexOf(act);
			for(int i=0;i<repeat-1;i++) {
				cal.setTime(activityList.get(i+index).getDate());
				cal.add(Calendar.DATE, +repeat);
				RoutineActivity nextacts=new RoutineActivity(act.getName(),null,act.getStatu(), act.getFrequency(), null);
				nextacts.setDate(cal.getTime());
				activityList.add(nextacts);
				hobbyList.add(nextacts);
			}
		}
	}
	public void nextweeklyactivities(RoutineActivity act,ArrayList<ActivityType> activityList,ArrayList<ActivityType> hobbyList) {
		if(hobbyList==null) {
			activityList.add(act);
			Calendar cal=Calendar.getInstance();
			int repeat=Integer.parseInt(act.getFrequency());
			int index=activityList.indexOf(act);
			for(int i=0;i<repeat-1;i++) {
				cal.setTime(activityList.get(i+index).getDate());
				cal.add(Calendar.DATE, +repeat);
				RoutineActivity nextacts=new RoutineActivity(act.getName(),null,act.getStatu(), act.getFrequency(), null);
				nextacts.setDate(cal.getTime());
				activityList.add(nextacts);
			}
		}
		else {
			activityList.add(act);
			hobbyList.add(act);
			Calendar cal=Calendar.getInstance();
			int repeat=Integer.parseInt(act.getFrequency());
			int index=activityList.indexOf(act);
			for(int i=0;i<repeat-1;i++) {
				cal.setTime(activityList.get(i+index).getDate());
				cal.add(Calendar.DATE, +7);
				RoutineActivity nextacts=new RoutineActivity(act.getName(),null,act.getStatu(), act.getFrequency(), null);
				nextacts.setDate(cal.getTime());
				activityList.add(nextacts);
				hobbyList.add(nextacts);
			}
		}
	}
	public void nextmonthlyactivities(RoutineActivity act,ArrayList<ActivityType> activityList,ArrayList<ActivityType> hobbyList) {
		if(hobbyList==null) {
			activityList.add(act);
			Calendar cal=Calendar.getInstance();
			int repeat=Integer.parseInt(act.getFrequency());
			int index=activityList.indexOf(act);
			for(int i=0;i<repeat-1;i++) {
				cal.setTime(activityList.get(i+index).getDate());
				cal.add(Calendar.DATE, +repeat);
				RoutineActivity nextacts=new RoutineActivity(act.getName(),null,act.getStatu(), act.getFrequency(), null);
				nextacts.setDate(cal.getTime());
				activityList.add(nextacts);
			}
		}
		else {
			activityList.add(act);
			hobbyList.add(act);
			Calendar cal=Calendar.getInstance();
			int repeat=Integer.parseInt(act.getFrequency());
			int index=activityList.indexOf(act);
			for(int i=0;i<repeat-1;i++) {
				cal.setTime(activityList.get(i+index).getDate());
				cal.add(Calendar.MONTH, +1);
				RoutineActivity nextacts=new RoutineActivity(act.getName(),null,act.getStatu(), act.getFrequency(), null);
				nextacts.setDate(cal.getTime());
				activityList.add(nextacts);
				hobbyList.add(nextacts);
			}
		}
	}
	public void daylyActivityWithDeadline(RoutineActivity act,ArrayList<ActivityType> activityList,ArrayList<ActivityType> hobbyList){
		if(hobbyList==null) {
			activityList.add(act);
			Calendar cal=Calendar.getInstance();
			int repeat=Integer.parseInt(act.getFrequency());
			int index=activityList.indexOf(act);
			for(int i=0;i<repeat-1;i++) {
				cal.setTime(activityList.get(i+index).getDate());
				cal.add(Calendar.DATE, +repeat);
				RoutineActivity nextacts=new RoutineActivity(act.getName(),null,act.getStatu(), act.getFrequency(), null);
				nextacts.setDate(cal.getTime());
				activityList.add(nextacts);
			}
		}
		else {
			activityList.add(act);
			hobbyList.add(act);
			Calendar cal=Calendar.getInstance();
			int repeat=Integer.parseInt(act.getFrequency());
			int index=activityList.indexOf(act);
			for(int i=0;i<repeat-1;i++) {
				if(activityList.get(i+index).getDate().compareTo(act.getDeadline())>0){
					break;
				}
				else {
				cal.setTime(activityList.get(i+index).getDate());
				cal.add(Calendar.DATE, +repeat);
				RoutineActivity nextacts=new RoutineActivity(act.getName(),null,act.getStatu(), act.getFrequency(), null);
				nextacts.setDate(cal.getTime());
				activityList.add(nextacts);
				hobbyList.add(nextacts);
				}
			}	
		}
			
	}
	public void weeklyActivityWithDeadline(RoutineActivity act,ArrayList<ActivityType> activityList,ArrayList<ActivityType> hobbyList){
		if(hobbyList==null) {
			activityList.add(act);
			Calendar cal=Calendar.getInstance();
			int repeat=Integer.parseInt(act.getFrequency());
			int index=activityList.indexOf(act);
			for(int i=0;i<repeat-1;i++) {
				cal.setTime(activityList.get(i+index).getDate());
				cal.add(Calendar.DATE, +repeat);
				RoutineActivity nextacts=new RoutineActivity(act.getName(),null,act.getStatu(), act.getFrequency(), null);
				nextacts.setDate(cal.getTime());
				activityList.add(nextacts);
			}
		}
		else {
			activityList.add(act);
			hobbyList.add(act);
			Calendar cal=Calendar.getInstance();
			int repeat=Integer.parseInt(act.getFrequency());
			int index=activityList.indexOf(act);
			for(int i=0;i<repeat-1;i++) {
				if(activityList.get(i+index).getDate().compareTo(act.getDeadline())>0){
					break;
				}
				else {
				cal.setTime(activityList.get(i+index).getDate());
				cal.add(Calendar.DATE, +7);
				RoutineActivity nextacts=new RoutineActivity(act.getName(),null,act.getStatu(), act.getFrequency(), null);
				nextacts.setDate(cal.getTime());
				activityList.add(nextacts);
				hobbyList.add(nextacts);
				}
			}	
		}
	}
	public void monthlyActivityWithDeadline(RoutineActivity act,ArrayList<ActivityType> activityList,ArrayList<ActivityType> hobbyList){
		if(hobbyList==null) {
			activityList.add(act);
			Calendar cal=Calendar.getInstance();
			int repeat=Integer.parseInt(act.getFrequency());
			int index=activityList.indexOf(act);
			for(int i=0;i<repeat-1;i++) {
				cal.setTime(activityList.get(i+index).getDate());
				cal.add(Calendar.DATE, +repeat);
				RoutineActivity nextacts=new RoutineActivity(act.getName(),null,act.getStatu(), act.getFrequency(), null);
				nextacts.setDate(cal.getTime());
				activityList.add(nextacts);
			}
		}
		else {
			activityList.add(act);
			hobbyList.add(act);
			Calendar cal=Calendar.getInstance();
			int repeat=Integer.parseInt(act.getFrequency());
			int index=activityList.indexOf(act);
			for(int i=0;i<repeat-1;i++) {
				if(activityList.get(i+index).getDate().compareTo(act.getDeadline())>0){
					break;
				}
				else {
				cal.setTime(activityList.get(i+index).getDate());
				cal.add(Calendar.MONTH, +1);
				RoutineActivity nextacts=new RoutineActivity(act.getName(),null,act.getStatu(), act.getFrequency(), null);
				nextacts.setDate(cal.getTime());
				activityList.add(nextacts);
				hobbyList.add(nextacts);
				}
			}	
		}
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		if(deadline==null) {
			
		}
		else {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy-hh:mm");
		Date date1;
		try {
			date1 = sdf.parse(deadline);
			Calendar cal=Calendar.getInstance();
			cal.setTime(date1);
			this.deadline=cal.getTime();		
		} catch (ParseException e) {
			e.printStackTrace();
		}
	  }
	}
	@Override
	public void setCurrentDate(String currentdate) {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy-hh:mm");
		try {
			currentDate = sdf.parse(currentdate);
			cal.setTime(currentDate);
			this.currentDate=cal.getTime();		
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	@Override
	public Date getCurrentDate() {
		return currentDate;
	}
	@Override
	public void makePostponed(ActivityType act, String newDate) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy-hh:mm");
		Date date1;
		date1=sdf.parse(newDate);
		act.setDate(date1);
		act.setStatu(Statu.PENDING);
	}
}
