// MSIT 5413 Group Project
// Class Internship
// Description: ....
// Contributor Bailey Thompson 4/17/18

public class Internship // begin class
{
    private String companyName;
    private String contactName;
    private String contactEmail;
    private String internshipTitle;
    private String paidUnpaid;
    private String internshipType;
    private String internshipSemester;
    
    // empty constructor
    public Internship()
    {
        companyName="";
        contactEmail="";
        internshipTitle="";
        paidUnpaid="";
        internshipType="";
        internshipSemester="";
    }
    
    public Internship( String m, String a, String e, String b, 
            String p, String y, String r )
    {
        companyName = m;
        contactName = a;
        contactEmail = e;
        internshipTitle = b;
        paidUnpaid = p;
        internshipType = y;
        internshipSemester = r;
    }
    
    public void setCompanyName( String m )
    {
        companyName = m;
    }
    
    public void setContactName( String a)
    {
         contactName = a;
    }
    
    public void setContactEmail( String e )
    {
        contactEmail = e;
    }
    
    public void setInternshipTitle( String b )
    {
        internshipTitle = b;
    }
    
    public void setPaidUnpaid( String p )
    {
         paidUnpaid = p;
    }
    
    public void setInternshipType( String y )
    {
        internshipType = y;
    }
    
    public void setInternshipSemester( String r )
    {
        internshipSemester = r;
    }
    
    public String getCompanyName()
    {
        return companyName;
    }
    
    public String getContactName()
    {
        return contactName;
    }
    
    public String getContactEmail()
    {
        return contactEmail;
    }
    
    public String getInternshipTitle()
    {
        return internshipTitle;
    }
    
    public String getPaidUnpaid()
    {
        return paidUnpaid;
    }
    
    public String getInternshipType()
    {
        return internshipType;
    }
    
    public String getInternshipSemester()
    {
        return internshipSemester;
    }
    
    public String displayInternship()
    {
        String out;
        out = companyName + "\t" + contactName + "\t" + contactEmail + "\t" +
                internshipTitle + "\t" + paidUnpaid + "\t" + internshipType +
                "\t" + internshipSemester;
        return out;
    } 
} // end class Internship