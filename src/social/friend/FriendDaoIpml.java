package social.friend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FriendDaoIpml 
{
	DbConnection db=new DbConnection();
	ResultSet resultSet;
	ResultSet getFriends()
	{
	Connection connection=db.getConnection();	
	try {
		PreparedStatement prepStatement=connection.prepareStatement("select * from user");
	
	
	
	 resultSet=prepStatement.executeQuery();
	
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return resultSet;
	}
	
}
