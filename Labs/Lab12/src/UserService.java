import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserService {

	private Database database;

	public UserService() {
		try {
			database = Database.getInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<User> findAll() {
		ResultSet resultSet = database.executeStatement("select * from users;");

		final List<User> users = new ArrayList<>();

		if (resultSet != null) {
			try {
				while (resultSet.next()) {
					final String username = resultSet.getString("username");
					final String password = resultSet.getString("password");
					final User user = new User();
					user.setUsername(username);
					user.setPassword(password);
					users.add(user);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return users;
	}

	public void save(final User user) {
		final Connection connection = database.getConnection();

		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement("insert into mydatabase.users (username, password) values (?, ?)");
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
