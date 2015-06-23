package by.academy.it.dao.impl;

import by.academy.it.dao.IUserDAO;
import by.academy.it.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends BaseDao<User> implements IUserDAO {
}
/*

    private static final String SQL_QUERY_ADD_USER = "INSERT INTO users (email, password, user_role, first_name, last_name, passport, phone_number) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_QUERY_GET_ALL_USERS = "SELECT * FROM users";
    private static final String SQL_QUERY_GET_USER_BY_ID = "SELECT * FROM users WHERE id_user = ?";
    private static final String SQL_QUERY_GET_USER_BY_EMAIL = "SELECT * FROM users WHERE email = ?";
*/

   /* private SimpleBasicDataSource dataSource;
    private Logger logger = Logger.getLogger(UserDAOImpl.class);

    public UserDAOImpl() {
        dataSource = SimpleBasicDataSource.getInstance();
    }

    public void addUser(User user) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(SQL_QUERY_ADD_USER);
            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getRole());
            preparedStatement.setString(4, user.getFirstName());
            preparedStatement.setString(5, user.getLastName());
            preparedStatement.setString(6, user.getPassport());
            preparedStatement.setString(7, user.getPhoneNumber());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            UtilsDB.closeDBConnection(connection, preparedStatement);
        }
    }

    public User getUserByID(Integer idUser) {
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        User user = null;
        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(SQL_QUERY_GET_USER_BY_ID);
            preparedStatement.setInt(1, idUser);
            resultSet = preparedStatement.executeQuery();
            user = initUser(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            UtilsDB.closeDBConnection(connection, preparedStatement, resultSet);
        }
        return user;
    }

    public User getUserByEmail(String email) {
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        User user = null;
        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(SQL_QUERY_GET_USER_BY_EMAIL);
            preparedStatement.setString(1, email);
            resultSet = preparedStatement.executeQuery();
            user = initUser(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            UtilsDB.closeDBConnection(connection, preparedStatement, resultSet);
        }
        return user;
    }

    public boolean loginUser(String login, String password) {
        logger.info("->JDBCClientDAOImpl.boolean loginUser(login = " + login + ", password = " + password + ")");
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        User user = new User();
        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(SQL_QUERY_GET_USER_BY_EMAIL);
            preparedStatement.setString(1, login);
            resultSet = preparedStatement.executeQuery();
            logger.info("--JDBCClientDAOImpl.loginUser executeQuery()");

            if (resultSet.next()) {
                logger.info("<-JDBCClientDAOImpl.boolean loginUser(login = " + login + ", password = " + password + ") = " + resultSet.getString(3).equals(password));
                return (resultSet.getString(3).equals(password));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            logger.error("--JDBCClientDAOImpl.create.Exception = " + e.getErrorCode());
        } finally {
            UtilsDB.closeDBConnection(connection, preparedStatement,resultSet);
        }
        logger.info("<-JDBCClientDAOImpl.boolean loginUser(login = " + login + ", password = " + password + ") = false");
        return false;
    }

    public boolean logoutUser() {
        return false;
    }

    private User initUser(ResultSet resultSet) throws SQLException{
        User user = new User();
        while (resultSet.next()) {
            user.setIdUser(resultSet.getInt(1));
            user.setEmail(resultSet.getString(2));
            user.setPassword(resultSet.getString(3));
            user.setRole(resultSet.getString(4));
            user.setFirstName(resultSet.getString(5));
            user.setLastName(resultSet.getString(6));
            user.setPassport(resultSet.getString(7));
            user.setPhoneNumber(resultSet.getString(8));
        }
        return user;
    }

    public List<User> getUsers() {
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        List<User> userList = null;
        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(SQL_QUERY_GET_ALL_USERS);
            resultSet = preparedStatement.executeQuery();
            userList = initUsers(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            UtilsDB.closeDBConnection(connection, preparedStatement, resultSet);
        }
        return userList;
    }*/


