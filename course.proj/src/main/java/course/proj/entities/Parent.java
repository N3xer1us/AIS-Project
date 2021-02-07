package course.proj.entities;

public class Parent extends User {


    public Parent()
    {
    	
    }
    
    public Parent(String fName , String mName, String lName , String email,
    		      boolean isWorking) 
    {
    	super(fName , mName , lName , email);
    	this.isWorking=isWorking;
    }
    
    
    private boolean isWorking=false;


    public boolean getIsWorking() {
        // TODO implement here
        return isWorking;
    }

    public void setIsWorking( boolean isWorking) {
    	this.isWorking=isWorking;
    }

}