package social.friend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;

public class LoginDaoImpl
{
	DbConnection db=new DbConnection();
	ResultSet resultSet;
	ResultSet checkLogin(String userName,String password)
	{
	Connection connection=db.getConnection();	
	try {
		PreparedStatement prepStatement=connection.prepareStatement("select * from user where username=? and password=?");
	prepStatement.setString(1,userName);
	prepStatement.setString(2,password);
	
	
	
	 resultSet=prepStatement.executeQuery();
	
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return resultSet;
	}
}
