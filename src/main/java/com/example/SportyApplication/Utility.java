package com.example.SportyApplication;

import java.util.ArrayList;

public class Utility {
    /*
    * Function is to return a list of all the add-ons and the base package that the bar/restaurant has.
    * The list is obtained from parsing a queryString.
    * */
    public ArrayList<String> queryStringParser(String queryString){
       ArrayList<String> packageBuilder = new ArrayList<String>();
       String params = "";
       for(int i = 0; i < queryString.length()-1; i++){
           if(queryString.charAt(i)=='=' || queryString.charAt(i)=='o' && queryString.charAt(i+1)=='n' || queryString.charAt(i)=='n' && queryString.charAt(i-1)=='o'){

           }
           else if(queryString.charAt(i)=='&'){
               packageBuilder.add(params);
               params = "";
           }
           else{
               params += queryString.charAt(i);
           }
       }
       return packageBuilder;
    }
    public ArrayList<String> stripURL(String refererString){
        ArrayList<String> parameters = new ArrayList<String>();
        String param = "";
        int i = refererString.length()-1;
        for(int j = 0; j < 3; j++) {
            while (refererString.charAt(i) != '=') {
                param += refererString.charAt(i);
                i--;
            }
            parameters.add(param);
            while(refererString.charAt(i) != '&')
            {
                if(refererString.charAt(i) == '?'){
                    return parameters;
                }
                i--;
            }
            param = "";
            i--;
        }
        return parameters;
    }
    public ArrayList<String> formatParams(ArrayList<String> params){
        ArrayList<String> newParams = new ArrayList<String>();
        for(int i = 0; i < params.size(); i++){
            String param = "";
            for(int j = params.get(i).length()-1; j >= 0; j--){
                if(params.get(i).charAt(j) != '+') {
                    param += params.get(i).charAt(j);
                }
                else{
                    param += ' ';
                }
            }
            newParams.add(param);
        }
        return newParams;
    }
}
