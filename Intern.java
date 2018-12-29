/* MSIT 5413 Group Project
* Class Intern
* Description: ....
* Contributor: Kathryn Greer
* Contributor:
*/ 

public class Intern 
{
    // instance varables
    private String name;
    private String email;
    private String internshipType;
    private String internshipSemester;
    
    // reference to an associated object of class Internship
    private Internship internship;
    
    // default constructor with no parameters
    public Intern()
    {
        name="";
        email="";
        internshipType="";
        internshipSemester="";
    }
    
    // constructor with four parameters
    public Intern( String n, String e, String t, String s )
    {
        name = n;
        email = e;
        internshipType = t;
        internshipSemester = s;
    }
    
    // method to add/edit name
    public void setName( String n )
    {
        name = n;
    }
    
    // method to add/edit email
    public void setEmail( String e )
    {
        email = e;
    }
    
    // method to add/edit internship type
    public void setInternshipType( String t )
    {
        internshipType = t;
    }
    
    // method to add/edit internship semester
    public void setInternshipSemester( String s )
    {
        internshipSemester = s;
    }
    
    // method to retrieve name
    public String getName()
    {
        return name;
    }
    
    // method to retrieve email
    public String getEmail()
    {
        return email;
    }
    
    // method to retrieve internship type
    public String getInternshipType()
    {
        return internshipType;
    }
    
    // method to retrieve internship semester
    public String getInternshipSemester()
    {
        return internshipSemester;
    }
    
    // method to delete intern ?
    
    
    // method to create string to hold value of instance variables
    public String displayIntern()
    {
        String out;
        out = name + "\t" + email + "\t" + internshipType + "\t" +
                internshipSemester;
        return out;
    } // end method displayIntern
    
} // end class Intern
