/* Info class for group project
* Description
* Contributor: Dana Anderson
*/

public class InfoClass {                       
    private String name = "Interns and Companies ";
    private String names = "Kathryn Greer, Dana Anderson, Kimberly Wright, Bailey Thompson ";
    private String instructions = "This program will match interns with companies looking for interns ";
   

    public void class1Method() {
        System.out.println("The Name of our Program is: " + name);
        System.out.println("The Members of our Group are: " + names);
        System.out.println("Program Instructions: " + instructions);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }
    
    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions){ 
        this.instructions = instructions;
    }





}


