package com.example.yoanncorreia.localisationvelov;

/**
 * Created by yoanncorreia on 16/02/2015.
 */

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JSONParser {

   Objects objects;

private static JSONObject jObj;
private static List<Field> fieldList = new ArrayList<>();


    // constructor
    public JSONParser() {

    }

    public static void getJSONFromUrl(String json) {


        try {
            JSONObject object = new JSONObject(json);

            //Log.d("My App", object.toString());

            JSONArray jsonArray = object.getJSONArray("values");

            for(int i = 0; i < jsonArray.length(); i++){
                JSONArray jsonArray1 = jsonArray.getJSONArray(i);
                    Field f = new Field();
                    f.setNumber(jsonArray1.getInt(0));
                    f.setName(jsonArray1.getString(1));
                    f.setAddress(jsonArray1.getString(2));
                    f.setAddress2(jsonArray1.getString(3));
                    f.setCommune(jsonArray1.getString(4));
                    f.setNmarrond(jsonArray1.getInt(5));
                    f.setBonus(jsonArray1.getString(6));
                    f.setPole(jsonArray1.getString(7));
                    f.setLat(jsonArray1.getLong(8));
                    f.setLng(jsonArray1.getLong(9));
                    f.setBike_stands(jsonArray1.getInt(10));
                    f.setStatus(jsonArray1.getString(11));
                    f.setAvailable_bike_stands(jsonArray1.getInt(12));
                    f.setAvailable_bikes(jsonArray1.getInt(13));
                    f.setAvailabilitycode(jsonArray1.getInt(14));
                    f.setAvailability(jsonArray1.getString(15));
                    f.setBanking(jsonArray1.getBoolean(16));
                    f.setGid(jsonArray1.getInt(17));
                    //f.setLast_update((java.util.Date) jsonArray1.get(18));
                    //f.setLast_update_fme((java.util.Date) jsonArray1.get(19));

                   fieldList.add(f);

            }
        } catch (Throwable t) {
            Log.e("", "Could not parse malformed JSON : "+t);
        }

    }

    public static List<Field> getFieldList() {
        return fieldList;
    }

    public static void setFieldList(List<Field> fieldList) {
        JSONParser.fieldList = fieldList;
    }
}