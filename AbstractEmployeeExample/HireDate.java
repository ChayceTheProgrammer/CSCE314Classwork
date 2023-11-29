package AbstractEmployeeExample;

public class HireDate 
{
	private int month;
	private int day;
	private int year;
	
	public HireDate(int month, int day, int year) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
	}

	// Getters
	public int getMonth() { return month; }
	public int getDay() { return day; }
	public int getYear() { return year; }

	// Setters
	public void setMonth(int month) { this.month = month; }
	public void setDay(int day) { this.day = day; }
	public void setYear(int year) { this.year = year; }

	@Override
	public String toString() {
		return "HireDate [month=" + month + ", day=" + day + ", year=" + year + ", getMonth()=" + getMonth()
				+ ", getDay()=" + getDay() + ", getYear()=" + getYear() + "]";
	}
}