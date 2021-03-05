package SDET.SDET;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Sampleexecuteupdate {

	public static void main(String[] args) throws SQLException {
		
		Connection conn=null;
		try{
		//step1 register the database
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		//step2 get connection for the db
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Halesh","root","root");
		//step3 create statement
		Statement Stat = conn.createStatement();
		//step4 execute the query
		 int result = Stat.executeUpdate("insert into proj1 values('p04'.'myntra',4)");
		 if(result==1)
		 {
			 System.out.println("query executed");
			 
			}
		 else
		 {
			 System.out.println("query failed");
		 }
	}
	catch(Exception e)
			 
		{
		}
		
		finally
		{
			conn.close();
			System.out.println("connection closed");
		}
	}



	}
