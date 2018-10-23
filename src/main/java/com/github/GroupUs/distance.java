package com.github.GroupUs;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.DistanceMatrixApi;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.*;

/*
 *  The Google Maps Geolocation API returns a location and accuracy radius based on information
 *  about cell towers and WiFi nodes that the mobile client can detect.
 *
 * <p>Please see the<a href="https://developers.google.com/maps/documentation/geolocation/intro#top_of_page">
 *   Geolocation API</a> for more detail.
 *
 *
 */
public class distance {
    public static void main(String[] args) {
        geoCoding();
        distanceMatirx();
    }
    public static String geoCoding() {
        GeoApiContext context = new GeoApiContext.Builder()
                .apiKey("AIzaSyBB2Mz7wexVz5mlpom9NqQc--6bf5tPbfo")
                .build();
        String res = "";
        try {
            GeocodingResult[] results = GeocodingApi.geocode(context,
                    "Columbia University").await();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            System.out.println(gson.toJson(results[0].addressComponents));
            res = gson.toJson(results[0].addressComponents);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    public static String distanceMatirx() {
        GeoApiContext context = new GeoApiContext.Builder()
                .apiKey("AIzaSyBB2Mz7wexVz5mlpom9NqQc--6bf5tPbfo")
                .build();
        String res = "";
        try {
            String[] origins = new String[] {"Columbia University NY"};
            String[] destinations = new String[] {"Flushing NY"};
            DistanceMatrix result = DistanceMatrixApi.newRequest(context)
                    .origins(origins)
                    .destinations(destinations)
                    .mode(TravelMode.TRANSIT)
                    .language("fr-FR")
                    .await();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            System.out.println(gson.toJson(result));
            res = gson.toJson(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}