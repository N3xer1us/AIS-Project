package course.proj.entities;


public class Admin extends User {

    public Admin() {
    }
    
    public Admin(String fName , String mName , String lName , String email,
    		     String pass) 
    {
    	super(fName, mName, lName, email);
    	this.password=pass;
    }
    
    
    private String password;
    
    
    public String getPassword()
    {
    	return password;
    }
    
    public void setPassword(String pass)
    {
    	this.password= pass;
    }

}