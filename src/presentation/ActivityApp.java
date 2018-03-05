package presentation;
/**
 * @author Alperen Ekin-Seymur Babaþlý,230201010-220201064
 *
 */
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import domain.ActivityType;

public class ActivityApp {

	public static void main(String[] args) throws ParseException {
		ArrayList<ActivityType> aList =new ArrayList<ActivityType>();
		ArrayList<ActivityType> hobbyList=new ArrayList<ActivityType>();
		boolean flag=true;;
		Scanner scan1=new Scanner(System.in);
		while(flag) {
			System.out.println("Press 1 for adding new task , press 2 for postphone, press 3 for setting the current date and view activities or press 4 for exit");
			
			int choose1=scan1.nextInt();
			if(choose1==1) {//new task ekle
				System.out.println("Press 1 for mandatory activity or press 2 for hobby activity");
				int choose2=scan1.nextInt();
				if(choose2==1) {//mandatory seçildi
					Option1part1 opt11=new Option1part1(aList);	
				}
				if(choose2==2) {//hobby seçildi
					Option1part2 opt12=new Option1part2(aList,hobbyList);
				}
			}
			if(choose1==2) {
				Option2 opt2=new Option2(hobbyList);
			}
			if(choose1==3) {
				Option3 opt3=new Option3(aList);
			}
			if(choose1==4)
				flag=false;
		}
		scan1.close();
	}
}
