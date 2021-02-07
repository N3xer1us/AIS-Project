package course.proj.entities;


public class User {

	public User() 
	{
		
	}
	
    public User(String fName , String mName, String lName ,
    			String email ) 
    {
    	this.firstName=fName;
    	this.midName=mName;
    	this.lastName=lName;
    	this.eMail=email;
    }


    private String firstName;
    private String midName;
    private String lastName;
    private String eMail;

   

    public String getFName() {
        return firstName;
    }

    public void setFName( String fName) {
    	this.firstName=fName;
    }

    public String getMName() {
        return midName;
    }

    public void setMName( String mName) {
    	this.midName=mName;
    }

    public String getLName() {
        return lastName;
    }

    public void setLName( String lName) {
        this.lastName=lName;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail( String eMail) {
        this.eMail=eMail;
    }

}