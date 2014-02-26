package database.controller;


import java.util.ArrayList;

import database.model.GraveMarker;
import database.model.Person;
import database.view.DatabaseFrame;


public class AppController
{
	private DatabaseController myDataController;
	private DatabaseFrame myAppFrame;
	private ArrayList<GraveMarker> graveMarkerList;
	private ArrayList<Person> graveyardPersons;
	
	
	public AppController()
	{
		myDataController = new DatabaseController();
		
		graveyardPersons = new ArrayList<Person>();
		graveMarkerList = new ArrayList<GraveMarker>();
		
	}
	
	public void start()
	{
		myAppFrame = new DatabaseFrame(this);
	}
	
	public void addDeadPerson(Person currentDeadPerson)
	{
		graveyardPersons.add(currentDeadPerson);
	}
}
