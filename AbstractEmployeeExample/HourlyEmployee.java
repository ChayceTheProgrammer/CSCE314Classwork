package AbstractEmployeeExample;

public class HourlyEmployee extends Employee {
  private double wageRate;
  private double hours; // for the month

  public HourlyEmployee(String name, HireDate hireDate, double wageRate, double hours) {
    super(name, hireDate);
    this.wageRate = wageRate;
    this.hours = hours;
  }

  // setters and getters

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long temp;
    temp = Double.doubleToLongBits(hours);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(wageRate);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) 
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    HourlyEmployee other = (HourlyEmployee) obj;
    if (Double.doubleToLongBits(hours) != Double.doubleToLongBits(other.hours))
      return false;
    if (Double.doubleToLongBits(wageRate) != Double.doubleToLongBits(other.wageRate))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "HourlyEmployee [wageRate=" + wageRate + ", hours=" + hours + ", name=" + name + ", hireDate=" + hireDate
        + "]";
  }

  public double getWageRate() { return wageRate; }

  public void setWageRate(double wageRate) { this.wageRate = wageRate;  }
  
  public double getMonthlyPay() { return getHours() * getWageRate() * 4; }

  public double getHours() { return hours; }

  public void setHours(double hours) { this.hours = hours; }

}
