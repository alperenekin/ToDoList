package presentation;

/**
 * @author Alperen Ekin-Seymur Babaþlý,230201010-220201064
 *
 */
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import domain.ActivityType;
import domain.RoutineActivity;

public class Option2 {
	private RoutineActivity act=new RoutineActivity(null, null,null,null,null);
	private Scanner scan1=new Scanner(System.in);
	public Option2(ArrayList<ActivityType> aList) throws ParseException {
		for(int i=0;i<aList.size();i++) {
			/////////////SADECE HOBBY E GÖRE DÜZENLE
			System.out.println(i+"th "+ aList.get(i).getName()+" is " + aList.get(i).getDate());
			}
		System.out.println("Which one do you want to change ?");
		int choose=scan1.nextInt();
		System.out.println("Enter your new activity date as DD-MM-YYYY-hh:mm");
		String newDate=scan1.next();
		act.makePostponed(aList.get(choose),newDate);
		System.out.println("Your activity's new date is " + aList.get(choose).getDate());

	}

}
