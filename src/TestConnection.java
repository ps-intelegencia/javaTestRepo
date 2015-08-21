
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class TestConnection {

	public static void main(String[] args) {
		Connection conn = null;
		try{
			System.out.println("con...1");
		    Class.forName("oracle.jdbc.driver.OracleDriver");  
   	  
     	//step2 create  the connection object  
     	conn=DriverManager.getConnection("jdbc:oracle:thin:@ecom.intelegencia.com:1521:orcl","ecom1","ecom1");  
		System.out.println("con..."+conn);
		PreparedStatement ps=conn.prepareStatement("SELECT * FROM WSO2");
        ResultSet rs = ps.executeQuery();
        //dsahjfgsadhkjfgdfslk  alok kumar321
    	while(rs.next()){
    	 System.out.println("rs......."+rs.getString("name"));
    	} 
		}
		catch(Exception ex)
		{}

	}

}
