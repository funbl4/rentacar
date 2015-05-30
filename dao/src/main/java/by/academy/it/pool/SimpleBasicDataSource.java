package by.academy.it.pool;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class SimpleBasicDataSource {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/rentacar";
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "admin";

    private static SimpleBasicDataSource instance;
    private BasicDataSource bds;

    private SimpleBasicDataSource() {
        bds = new BasicDataSource();
        bds.setDriverClassName(JDBC_DRIVER);
        bds.setUrl(DB_URL);
        bds.setUsername(DB_USERNAME);
        bds.setPassword(DB_PASSWORD);
    }

    public synchronized static SimpleBasicDataSource getInstance() {
        if (instance == null) {
            instance = new SimpleBasicDataSource();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return bds.getConnection();
    }
}
