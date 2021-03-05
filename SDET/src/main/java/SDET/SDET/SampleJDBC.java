package SDET.SDET;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SampleJDBC {

	public static void main(String[] args) throws SQLException {
Connection conn=null;
//step1 register the database
Driver driverRef = new Driver();
DriverManager.registerDriver(driverRef);
//step2 get connection for the db
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Halesh","root","root");
//step3 create statement
Statement Stat = conn.createStatement();
//step4 execute the query
 ResultSet result = Stat.executeQuery("select * from proj1");
while(result.next())
{
	System.out.println(result.getString(1)+"\t" +result.getString(2)+"\t"+result.getString(3));
	}
//step5 close the connection
conn.close();


	}

}
