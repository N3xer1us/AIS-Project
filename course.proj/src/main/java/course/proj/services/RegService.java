package course.proj.services;

import course.proj.entities.Child;
import course.proj.entities.ScoreBoard;

public class RegService {

	ScoreBoard sBoard = new ScoreBoard();
	
	public boolean textFieldValidation(String field1 , String field2 , String field3)
	{
		boolean result = true;
		
		if(field1.isBlank() || field2.isBlank() || field3.isBlank())
		{
			result= false;
		}
		
		return result;
	}
	
	public String registerChild(Child child)
	{
		int result = child.evaluate();
		
		sBoard.addChild(child);
		
		return String.valueOf(result);
	}
	
}
