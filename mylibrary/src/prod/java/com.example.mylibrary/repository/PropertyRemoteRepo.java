package com.example.mylibrary.repository;

import java.util.List;

import com.example.mylibrary.model.Property;
import com.example.mylibrary.repository.base.Repository;
import com.example.mylibrary.repository.base.Specification;


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

        return null;
    }
}
