package com.example.rainbowweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by yan on 2017/9/3.
 */

public class City extends DataSupport {
    private  int id;
    private String cityName;
    private int cityCode;
    private  int provinceId;

    private int getId(){
        return id;
    }
    private  void setId(int id){
        this.id=id;
    }
    private String getCityName(){
        return cityName;
    }
    private  void setCityName(String cityName){
        this.cityName =cityName;
    }
    private int getCityCode(){
        return cityCode;
    }
    private  void setCityCode(int cityCode){
        this.cityCode=cityCode;
    }
    private int getProvinceId(){
        return provinceId;
    }
    private  void setProvinceId(int provinceId){
        this.provinceId=provinceId;
    }
}
