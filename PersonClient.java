public class PersonClient
{
	public static void main( String [] args )
	{
		//employee1
		Employee employee1 = new Employee();
	
		employee1.setName("John");
		employee1.setAddress("123 silversands parkway");
		employee1.setPhone("555-55-5555");
		employee1.setEmail("TooCoolForSchool@yahoo.com");
		employee1.setOffice("Ahker Solutions");
		employee1.setSalary("23.50");
		employee1.setPosition("CEO");

		//student1
		Student student1 = new Student();

		student1.setName("Thamer Al-Husain");
		student1.setAddress("620 Hickory St");
		student1.setPhone("123-45-6789");
		student1.setEmail("t_alhusain@yahoo.com");
		student1.setStatus("Sophomore");

		//employee1
		System.out.println("Employee #1");
		System.out.println("Name: " + employee1.getName());
		System.out.println("Address: " + employee1.getAddress());
		System.out.println("Phone: " + employee1.getPhone());
		System.out.println("Email: " + employee1.getEmail());
		System.out.println("Office: " + employee1.getOffice());
		System.out.println("Salary: " + employee1.getSalary());
		System.out.println("Position: " + employee1.getPosition());
		System.out.println();

		//student1
		System.out.println("Student #1");
		System.out.println("Name: " + student1.getName());
		System.out.println("Address: " + student1.getAddress());
		System.out.println("Phone: " + student1.getPhone());
		System.out.println("Email: " + student1.getEmail());
		System.out.println("Status: " + student1.getStatus());

	}
}

