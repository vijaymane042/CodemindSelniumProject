

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginDao
 */
@WebServlet("/LoginDao")
public class LoginDao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginDao() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @return 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected boolean doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		 boolean status=false;
         try
         {  
              Class.forName("oracle.jdbc.driver.OracleDriver");  
              Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","local","test");  
     
              PreparedStatement ps=con.prepareStatement(  
              "select * from userreg where name=? and pass=?");  
              ps.setString(1,name);  
              ps.setString(2,pass);  
              ResultSet rs=ps.executeQuery();  
              status=rs.next();  
         }
         catch(Exception e)
         {
              System.out.println(e);
         }  
         return status;  
	}
	

}
