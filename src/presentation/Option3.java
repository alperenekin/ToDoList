package presentation;

/**
 * @author Alperen Ekin-Seymur Babaþlý,230201010-220201064
 *
 */
import java.util.ArrayList;
import java.util.Scanner;
import domain.ActivityType;
import domain.RoutineActivity;

public class Option3 {
	private RoutineActivity act=new RoutineActivity(null, null,null,null,null);
	Scanner scan1=new Scanner(System.in);
	public Option3(ArrayList<ActivityType> aList) {
		System.out.println("Enter your current date");
		String currDate=scan1.next();
		act.setCurrentDate(currDate);
		if(aList.size()==0) {
			System.out.println("No activity has given");
		}
		else {
			for(ActivityType activities :aList) {
				if(activities.getDate().compareTo(act.getCurrentDate())==0){
					System.out.println("ALARM!!!YOU HAVE AN ACTIVITY FOR TODAY");
					System.out.println("Your activity is "+ activities.getName());
				}
			}
			System.out.println("The all activities are");
			for(ActivityType activities :aList) {
				System.out.println("Activity :" + activities.getName()+ " Activity Statu: " + activities.getStatu() + " Activities date: " + activities.getDate());
			}
		}
	}
}
