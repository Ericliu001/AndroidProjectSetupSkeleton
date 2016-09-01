package com.example.mylibrary.repository;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import com.example.mylibrary.model.Property;
import com.example.mylibrary.parsing.SearchResult;
import com.example.mylibrary.repository.base.Repository;
import com.example.mylibrary.repository.base.Specification;
import com.google.gson.Gson;


/**
 * Created by ericliu on 10/08/2016.
 */

public class PropertyRemoteRepo implements Repository<Property> {
    @Override
    public Property get(Specification specification) throws Exception {

        return null;
    }

    @Override
    public void add(Property item) throws Exception {

    }

    @Override
    public void add(Iterable<Property> items) throws Exception {

    }

    @Override
    public void update(Property item) throws Exception {

    }

    @Override
    public void remove(Property item) throws Exception {

    }

    @Override
    public void remove(Specification specification) throws Exception {

    }

    @Override
    public List<Property> query(Specification specification) throws Exception {




//        String jsonStr = JSONHandler.parseResource(mApplication, R.raw.property_search);

        String file = "res/raw/property_search.json"; // res/raw/test.txt also work.
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(file);

        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = r.readLine()) != null) {
            stringBuilder.append(line).append('\n');
        }

        String jsonStr = stringBuilder.toString();

        Gson gson = new Gson();

        SearchResult searchResult = gson.fromJson(jsonStr, SearchResult.class);
        if (searchResult == null || searchResult.listingResults == null || searchResult.listingResults.listings == null) {
            return null;
        }

        return searchResult.listingResults.listings;
    }
}
