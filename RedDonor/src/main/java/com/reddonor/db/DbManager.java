package com.reddonor.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbManager 
{
	// Replace it wid hibernate or ibatis
	private static Connection connection;
	private DbManager()
	{
	}
    public static synchronized Connection getConnection() throws SQLException
    {
    	if(connection == null || connection.isClosed())
    	{
    		try 
    		{
				//String url = "jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6111909";
    			//String url = "jdbc:mysql://127.4.175.2:3306/reddonordb";
    			String url = "jdbc:mysql://$OPENSHIFT_MYSQL_DB_HOST:$OPENSHIFT_MYSQL_DB_PORT/bloodindia";
				
				//mysql://adminA1QamE9:RmkJI5gU3j9g@127.4.175.2:3306
				
				Class.forName("com.mysql.jdbc.Driver");
				//String string = "sql6111909";
				String uname = "adminphw77zK";
				//String pwd = "HuLVhXzVTe";
				String pwd = "u4NF32pMuvqp";
				connection = DriverManager.getConnection(url, uname,pwd);
			} 
    		catch (Exception e) 
    		{ 
				e.printStackTrace();
			}
    	}
        return connection;
    }
}