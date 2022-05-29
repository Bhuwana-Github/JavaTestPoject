package practiseProgram;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class exam_SQLconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try{Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/air_database","root","MySQL-123");
		//Statement stmt= con.createStatement();
		Statement st= con.createStatement();
		//ResultSet myrs= st.executeQuery("select * from employee");  
		
		String str= " insert int emploee(109, 'James','parker',30000";
		st.execute(str);
		ResultSet myrs= st.executeQuery("select * from employee");  
		
		while(myrs.next())  	
	  	{System.out.println(myrs.getInt(1)+"  "+myrs.getString(2)+"  "+myrs.getString(3)+""+myrs.getInt(4));  }			
	     con.close();  
		}catch(Exception e){ System.out.println(e);}  
		//con.close();
		
	}

}
