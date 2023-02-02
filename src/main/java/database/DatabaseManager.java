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
    /*
     * Parameters: None.
     * Gets the connection to the database.
     * Returns: Connection object.
     * */
    public Connection getConnection() { return connection; }
    /*
     * Parameters: Connection object.
     * Sets the connection to the database.
     * Returns: None.
     * */
    private void setConnection(Connection connection) {
        this.connection = connection;
    }
    /*
     * Constructor that defines the database to Aldo's local database.
     * */
    public DatabaseManager(){
        //url = "jdbc:mysql://localhost:3306/";
        url = "jdbc:mysql://mysql3000.mochahost.com:3306/";
        dbName = "restaurantandbar_info";
        driver = "com.mysql.jdbc.Driver";
        userName = "root";
        password = "";
    }
    /*
     * Parameters: None.
     * Opens the connection to the database.
     * Returns: None.
     * */
    public void openConnection() {
        try {
            this.setConnection(DriverManager.getConnection(url + dbName +"?zeroDateTimeBehavior=round", userName,
                    password));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    /*
     * Parameters: None.
     * Closes the connection to the database.
     * Returns: None.
     * */
    public void closeConnection() {

            try {
                getConnection().close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

}
    /*
     * Parameters: Takes all column names for a valid entry into package records table.
     * This method inserts a new row into the database.
     * Returns: None.
     * */
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
    /*
    * Parameters: Takes fan's zip as a string and a DatabaseManager object
    * This method finds all restaurants in the database that have the same zip as entered
    * by the fan.
    * Returns: Map of channel as an integer -> channel as string
    * */
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
