package COM.BRIDGELABZ;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateNewContactToDB {

        public static Connection connection;
        public static void main(String[] args) throws SQLException {
            String jdbcUrl = "jdbc:mysql://localhost:3306/addressbookservice";
            String userName = "root";
            String password = "sri@1234";
            String query = "update addressbookforfriends set phone='9963464457' where firstname='Polumati' ";


            connection = DriverManager.getConnection(jdbcUrl, userName, password);
            PreparedStatement statement = connection.prepareStatement(query);
            int count = statement.executeUpdate();
            System.out.println(count + " row affected");
            statement.close();
            connection.close();
        }
}
