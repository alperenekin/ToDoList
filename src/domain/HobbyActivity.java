package domain;

/**
 * @author Alperen Ekin-Seymur Babaþlý,230201010-220201064
 *
 */
import java.util.Date;

public interface HobbyActivity {
	public String getName();
	public void setName(String name);
	public void setDate(String date);
	public Statu getStatu();
	public void setStatu(Statu statu);
	public void setCurrentDate(String currentdat);
	public Date getCurrentDate();
}
