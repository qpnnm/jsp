package sss;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import common.Connector;

public class Test {
public static void main(String[] args) throws SQLException {
	Connection con = Connector.getConnection();
	Statement stmt = con.createStatement() ;
	ResultSet rs = stmt.executeQuery("select * from board");
}
	
	
	
	
}
