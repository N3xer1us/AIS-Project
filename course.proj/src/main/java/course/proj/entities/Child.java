package course.proj.entities;

import java.util.*;

/**
 * 
 */
public class Child extends User {

	public Child()
	{
		
	}
    
    public Child(String fName , String mName, String lName,
    			 boolean isDisabled , boolean isTwin , boolean isSibling ,
    			 int group , Parent parent1 , Parent parent2) 
    {
    	super(fName , mName , lName , "");
    	this.isDisabled= isDisabled;
    	this.isTwin = isTwin;
    	this.isSibling= isSibling;
    	this.kinderGroup=group;
    	this.score = 0;
    	
    	Parents= new ArrayList<Parent>();
    	
    	Parents.add(parent1);
    	
    	if(parent2!=null)
    	{
    	Parents.add(parent2);
    	}
    }
    
    
    private boolean isDisabled;
    private boolean isTwin;
    private boolean isSibling;
    private int kinderGroup;
    private int score;
    private ArrayList<Parent> Parents;




    public boolean getIsDisabled() {
        // TODO implement here
        return isDisabled;
    }

    public void setIsDisabled( boolean isDisabled) {
    	this.isDisabled=isDisabled;
    }

    public boolean getIsTwin() {
        // TODO implement here
        return isTwin;
    }

    public void setIsTwin( boolean isTwin) {
    	this.isTwin = isTwin;
    }

    public boolean getIsSibling() {
        // TODO implement here
        return isSibling;
    }

    public void setIsSibling( boolean isSibling) {
    	this.isSibling= isSibling;
    }

    public int getKinderGroup() {
        // TODO implement here
        return kinderGroup;
    }

    public void setKinderGroup( int group) {
    	this.kinderGroup=group;
    }

    public int getScore() {
        // TODO implement here
        return score;
    }

    public void setScore( int score) {
    	this.score=score;
    }

    public int evaluate() 
    {
    	if(isDisabled) 	score +=2;
    	if(isTwin)		score +=1;
    	if(isSibling) 	score +=1;
    	
    	if(Parents.get(0).getIsWorking()) score += 1;
    	if(Parents.size()>1)
    	{
    	if(Parents.get(1).getIsWorking()) score += 1;
    	}
    	
    	return score;
    }

    public void addParent( Parent parent) {
        Parents.add(parent);
    }

    public void removeParent( Parent parent) {
    	Parents.remove(parent);
    }

    public void editParent(Parent parent,Parent newParent) {
        Parents.remove(parent);
        Parents.add(newParent);
    }

}