public class Student extends Person
{

	private String status;

	public Student()
	{
		super();
		status = "unknown";

	}
	public Student( String theName, String theAddress, String thePhone, String theEmail, String theStatus )
	{
		super( theName, theAddress, thePhone, theEmail );
		status = theStatus;

	}


	public String getStatus()
	{
		return status;
	}


	public void setStatus( String theStatus )
	{
		status = theStatus;
	}


	public String toString()
	{
		String s = "Student:"
						+ "\nStatus" + status + "\n" + super.toString();

		return s;
	}
}