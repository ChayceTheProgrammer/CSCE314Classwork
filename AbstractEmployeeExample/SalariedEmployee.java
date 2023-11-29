package AbstractEmployeeExample;

public class SalariedEmployee extends Employee {
  private double salary; // annual

  public SalariedEmployee(String pName, HireDate pHireDate, double salary) {
    super(pName, pHireDate);
    this.salary = salary;
  }

// setters and getters
  public double getMonthlyPay() { return getSalary() / 12; }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long temp;
    temp = Double.doubleToLongBits(salary); // please, whatevs
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
    SalariedEmployee other = (SalariedEmployee) obj;
    if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
      return false;
    return true;
    
  }

  @Override
  public String toString() {
    return "SalariedEmployee [salary=" + salary + ", name=" + super.name + ", hireDate=" + super.getHireDate() + "]";
  }

  public double getSalary() { return salary; }

  public void setSalary(double salary) { this.salary = salary; }

}
