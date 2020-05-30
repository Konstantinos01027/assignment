package assignment;

import java.sql.*;

public class Requirement3 {
	private Connection connect;
	private Statement statement;

	public Requirement3() {
		super();

		this.connect = null;
		this.statement = null;
		this.openConnection();

	}

	
	public void openConnection() {
		// Note we assume a single threaded application which will only not
		// need multiple connections
		// for performance reasons we create one connection and one
		// statement and re-use them
		// YOU NEED TO REPLACE JUST myTestFilestore WITH THE PATH TO YOUR myDBfilestore
		try {
			// recreate the connection if needed
			if (this.connect == null || this.connect.isClosed()) {
				// change the DB Path
				//
				this.connect = DriverManager
						.getConnection(
								"jdbc:hsqldb:file:db_data/myTestFilestore;ifexists=true;shutdown=true",
								"SA", "");
			}
			//recreate the statement if needed
			if (this.statement == null || this.statement.isClosed()) {
				this.statement = this.connect.createStatement();
			}

		} catch (SQLException e) {
			System.out
					.println("ERRRO - Failed to create a connection to the database");
			throw new RuntimeException(e);
		}
	}

	
	public void closeConnection() {

		try {

			if (this.statement != null) {
				this.statement.close();
			}
			if (this.connect != null) {
				this.connect.close();
			}
			System.out.println("Closed the connection to the database");
		} catch (Exception e) {
			System.out
					.print("ERROR-Failed to close the connection to the database");
			throw new RuntimeException(e);
		}
	}


}
