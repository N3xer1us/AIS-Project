package course.proj.entities;

import java.util.*;

/**
 * 
 */
public class ScoreBoard {

	
    public ScoreBoard() {
    	ChildList = new ArrayList<Child>();
    }


    private ArrayList<Child> ChildList;
    
    
    
    public void addChild( Child child) {
        // TODO implement here
        ChildList.add(child);
    }

    public void removeChild(Child child) {
        // TODO implement here
        ChildList.remove(child);
    }
    
    public void editChild(Child child, Child newChild) {
        // TODO implement here
        ChildList.remove(child);
        ChildList.add(newChild);
    }

    public Child getChildById( int Id) {
        return ChildList.get(Id);
    }

    public List<Child> getAll() {
        // TODO implement here
        return ChildList;
    }

}