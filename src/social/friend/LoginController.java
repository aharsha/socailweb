package social.friend;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet {
       
    public LoginController() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userName=request.getParameter("username");
		String password=request.getParameter("password");
LoginDaoImpl loginDaoImpl=new LoginDaoImpl();
FriendDaoIpml friendDaoIpml=new FriendDaoIpml();
ResultSet friendsList=friendDaoIpml.getFriends();
ResultSet  resultSet=loginDaoImpl.checkLogin(userName, password);
RequestDispatcher dispatcher1=request.getRequestDispatcher("Login.jsp");
RequestDispatcher dispatcher2=request.getRequestDispatcher("Friend.jsp");

if(resultSet==null)
{
	dispatcher1.forward(request, response);
}
else
{
	request.setAttribute("friendsList",friendsList);
	dispatcher2.forward(request, response);
	}
}

	}


