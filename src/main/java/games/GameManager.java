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
    Map<String,String> doTheyHaveTheGame(String zip, Map<String, Integer> foundListings) throws SQLException {
        boolean flag = false;
        Map<String,String> listOfEstablishmentNamesThatHaveTheGame = new LinkedHashMap<String,String>();
        DatabaseManager db = new DatabaseManager();
        db.openConnection();
        Map<Integer,ArrayList<String>> records = new LinkedHashMap<Integer,ArrayList<String>>();
        records = db.getRestaurantInfoWithMatchingZip(zip, db);
        ArrayList<Integer> listOfChannels = new ArrayList<Integer>();
        ArrayList<String> listOfCallsigns = new ArrayList<String>();
        Set<String> keys1 = foundListings.keySet();
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
