package com.example.mylibrary.parsing;

import java.util.List;

import com.example.mylibrary.model.Property;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ericliu on 11/08/2016.
 */

public class ListingResults {

    @SerializedName("Listings")
    public List<Property> listings;
}
