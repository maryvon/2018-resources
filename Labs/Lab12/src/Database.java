import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 1. Install mySql (you could try with xampp - it might be easier)
 * 2. Download MySQL connector for Java (https://dev.mysql.com/downloads/connector/) - Connector/J
 *
 */
public class Database {

	private static Database databaseConnection;

	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	private Database() throws Exception {
		try {
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			connection = DriverManager
					.getConnection("jdbc:mysql://localhost/mydatabase?" + "user=user&password=password");

			// Statements allow to issue SQL queries to the database
			statement = connection.createStatement();

		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}

	public ResultSet executeStatement(final String sqlQuery) {
		try {
			return statement.executeQuery(sqlQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Connection getConnection() {
		return connection;
	}

	private void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}

			if (statement != null) {
				statement.close();
			}

			if (connection != null) {
				connection.close();
			}
		} catch (Exception e) {

		}
	}

	public static Database getInstance() throws Exception {
		if (databaseConnection == null) {
			databaseConnection = new Database();
		}
		return databaseConnection;
	}
}
