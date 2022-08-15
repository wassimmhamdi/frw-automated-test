package com.e2eTests.automatedTests.utilis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetFromDB {
	public static String object;

	public static String main() {
		try {
			// create our mysql database connection
			String myDriver = "";
			String myUrl = "";
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, "", "");

			// our SQL SELECT query.
			// if you only need a few columns, specify them by name instead of using "*"
			String query = "";

			// create the java statement
			Statement st = conn.createStatement();

			// execute the query, and get a java resultset
			ResultSet rs = st.executeQuery(query);

			// iterate through the java resultset
			while (rs.next()) {
				System.out.println("Object " + rs.getObject(1).toString());
				object = rs.getObject(1).toString();
				return object;
			}

			st.close();
		}

		catch (Exception e) {
			System.err.println("Got an exception! Pas de object disponible");
			System.err.println(e.getMessage());
		}

		return object;
	}

}