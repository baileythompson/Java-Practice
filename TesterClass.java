/* MSIT 5413 Group Project
* Class TesterClass
*
* Description: Displays all intern and internship object data, matches 
* interns with relevant internships, and displays the matches.
*
* Contributor: Kathryn Greer
* contributer: Dana Anderson
* Contributor: Bailey Thompson 
* Contributor: Kimberly Wright
* References: Java: How to Code Chapter 7
*/
import java.util.Scanner; // uses class Scanner
import java.util.ArrayList; // uses class ArrayList

public class TesterClass
{
      
    // main method begins program execution
    public static void main( String[] args )
        {
    
      // This gets and displays the information from InfoClass (Dana)     
      InfoClass class1 = new InfoClass(); 
      class1.class1Method();
    
       // create a scanner object
      Scanner in = new Scanner( System.in );
      
        // create objects
    Intern intern = new Intern();
    Internship internship = new Internship();
      
    // declare arraylists
    ArrayList <Intern> internList = new ArrayList <>();
    ArrayList <Internship> internshipList = new ArrayList <>();
      
      // create objects of the intern class
      Intern intern1 = new Intern( "Sara Jones", "sjones@college.edu",
              "Programming", "Fall 2018" );
      internList.add(intern1); // add to intern array
      Intern intern2 = new Intern( "Bob Trunt", "btrunt@college.edu",
              "Information Security", "Spring 2019" );
      internList.add(intern2); // add to intern array
      Intern intern3 = new Intern( "Lydia Scaro", "lscaro@college.edu",
              "Information Security", "Spring 2019" );
      internList.add(intern3); // add to intern array
      Intern intern4 = new Intern( "Carmen Torres", "ctorres@college.edu",
              "Web Development", "Summer 2019" );
      internList.add(intern4); // add to intern array
      Intern intern5 = new Intern( "Horacio Cortes", "hcortes@college.edu",
              "Data Migration", "Fall 2018" );
      internList.add(intern5); // add to intern array
      Intern intern6 = new Intern( "Murray Jenkins", "mjenkins@college.edu",
              "Software Engineering", "Summer 2018" );
      internList.add(intern6); // add to intern array
      Intern intern7 = new Intern( "Lora Herren", "lherren@college.edu",
              "Data Migration", "Fall 2018" );
      internList.add(intern7); // add to intern array
      Intern intern8 = new Intern( "Ella Black", "eblack@college.edu",
              "Technical Support", "Spring 2019" );
      internList.add(intern8); // add to intern array
      Intern intern9 = new Intern( "Jack Kalish", "jkalishs@college.edu",
              "Web Development", "Summer 2018" );
      internList.add(intern9); // add to intern array
      Intern intern10 = new Intern( "James Peterman", "jpeterman@college.edu",
              "Data Entry", "Spring 2018" );
      internList.add(intern10); // add to intern array
      Intern intern11 = new Intern( "Kendall Mittler", "kmittler@college.edu",
              "Data Analysis", "Fall 2018" );
      internList.add(intern11); // add to intern array
      Intern intern12 = new Intern ( "James Miller" , "jmiller@college.edu",
              "Programming" , "Spring 2019" );
      internList.add(intern12); // add to intern array
      Intern intern13 = new Intern( "Stacey Williams", "swilliams@college.edu",
              "Web Development" , "Fall 2018");
      internList.add(intern13); // add to intern array
      Intern intern14 = new Intern ( "Toya Smith", "tsmith@college.edu",
              "Technical Support", "Summer 2018");
      internList.add(intern14);// add to the intern array
      Intern intern15 = new Intern( "Rick Thomas", "rthomas@college.edu",
              "Data Analysis", "Spring 2018");
      internList.add(intern15);// add to intern array
       
      System.out.println( " " ); 
      System.out.print( "Would you like to add additional intern infomation? " 
              + "If so, how many interns? " );
      int addInterns = in.nextInt();
      
      // for each user input create object and add to intern array
      for (int i = 0; i < addInterns; i++ )
      {       
          System.out.println(); // print blank line
          System.out.print("ADD INTERN DATA: " + "\n");
          System.out.print("Enter intern name: ");
          intern.setName(in.next());
          System.out.print("Enter intern email: ");
          intern.setEmail(in.next());
          System.out.print("Enter internship type: ");
          intern.setInternshipType(in.next());
          System.out.print("Enter internship semester: ");
          intern.setInternshipSemester(in.next());
          internList.add(intern);
      }
      
      System.out.println(); // print blank line
      System.out.println( "LIST OF INTERNS" );
      // for each object in intern array, print intern name, email,
      // internship type, and semester
      System.out.printf( "%15s%25s%25s%15s\n", "NAME", "EMAIL",
              "INTERNSHIP TYPE", "SEMESTER" );// list headers
      for ( int i = 0; i < internList.size(); i++ )
      {
          intern = internList.get(i);
          System.out.printf( "%15s%25s%25s%15s\n", intern.getName(), 
                  intern.getEmail(), intern.getInternshipType(),
                  intern.getInternshipSemester() );
      }
 
      // create objects of internship class
      Internship internship1 = new Internship( "Avis Car Rentals", "Jim Smith", 
              "jsmith@avis.com", "Programmer Asst", "Paid", "Programming", 
              "Fall 2018" );
      internshipList.add(internship1); // add to internship array
      Internship internship2 = new Internship( "Bobs Plumbing", "Jenna Salvo", 
              "jsalvo@bplumb.com", "Junior Web Developer", "Paid", 
              "Programming", "Fall 2018" );
      internshipList.add(internship2); // add to internship array
      Internship internship3 = new Internship( "Cisco", "Darl Mitey", 
              "dmitey@cisco.org", "Security Operations Associate", "Paid", 
              "Information Security", "Fall 2018" );
      internshipList.add(internship3); // add to internship array
      Internship internship4 = new Internship( "Flowers By Carol", 
              "Jenny Stevens", "jsteve@flower.org", "Web Developer", "Paid", 
              "Programming", "Spring 2018" );
      internshipList.add(internship4); // add to internship array
      Internship internship5 = new Internship( "IBM", "Mike Conway",
              "mconway@ibm.com", "HR Coordinator", "Paid",
              "Data Migration", "Fall 2018" );
      internshipList.add(internship5); // add to internship array
      Internship internship6 = new Internship( "NASA", "Carl Johnson", 
              "cjohnson@nasa.org", "Senior Software Engineer", "Paid",
              "Sofware Engineering", "Summer 2018" );       
      internshipList.add(internship6); // add to internship array
      Internship internship7 = new Internship( "EPA", "Elizabeth Ness", 
              "eness@epa.org", "Data Migration Specialist", "Unpaid",
              "Data Migration", "Fall 2018" );
      internshipList.add(internship7); // add to internship array
      Internship internship8 = new Internship( "Raycom Media", "Vince Hodges", 
              "vhodges@raycommedia.net", "General Manager", "Unpaid",
              "Technical Support", "Spring 2019" );
      internshipList.add(internship8); // add to internship array
      Internship internship9 = new Internship( "Warner Bros Studios", "Ellie Sanders", 
              "esanders@warnerbros.com", "Database Manager", "Paid",
              "Data Entry", "Spring 2018" );
      internshipList.add(internship9); // add to internship array
      Internship internship10 = new Internship( "Letters London", "Charlie Thompson", 
              "cthompson@letterslondon.com", "Senior Web Developer", "Paid",
              "Web Development", "Summer 2018" );   
      internshipList.add(internship10); // add to internship array
      Internship internship11 = new Internship( "FBI", "Aaron Hotchner", 
              "ahotchner@fbiquantico.org", "BAU Analysis Head", "Unpaid",
              "Data Analysis", "Fall 2018" );
      internshipList.add(internship11); // add to internship array
      Internship internship12 =new Internship( "Sony Music", "Shanelle Smith",
               "ssmith@sonymusic.com", "Technical Support Specalist","Paid",
               "Technical Support", "Summer 2018");
      internshipList.add(internship12); // add to intership array
      Internship internship13 = new Internship( "Bank of America", "Tevin Williams",
               "twilliams@bankofamerica.com", "Analyst", "Unpaid",
               "Data Analysis", "Spring 2018");
      internshipList.add(internship13); //add to internship array
      Internship internship14 = new Internship ("Apple", "Garrett Jones",
               "gjones@apple.com", "Information Security Analyst", "Paid",
               "Information Security", "Fall 2018");
      internshipList.add(internship14); //add to internship array
      Internship internship15 = new Internship ("Comcast", "Aliah Tucker",
               "atucker@comcast.com", "Web Developer", "Unpaid",
               "Web Development", "Summer 2018");
      internshipList.add(internship15); // add to internship array
               
      System.out.println(" ");
      System.out.print( "Would you like to add additional company infomation?"
              + " If so, how many internships? ");
      int addInternships = in.nextInt();
      
      // for each user input create object and add to internship array
      for ( int i = 0; i < addInternships; i++ )
      {
          System.out.println(); // print blank line
          System.out.println("ADD COMPANY DATA: ");
          System.out.print("Enter company name: ");
          internship.setCompanyName(in.next());
          System.out.print("Enter contact name: ");
          internship.setContactName(in.next());
          System.out.print("Enter contact email: ");
          internship.setContactEmail(in.next());
          System.out.print("Enter internship title: ");
          internship.setInternshipTitle(in.next());
          System.out.print("Is internship paid?: ");
          internship.setPaidUnpaid(in.next());
          System.out.print("Enter internship type: ");
          internship.setInternshipType(in.next());
          System.out.print("Enter internship semester: ");
          internship.setInternshipSemester(in.next());
          internshipList.add(internship);
      }
      System.out.println(); // print blank line
      System.out.println( "LIST OF INTERNSHIPS" );
      // for each object in internship array print company name, internship 
      // type,  semester, contact name, contact email, and paid status
      System.out.printf( "%20s%25s%15s%20s%30s%10s\n", "COMPANY", "INTERNSHIP TYPE",
              "SEMESTER", "CONTACT NAME", "CONTACT EMAIL", "PAID" ); // list headers
      for ( int i = 0; i < internshipList.size(); i++ )
      {
          internship = internshipList.get(i);
          System.out.printf( "%20s%25s%15s%20s%30s%10s\n", 
                  internship.getCompanyName(), 
                  internship.getInternshipType(), 
                  internship.getInternshipSemester(),
                  internship.getContactName(), internship.getContactEmail(),
                  internship.getPaidUnpaid() );
      }
      
      System.out.println(); // print blank line
      System.out.println( "Would you like to match interns? (1 yes, 0 no)" );
      int matchInternsPrompt = in.nextInt();
      
      if ( matchInternsPrompt == 1 )
      {
        //print blank line
        System.out.println();
        System.out.println("INTERNSHIP MATCHES");
        // list headers
        System.out.printf( "%15s%20s%15s%20s\n", "INTERN", "INTERNSHIP TYPE", 
        "SEMESTER", "MATCHING COMPANY" );
      
        // matching interns with internships
        for ( int i = 0; i < internList.size(); i++ )
        {
            intern = internList.get(i);
            internship = internshipList.get(i);

            if ( intern.getInternshipType().equals(internship.getInternshipType())
                && intern.getInternshipSemester().equals(internship.getInternshipSemester()))
            {
                // display matching interns
                System.out.printf( "%15s%20s%15s%20s\n", intern.getName(), 
                    intern.getInternshipType(), intern.getInternshipSemester(),
                    internship.getCompanyName() );
            }
        }
      }
    } // end method main
} // end class TesterClass
