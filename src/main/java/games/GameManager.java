package games;

import java.util.LinkedHashMap;
import java.util.Map;

public class GameManager {

    private Map<String, Integer> map = new LinkedHashMap<>(); // Will store all found CallSigns and Channels from each search

    public GameManager(Map<String, Integer> map){
        this.map = map;
    };
    public GameManager(String query){
        fillMapViaStringParams(query);
    }

    public void fillMapViaStringParams(String query){
        // param value is 'str'
        // callsign is String value and channel is integer value in map
        int i = 0;
        int count = 0;
        String callsign = "";
        String channel = "";
        while(i < query.length()) {
            if ((query.charAt(i) != '-') && (query.charAt(i) != '%')) { // || ((i > 0) && (query.charAt(i) != '3') && (query.charAt(i - 1) != '%')) || ((i > 0) && (query.charAt(i) != 'E') && (query.charAt(i - 1) != '3'))) {
                Character c = query.charAt(i);
                if (i > 0) {
                    Character d = query.charAt(i - 1);
                    if (Character.isDigit(c) && !Character.isDigit(d) || !Character.isDigit(c)) {
                        callsign += query.charAt(i);
                        i++;
                    } else if (!Character.isDigit(c) && Character.isDigit(d) || i == query.length() - 1) {
                        if (channel.length() > 0) {
                            int ch = Integer.parseInt(channel);
                            map.put(callsign, ch);
                            channel = "";
                            callsign = "";
                        }
                        callsign += query.charAt(i);
                        i++;
                    } else {
                        channel += query.charAt(i);
                        i++;
                    }
                }
                else{
                    callsign += query.charAt(i);
                    i++;
                }
            }
        }
    }
}
