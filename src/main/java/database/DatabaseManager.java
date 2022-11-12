package database;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseManager {
    private Connection connection;
    private String url;
    private String dbName;
    private String userName;
    private String password;
    private String driver;

    public Connection getConnection() { return connection; }
    private void setConnection(Connection connection) {
        this.connection = connection;
    }
    public DatabaseManager(){
        url = "jdbc:mysql://localhost:3306/";
        dbName = "restaurantandbar_info";
        driver = "com.mysql.jdbc.Driver";
        userName = "root";
        password = "";
    }
    public void openConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
        Class.forName(driver).newInstance();
        this.setConnection(DriverManager.getConnection(url + dbName +"?zeroDateTimeBehavior=round", userName,
                password));
    }

    public void closeConnection() throws SQLException {
        getConnection().close();
    }
}
