package assignment;

import java.sql.*;
import java.util.*;



public class Requirement1 {

	private Connection connect;
	private Statement statement;

	public Requirement1() {
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

	public ArrayList<Products> Products() {
		ArrayList<Products> Products = new ArrayList<Products>();
		try {
			// This is our prepared query, that selects everything from book
			// table
			String query = "SELECT * FROM Products";

			// Executes the query and stores the results.
			ResultSet results = this.statement.executeQuery(query);

			while (results.next()) {

				/*
				 * Assign results from query to their own variable. We can
				 * reference columns by their name of index value e.g. 0
				 */
				String productCode = results.getString("productCode");
				String productName = results.getString("productName");
				String productScale = results.getString("productScale");
				String productVendor = results.getString("productVendor");
				String productDescription = results.getString("productDescription");
				int quantityInStock = results.getInt("quantityInStock");
				double buyPrice = results.getDouble("buyPrice");
				double MSRP = results.getDouble("MSRP");
				String productLine = results.getString("productLine");
				
				Products.add(new Products(productCode, productName, productScale, productVendor , productDescription , quantityInStock , buyPrice , MSRP , productLine));
			}

		} catch (SQLException e) {
			System.out
					.println("SQLException happened while retrieving records- abort programmme");
			throw new RuntimeException(e);
		}
		return Products;
	}

	public String Cars (ArrayList<Products>Products){
		int count = 0;
		for (int count = 0;count < productLines ; count++){
	         if (count.contains("Cars")){
	               System.out.println(count);
	         }
		}
	 
	}
	

}