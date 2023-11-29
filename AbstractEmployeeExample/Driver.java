package AbstractEmployeeExample;

import java.util.ArrayList;
import java.util.Iterator;

public class Driver
{

	public static void main(String[] args)
	{
		Employee Lupoli = new SalariedEmployee("Lupoli", new HireDate(7,1,2010), 80000);
		Employee Dima = new HourlyEmployee("Dima", new HireDate(8,18,2013), 50, 10);
		HourlyEmployee Steve = new HourlyEmployee("Steve", new HireDate(1,23,2023), 50, 10000000);

		System.out.println(Lupoli);
		System.out.println(Dima);
		System.out.println(Steve);
		
		ArrayList<Employee> Workers = new ArrayList<Employee>(); 
		
		Workers.add(Lupoli);
		Workers.add(Dima);
		Workers.add(Steve);
		
		// Display everyone in the list, but make sure they have toString() function
		Iterator <Employee> list = Workers.iterator();
		while (list.hasNext())
		{
			System.out.println(list.next());
		}		
		
		System.out.println(Workers.get(0));
		
	}

}
