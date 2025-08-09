package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class DBUtil {
	
	// This class is intended to contain common methods for database operations
	static Properties prop = PropUtil.readData("Config.properties");
	
	//Common method to connect to the database and get the raw data
	public static ResultSet getData(String query) throws SQLException {
		ResultSet resultSet = null;		
		Connection connection = DriverManager.getConnection(prop.getProperty("DB_URL") , prop.getProperty("DB_USER"), prop.getProperty("DB_PASS"));
		resultSet =connection.createStatement().executeQuery(query);
		return resultSet;		
	}
	
	
	//Common method to convert ResultSet to collection data structure
	public static List<Map<String, String>> readData(String query) throws SQLException {
		List<Map<String, String>> data = new ArrayList<Map<String, String>>();
		
		//Get the raw data from the database
		ResultSet resultSet = getData(query);
		
		//Convert ResultSet to List of Maps
		while(resultSet.next()) { //verify if there is a next row
			
			//Create a map to hold the data for each row
			Map<String, String> row = new HashMap<String, String>();
			
			//Loop through each column in the row
			for(int c = 1; c <= resultSet.getMetaData().getColumnCount(); c++) { //loop through each column
				String columnName = resultSet.getMetaData().getColumnName(c); //get the column name
				String columnValue = resultSet.getString(c); //get the column value
				row.put(columnName, columnValue); //put the column name and value in the map
			}
			data.add(row); //add the row to the list

		}		
		
		return data;
	}
	

}
