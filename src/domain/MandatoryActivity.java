package domain;

/**
 * @author Alperen Ekin-Seymur Babaþlý,230201010-220201064
 *
 */
import java.text.ParseException;
import java.util.Date;

public interface MandatoryActivity {
	public String getName();
	public void setName(String name);
	public void setDate(String date);
	public Statu getStatu();
	public void setStatu(Statu statu);
	public void makePostponed(ActivityType act, String newDate) throws ParseException ;
	public void setCurrentDate(String currentdat);
	public Date getCurrentDate();
}
