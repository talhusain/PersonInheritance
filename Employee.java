public class Employee extends Person
{

	private String office;
	private String salary;
	private String position;

	public Employee()
	{
		super();
		office = "unknown";
		salary = "unknown";
		position = "unknown";

	}
	public Employee( String theName, String theAddress, String thePhone, String theEmail, String theOffice, String theSalary, String thePosition )
	{
		super( theName, theAddress, thePhone, theEmail );
		office = theOffice;
		salary = theSalary;
		position = thePosition;

	}


	public String getOffice()
	{
		return office;
	}


	public void setOffice( String theOffice )
	{
		office = theOffice;
	}


	public String getSalary()
	{
		return salary;
	}


	public void setSalary( String theSalary )
	{
		salary = theSalary;
	}


	public String getPosition()
	{
		return position;
	}


	public void setPosition( String thePosition )
	{
		position = thePosition;
	}


	public String toString()
	{
		String s = "Employee:"
						+ "\nOffice" + office + "\nSalary" + salary + "nPosition" + position + "\n" + super.toString();

		return s;
	}
}