package com.example.simpleparadox.listycity;

public class City implements Comparable<City>{
    private String city;
    private String province;
    private int number;

    City(String city, String province, int number){
        this.city = city;
        this.province = province;
        this.number = number;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    int getCityNumber(){ return this.number; }

    @Override
    public int compareTo(City o) {
        return city.compareTo(o.getCityName());
    }
}
