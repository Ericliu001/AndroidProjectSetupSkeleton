package com.example.ericliu.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.ericliu.midlayerlib.MidLayer;
import com.example.mylibrary.PropertyDataCentre;
import com.example.mylibrary.model.Property;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMain = (TextView) findViewById(R.id.tvMain);
        tvMain.setText("The Magic Number is: " + new MidLayer().playLib());

    }


    public void onButtonClicked(View view) {
        List<Property> propertyData = PropertyDataCentre.getPropertyData();
        if (propertyData != null) {

            propertyData.toString();
        }
    }
}
