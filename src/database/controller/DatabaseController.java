package database.controller;

import java.sql.*;

import javax.swing.JOptionPane;

public class DatabaseController
{

	private String connectionString;
	private Connection databaseConnection;
	
	public DatabaseController()
	{
		connectionString = "jdbc:mysql://localhost/afternoon?user=derp";
		
		checkDriver();
		setupConnection();
	}
	
	/**
	 * Checks that the driver for the MySQL is loaded properly.  If not
	 * the application will shut down.
	 */
	private void checkDriver()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception current)
		{
			System.err.println("Check that the driver is loaded in the project build path");
			System.exit(1);
		}
	}
	
	public void setupConnection()
	{
		try
		{
			databaseConnection = DriverManager.getConnection(connectionString);
		}
		catch(SQLException currentSQLError)
		{
			displaySQLErrors(currentSQLError);
		}
	}
	
	public void displaySQLErrors(SQLException currentException)
	{
		JOptionPane.showMessageDialog(null, "The SQL error is: " + currentException.getMessage());
		JOptionPane.showMessageDialog(null, "The MySQL server state is: " + currentException.getSQLState());
		JOptionPane.showMessageDialog(null, "The MySQL error code is: " + currentException.getErrorCode());
		
	}
	
}
