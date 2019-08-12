package social.friend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {


Connection  con;
	public Connection getConnection()
	{
	try {
		DriverManager.registerDriver(new org.h2.Driver());
	
	System.out.println("registered");
	con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/sss","sss","sss");
	}
catch (SQLException e) {
	e.printStackTrace();
}
	return con;

	}
}
