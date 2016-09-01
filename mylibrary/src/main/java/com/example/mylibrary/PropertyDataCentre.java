package com.example.mylibrary;

import java.util.List;

import com.example.mylibrary.model.Property;
import com.example.mylibrary.repository.PropertyRemoteRepo;

/**
 * Created by ericliu on 1/09/16.
 */
public class PropertyDataCentre {
    public static List<Property> getPropertyData(){
        try {
            List<Property> query = new PropertyRemoteRepo().query(null);
            return query;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
