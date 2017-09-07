package com.example.rainbowweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by yan on 2017/9/3.
 */

public class County extends DataSupport{
    private int id;
    private String countyName;
    private  String weatherId;
    private  int cityId;

    private int getId(){
        return id;
    }
    private  void setId(int id){
        this.id=id;
    }
    private String getCountyName(){
        return countyName;
    }
    private  void setCountyName(String countyName){
        this.countyName=countyName;
    }
    private String getWeatherId(){
        return weatherId;
    }
    private  void setWeatherId(String weatherId){
        this.weatherId=weatherId;
    }
    private int getCityId(){
        return cityId;
    }
    private  void setcityId(int cityId){
        this.cityId=cityId;
    }
}
