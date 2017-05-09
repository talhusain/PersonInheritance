import java.util.*;

public class Person
{

    // instance variables
    protected String Name;       //  the Name
    protected String Address;   //  the Address
    protected String Phone;     //  the Phone
    protected String Email;     //  the Email


    private static int status = 0;  // static class variable

    // allows client to set beginning values for
    // Title, and Author;
    // increments status
    public Person()
    {

    }
    public Person( String Name, String Address, String Phone, String Email )
    {

       setName( Name );
       setAddress( Address );
       setPhone( Phone );
       setEmail( Email );
       status++;    // increment

    }

    // Accessor Methods
    // returns current value of Name
    public String getName( )
    {
       return Name;
    }

    // returns current value of Address
    public String getAddress( )
    {
       return Address;
    }

    // returns current value of Phone
    public String getPhone( )
    {
       return Phone;
    }

    // returns current value of Email
    public String getEmail( )
    {
       return Email;
    }

    // returns status
    public static int getstatus( )
    {
       return status;
    }

    // Mutator Methods:
    // allows client to set value of Name;
    public void setName( String newName )
    {

       Name = newName;

    }

    // allows client to set value of Address;
    public void setAddress( String newAddress )
    {

       Address = newAddress;

    }

    // allows client to set value of Phone;
    public void setPhone( String newPhone )
    {

       Phone = newPhone;

    }

    // allows client to set value of Address;
    public void setEmail( String newEmail )
    {

       Email = newEmail;

    }

}