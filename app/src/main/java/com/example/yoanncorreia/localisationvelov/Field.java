package com.example.yoanncorreia.localisationvelov;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by christophe on 16/02/15.
 */
public class Field implements Serializable{


    private int number;
    private String name;
    private String address;
    private String address2;
    private String commune;
    private int nmarrond;
    private String bonus;
    private String pole;
    private long lat;
    private long lng;
    private int bike_stands;
    private String status;
    private int available_bike_stands;
    private int available_bikes;
    private int availabilitycode;
    private String availability;
    private boolean banking;
    private int gid;
    private Date last_update;
    private Date last_update_fme;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public int getNmarrond() {
        return nmarrond;
    }

    public void setNmarrond(int nmarrond) {
        this.nmarrond = nmarrond;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public String getPole() {
        return pole;
    }

    public void setPole(String pole) {
        this.pole = pole;
    }

    public long getLat() {
        return lat;
    }

    public void setLat(long lat) {
        this.lat = lat;
    }

    public long getLng() {
        return lng;
    }

    public void setLng(long lng) {
        this.lng = lng;
    }

    public int getBike_stands() {
        return bike_stands;
    }

    public void setBike_stands(int bike_stands) {
        this.bike_stands = bike_stands;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAvailable_bike_stands() {
        return available_bike_stands;
    }

    public void setAvailable_bike_stands(int available_bike_stands) {
        this.available_bike_stands = available_bike_stands;
    }

    public int getAvailable_bikes() {
        return available_bikes;
    }

    public void setAvailable_bikes(int available_bikes) {
        this.available_bikes = available_bikes;
    }

    public int getAvailabilitycode() {
        return availabilitycode;
    }

    public void setAvailabilitycode(int availabilitycode) {
        this.availabilitycode = availabilitycode;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public boolean isBanking() {
        return banking;
    }

    public void setBanking(boolean banking) {
        this.banking = banking;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    public Date getLast_update_fme() {
        return last_update_fme;
    }

    public void setLast_update_fme(Date last_update_fme) {
        this.last_update_fme = last_update_fme;
    }
}
