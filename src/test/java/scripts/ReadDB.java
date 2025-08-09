package scripts;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import utilities.DBUtil;

public class ReadDB {

	public static void main(String[] args) throws SQLException {
		
		List<Map<String, String>> data = DBUtil.readData(Queries.GET_TOP_10_HORROR_MOVIES);
		
		System.out.println(data);

	}

}
