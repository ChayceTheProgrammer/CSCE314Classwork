package AbstractEmployeeExample;

//abstract is meant to be extended (made into a super/parent/base class)
//generalization for specific subclasses

//abstract classes are not meant for instantiation
//No - Employee Chayce = new Employee(...)
//Yes - Employee Chayce = new HourlyEmployeee(...)
//Holds absctract methods (required)
//can have constructors but subclasses call them
//-Data members
//-public/protected methods

//NO Private Methods
//Private Variables can be accessed by public methods

//select 'abstract' in modifiers
//in UML, italicize abstract class names

//Abstract classes are not meant to be instantiated,
//they are meant to be a template for derived classes
public abstract class Employee
{
	protected String name;
	protected HireDate hireDate;

	public abstract double getMonthlyPay();
	// abstract since this method will be defined differently in the sub classes
	// both sub-class definitions need to return a double and be of the same name

	// a BASE class (abstract or not) needs a DEFAULT constructor
	public Employee()
	{
		this.name = "N/A";
		this.hireDate = null;
	}
	
	public Employee(String name, HireDate hireDate2)
	{
		this.name = name;
		this.hireDate = hireDate2;
	}
	
	public boolean samePay(Employee other)
	{
		return (this.getMonthlyPay() == other.getMonthlyPay());
	}

	// setters and getters
	public boolean equals(Object obj) { return false; }

	protected String getName() { return name; }

	protected void setName(String name) { this.name = name;	}

	protected HireDate getHireDate() { return hireDate;	}

	protected void setHireDate(HireDate hireDate) { this.hireDate = hireDate; }
}
