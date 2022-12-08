package games;

import database.DatabaseManager;

import java.sql.SQLException;
import java.util.*;

public class GameManager {

    private Map<String, Integer> map = new LinkedHashMap<>(); // Will store all found CallSigns and Channels from each search

    public GameManager(Map<String, Integer> map){
        this.map = map;
    };
    public GameManager(String query){
        fillMapViaStringParams(query);
    }
    public Map<String, Integer> getMap() {
        return this.map;
    }
    /*
    * This method takes the values input to the str value that was retrieved
    * using the GET method call to the Gracenote API. The values are taken from
    * the returned URL and parsed in this method. Once the values are parsed, the
    * method fills a Map with the callsign (For example, ESPN) and channel (738).
    * */
    public void fillMapViaStringParams(String query){
        // param value is 'str'
        // callsign is String value and channel is integer value in map
        int i = 0;
        int count = 0;
        String callsign = "";
        String channel = "";
        while(i < query.length()) {
            if ((query.charAt(i) != '-'))  {
                boolean flag = Character.isDigit(query.charAt(i));
                    if (flag) {
                        channel += query.charAt(i);
                        i++;
                    } else if ((flag == false) && (channel.length() > 0)) {
                            int ch = Integer.parseInt(channel);
                            if(callsign.contains("TEAM")){
                                callsign = "NBA League Pass";
                            }
                            map.put(callsign, ch);
                            channel = "";
                            callsign = "";
                        callsign += query.charAt(i);
                        i++;
                    } else {
                        callsign += query.charAt(i);
                        i++;
                    }
            }
            else {
                i++;
                i++;
                i++;
                i++;
            }
        }
    }
    /*
    *
    * */
    Map<String,String> doTheyHaveTheGame(String zip, Map<String, Integer> foundListings) throws SQLException {
        Map<String,String> listOfEstablishmentNamesThatHaveTheGame = new LinkedHashMap<String,String>(); // Declaring the Map that we will later return with found restaurants/bars.
        DatabaseManager db = new DatabaseManager(); // We need to use our database to find restaurants/bars in our system that have the needed callsign available in their cable/streaming package and have matching zip codes.
        db.openConnection();
        Map<Integer,ArrayList<String>> records = new LinkedHashMap<Integer,ArrayList<String>>(); // Declaring a Map that will store our restaurants/bars with matching zip codes.
        records = db.getRestaurantInfoWithMatchingZip(zip, db); // use the database method to fill our map with restaurants/bars with matching zip codes and the relevant information such as cable/streaming packages.
        ArrayList<Integer> listOfChannels = new ArrayList<Integer>(); // declaring an ArrayList for all channels that are playing the desired game
        ArrayList<String> listOfCallsigns = new ArrayList<String>(); // declaring an ArrayList for all callsigns that are playing the desired game
        Set<String> keys1 = foundListings.keySet(); // Get the keys for the listings found in the Gracenote API call
        for(String key : keys1){
            listOfCallsigns.add(key);
            listOfChannels.add(foundListings.get(key));
        }
        ArrayList<Integer> ids = new ArrayList<Integer>();
        ArrayList<String> channels = new ArrayList<String>();
        Set<String> names = new HashSet<String>();
        Set<String> addys = new HashSet<String>();
        Set<Integer> keys = records.keySet();
        for(Integer key : keys){
            ids.add(key);
            channels.add(records.get(key).get(5));
            names.add(records.get(key).get(4));
            if(records.get(key).get(6) != null) {
                addys.add(records.get(key).get(6));
            }
        }
        ArrayList<Boolean> whichRestaurantsOutOfTheAreaHaveTheCorrectChannel = new ArrayList<Boolean>();
        for(int i = 0; i < channels.size(); i++){
            if(channels.get(i).contains(listOfCallsigns.get(0))){
                whichRestaurantsOutOfTheAreaHaveTheCorrectChannel.add(true);
                listOfEstablishmentNamesThatHaveTheGame.put(records.get(i+1).get(4), records.get(i+1).get(6));
            }
            else{
                whichRestaurantsOutOfTheAreaHaveTheCorrectChannel.add(false);
            }
        }
        db.closeConnection();
        return listOfEstablishmentNamesThatHaveTheGame;
    }

}
