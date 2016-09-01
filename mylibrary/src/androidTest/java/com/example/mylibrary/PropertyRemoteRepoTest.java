package com.example.mylibrary;

import java.util.List;

import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import com.example.mylibrary.model.Property;
import com.example.mylibrary.repository.PropertyRemoteRepo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by ericliu on 1/09/16.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class PropertyRemoteRepoTest {

    private PropertyRemoteRepo mPropertyRemoteRepo;


    @Before
    public void setUp() throws Exception {
        mPropertyRemoteRepo = new PropertyRemoteRepo();
    }

    @After
    public void tearDown() throws Exception {
        mPropertyRemoteRepo = null;
    }

    @Test
    public void testGet() throws Exception {

    }

    @Test
    public void testAdd() throws Exception {

    }

    @Test
    public void testAdd1() throws Exception {

    }

    @Test
    public void testUpdate() throws Exception {

    }

    @Test
    public void testRemove() throws Exception {

    }

    @Test
    public void testRemove1() throws Exception {

    }

    @Test
    public void testQuery() throws Exception {
        List<Property> query = mPropertyRemoteRepo.query(null);

        assertNotNull(query);
    }
}