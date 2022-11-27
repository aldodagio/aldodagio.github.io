package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import channels.Provider;

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
    public void insertRow(String provider, String zipCode, String establishmentName, String basePackage, String address, ArrayList<String> queryList, DatabaseManager db) throws SQLException {
        String add_ons = "";
        for(int i = 0; i < queryList.size(); i++){
            add_ons += queryList.get(i);
            add_ons += ",";
        }
        String query = "INSERT INTO `packagerecords` (`zipCode`,`provider`, `basePlan`, `addOns`,`establishmentName`, `address`) VALUES ('"+ zipCode +"','"+ provider +"', '"+ basePackage +"', '"+ add_ons +"', '"+ establishmentName + "', '"+ address + "')";
        Connection c = db.getConnection();
        Statement s = c.createStatement();
        s.executeUpdate(query);
}
    public Map<Integer, ArrayList<String>> getRestaurantInfoWithMatchingZip(String zip, DatabaseManager db) throws SQLException {
        Map<Integer,ArrayList<String>> records = new LinkedHashMap<Integer,ArrayList<String>>();
        String query = "SELECT * FROM `packagerecords` WHERE zipcode = '" + zip + "';";
        Connection c = db.getConnection();
        Statement s = c.createStatement();
        ResultSet result = s.executeQuery(query);
        while(result.next()){
            int id = result.getInt("id");
            int zipCode = result.getInt("zipCode");
            String provider = result.getString("provider");
            String basePlan = result.getString("basePlan");
            String addOns = result.getString("addOns");
            String estName = result.getString("establishmentName");
            String address = result.getString("address");
            ArrayList<String> fields = new ArrayList<String>();
            fields.add(Integer.toString(zipCode));
            fields.add(provider);
            fields.add(basePlan);
            fields.add(addOns);
            fields.add(estName);
            Provider p = new Provider(provider, basePlan, addOns);
            String channels = p.getChannels();
            fields.add(channels);
            fields.add(address);
            records.put(id, fields);
        }
        return records;
    }
}
