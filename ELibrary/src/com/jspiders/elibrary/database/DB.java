package com.jspiders.elibrary.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

//import java.sql.*;

public class DB {
public static Connection getCon(){
	
	/*Connection con=null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elib","root","root");
		
	}catch(Exception e){System.out.println(e);}
	return con;
}
}*/

	Connection con=null;
	 {
try {
	Driver driveref=new Driver();
	DriverManager.registerDriver(driveref);
	String dburl = "jdbc:mysql://localhost:3306/elib?user=root&password=root";
	con = DriverManager.getConnection(dburl);
} catch (SQLException e) {
	e.printStackTrace();
}
	}
	return con;

}
}