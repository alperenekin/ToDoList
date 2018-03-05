package presentation;

import java.util.ArrayList;
import java.util.Scanner;

import domain.ActivityType;
import domain.RoutineActivity;
import domain.SingleActivity;
import domain.Statu;

/**
 * @author Alperen Ekin-Seymur Babaþlý,230201010-220201064
 *
 */
public class Option1part2 {
	private String name;
	private String date;
	private String deadline;
	private String frequency;
	private Statu statu;
	private RoutineActivity act=new RoutineActivity(null, null,null,null,null);
	private Scanner scan1=new Scanner(System.in);
	public Option1part2(ArrayList<ActivityType> aList,ArrayList<ActivityType> hobbyList) {
		System.out.println("Press 1 for single activity or press 2 for routine activity");
		int choose3=scan1.nextInt();
		if(choose3==1) {//single seçildi
			System.out.println("Enter your activity name");
			name=scan1.next();
			System.out.println("Enter your activity date as DD-MM-YYYY-hh:mm");
			date=scan1.next();
			System.out.println("Enter your activity Statu");
			String choose6=scan1.next();
			statu=Statu.valueOf(choose6.toUpperCase());
			SingleActivity act1=new SingleActivity(name,date,statu);
			act1.addtoList(act1, aList,hobbyList);
			}
		if(choose3==2) {//routine seçildi
			System.out.println("Enter your activity name");
			name=scan1.next();
			System.out.println("Enter your activity date as DD-MM-YYYY-hh:mm");
			date=scan1.next();
			System.out.println("Enter your activity Statu");
			String choose6=scan1.next();
			statu=Statu.valueOf(choose6.toUpperCase());
			System.out.println("How often are you going to do that activity?Press 1 for dayly or press 2 for weekly or press3 for montlhy");
			int choose7=scan1.nextInt();
			if(choose7==1) {//dayly
				System.out.println("How many day you are going to do ?");
				frequency=scan1.next();
				System.out.println("If you would like to choose deadline enter 1,if you dont enter 2");
				int choose4=scan1.nextInt();
				RoutineActivity ract=new RoutineActivity(name,date,statu,frequency,null);
				if(choose4==1) {
					System.out.println("write the deadline date as DD-MM-YYYY-hh:mm");
					deadline=scan1.next();
					ract.setDeadline(deadline);
					System.out.println("deadline is " +ract.getDeadline());
					act.daylyActivityWithDeadline(ract, aList,hobbyList);
				}
				else if(choose4==2) {
					act.nextdaylyactivities(ract, aList,hobbyList);
				}
			}
			if(choose7==2) {//wweekly
				System.out.println("How many week you are going to do ?");
				frequency=scan1.next();
				System.out.println("If you would like to choose deadline enter 1,if you dont enter 2");
				int choose4=scan1.nextInt();
				RoutineActivity ract=new RoutineActivity(name,date,statu,frequency,null);
				if(choose4==1) {
					System.out.println("write the deadline date as DD-MM-YYYY-hh:mm");
					deadline=scan1.next();
					ract.setDeadline(deadline);
					System.out.println("deadline is " +ract.getDeadline());
					act.weeklyActivityWithDeadline(ract, aList,hobbyList);
				}
				else if(choose4==2) {
					act.nextweeklyactivities(ract, aList,hobbyList);
				}
			}
			if(choose7==3) {//monthly
				System.out.println("How many month you are going to do ?");
				frequency=scan1.next();
				System.out.println("If you would like to choose deadline enter 1,if you dont enter 2");
				int choose4=scan1.nextInt();
				RoutineActivity ract=new RoutineActivity(name,date,statu,frequency,null);
				if(choose4==1) {
					System.out.println("write the deadline date as DD-MM-YYYY-hh:mm");
					deadline=scan1.next();
					ract.setDeadline(deadline);
					System.out.println("deadline is " +ract.getDeadline());
					act.monthlyActivityWithDeadline(ract, aList,hobbyList);
				}
				else if(choose4==2) {
					act.nextmonthlyactivities(ract, aList,hobbyList);
				}
			}
		}	
	}

}


