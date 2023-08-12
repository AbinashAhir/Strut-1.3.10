package struts.example.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	public static Connection getconnection() throws SQLException, ClassNotFoundException {
		Connection con = null;
		Class.forName("org.postgresql.Driver");
		con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/struts", "postgres", "Hira@3790");
		return con;
	}
}
