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
    public void openConnection() {
        try {
            this.setConnection(DriverManager.getConnection(url + dbName +"?zeroDateTimeBehavior=round", userName,
                    password));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



    public void closeConnection() {

            try {
                getConnection().close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

}
    public void insertRow(String provider, String zipCode, String establishmentName, String basePackage, ArrayList<String> queryList, DatabaseManager db) throws SQLException {
        String add_ons = "";
        for(int i = 0; i < queryList.size(); i++){
            add_ons += queryList.get(i);
            add_ons += ",";
        }
        String query = "INSERT INTO `packagerecords` (`basePackage`,`zipCode`,`provider`,`addOns`,`establishmentName`) VALUES ('"+ basePackage +"','"+ zipCode +"', '"+ provider +"', '"+ add_ons +"', '"+ establishmentName +"')";
        Connection c = db.getConnection();
        Statement s = c.createStatement();
        s.executeUpdate(query);
}
}
