package com.example.SportyApplication;

import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Utility {
    public String getDateFormatForGracenoteAPICall(){
        String date = "";
        String fDate = ""; // formatted date
        date = String.valueOf(LocalDateTime.now());
        fDate += date.charAt(0); // y
        fDate += date.charAt(1); // y
        fDate += date.charAt(2); // y
        fDate += date.charAt(3); // y
        fDate += date.charAt(4); // first dash
        fDate += date.charAt(5); // m
        fDate += date.charAt(6); // m
        fDate += date.charAt(7); // second dash
        fDate += date.charAt(8); // d
        fDate += date.charAt(9); // d
        return fDate;
    }
    /*
    * Function is to return a list of all the add-ons and the base package that the bar/restaurant has.
    * The list is obtained from parsing a queryString.
    * */
    public ArrayList<String> queryStringParser(String queryString){
       ArrayList<String> packageBuilder = new ArrayList<String>();
       String params = "";
       for(int i = 0; i < queryString.length(); i++){
           if(queryString.charAt(i)=='=' || queryString.charAt(i)=='o' && queryString.charAt(i+1)=='n' || queryString.charAt(i)=='n' && queryString.charAt(i-1)=='o'){

           }
           else if(queryString.charAt(i)=='&'){
               packageBuilder.add(params);
               params = "";
           }
           else if(i == queryString.length()-4){
               params += queryString.charAt(i);
               packageBuilder.add(params);
           }
           else{
               params += queryString.charAt(i);
           }
       }
       return packageBuilder;
    }
    public ArrayList<String> formatParamsGameServlet(ArrayList<String> params){
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
                if(params.get(i).charAt(j) == '+') {
                    param += ' ';
                }
                else if(params.get(i).charAt(j) == '%'){
                    param += ", ";
                    j--;
                    j--;
                    j--;
                }
                else{
                    param += params.get(i).charAt(j);
                }
            }
            newParams.add(param);
        }
        return newParams;
    }
    public ArrayList<String> getParams(String url){
        ArrayList<String> params = new ArrayList<String>();
        String param = "";
        int i = 0;
        while(url.charAt(i) != '='){
            i++;
        }
        i++;
        while(url.charAt(i) != '&'){
            if(url.charAt(i) == '+'){
                param += " ";
            }
            else{
                param += url.charAt(i);
            }
            i++;
        }
        params.add(param);
        while(url.charAt(i) != '='){
            i++;
        }
        i++;
        param = "";
        while(i <= url.length()-1){
            param += url.charAt(i);
            i++;
        }
        params.add(param);
        return params;
    }
}
