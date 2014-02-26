package database.model;

import java.util.ArrayList;


public class GraveMarker
{
	private ArrayList<Person> gravePersonList;
	private boolean isReadable;
	private String location;
	private String graveInformation;
	private String typeOfGrave;
	
	public GraveMarker()
	{
		
	}
	//constructor
	//get/set
	
	public String toString()
	{
		String graveInfo = "";
		
		for(Person current : gravePersonList)
		{
			graveInfo += current + " is buried here.\n";
		}
		
		if(isReadable)
		{
			graveInfo += "This grave is readable";	
		}
		else
		{
			graveInfo += "This grave is NOT readable";
		}
		
		return graveInfo;
	}
	

}
