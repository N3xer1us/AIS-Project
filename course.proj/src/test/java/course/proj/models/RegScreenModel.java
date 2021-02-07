package course.proj.models;

import course.proj.entities.Child;
import course.proj.entities.Parent;
import course.proj.services.RegService;

public class RegScreenModel {

	private RegService rs = new RegService();
	private boolean child_NameValid= false;
	private boolean parent1_NameValid= false;
	private boolean parent2_NameValid= false;
	private String message="";
	
	private String child_FName="";
	private String child_MName="";
	private String child_LName="";
	private boolean isDisabled = false;
	private boolean isTwin	   = false;
	private boolean isSibling  = false;
	private int kinderGroup=0;
	
	private String parent1_FName="";
	private String parent1_MName="";
	private String parent1_LName="";
	private String parent1_Email="";
	private boolean parent1_isWorking=false;
	
	private boolean hasOneParent = false;
	
	private String parent2_FName="";
	private String parent2_MName="";
	private String parent2_LName="";
	private String parent2_Email="";
	private boolean parent2_isWorking=false;
	
	
	
	public void navigateToMe() {
		System.out.println("Child registration form opened");
	}
	
	
	
	public void setChildName(String first , String middle , String last)
	{
		this.child_FName = first;
		this.child_MName = middle;
		this.child_LName = last;
		
		this.child_NameValid = rs.textFieldValidation(child_FName, child_MName, child_LName);
	}
	
	public void setIsDisabled(boolean isDisabled) {
		this.isDisabled = isDisabled;
	}
	
	public void setIsTwin(boolean isTwin) {
		this.isTwin = isTwin;
	}
	
	public void setIsSibling(boolean isSibling) {
		this.isSibling = isSibling;
	}
	
	public void setHasOneParent(boolean hasOneParent)
	{
		this.hasOneParent = hasOneParent;
	}
	
	public void setKinderGroup(int group)
	{
		this.kinderGroup=group;
	}
	
	//public String validateChildName()
	//{
	//	return rs.textFieldValidation(child_FName, child_MName, child_LName);
	//}
	
	
	public void setParent1Name(String first , String middle , String last)
	{
		this.parent1_FName = first;
		this.parent1_MName = middle;
		this.parent1_LName = last;
		
		this.parent1_NameValid = rs.textFieldValidation(parent1_FName, parent1_MName, parent1_LName);
	}

	public void setParent1Email(String email) 
	{
		this.parent1_Email = email;
	}
	
	public void setParent1IsWorking(boolean isWorking)
	{
		this.parent1_isWorking= isWorking;
	}
	
	//public String validateParent1Name()
	//{
	//	return rs.textFieldValidation(parent1_FName, parent1_MName, parent1_LName);
	//}
	
	
	public void setParent2Name(String first , String middle , String last)
	{
		this.parent2_FName = first;
		this.parent2_MName = middle;
		this.parent2_LName = last;
		
		this.parent2_NameValid = rs.textFieldValidation(parent2_FName, parent2_MName, parent2_LName);
	}

	public void setParent2Email(String email) 
	{
		this.parent2_Email = email;
	}
	
	public void setParent2IsWorking(boolean isWorking)
	{
		this.parent2_isWorking= isWorking;
	}
	
	//public String validateParent2Name()
	//{
	//	return rs.textFieldValidation(parent2_FName, parent2_MName, parent2_LName);
	//}
	
	
	
	public void registerChild() 
	{
		if(hasOneParent==true) parent2_NameValid = true;
		
		if(child_NameValid && parent1_NameValid && parent2_NameValid)
		{
			Child child;
		
			Parent parent1 = new Parent(parent1_FName , parent1_MName , parent1_LName ,
									parent1_Email, parent1_isWorking);
		
			if(hasOneParent==false)
			{
			
				Parent parent2 = new Parent(parent2_FName , parent2_MName , parent2_LName ,
										parent2_Email, parent2_isWorking);
		
				child = new Child(child_FName , child_MName , child_LName ,
									isDisabled , isTwin , isSibling , kinderGroup,
									parent1 , parent2);
			}
			else
			{
				child = new Child(child_FName , child_MName , child_LName ,
								isDisabled , isTwin , isSibling , kinderGroup,
								parent1 , null);
			}
		
			message = rs.registerChild(child);
			
		}
		else 
		{		
			message = "There are Empty Fields";
		}
		
	}
	
	public String getMessage() {
		return message;
	}
	
}
