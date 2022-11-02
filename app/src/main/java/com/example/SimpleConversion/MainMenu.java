package com.example.SimpleConversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainMenu extends AppCompatActivity {
    //types of conversions that can be made
    private String[] conversionTypes = {"Temperature", "Length", "Time", "Volume"};
    private String[] tempTypes = {"Celcius", "Fahrenheit", "Kelvin"};
    private String[] lenTypes = {"Meters", "Kilometers", "Feet", "Yards", "Miles"};
    private String[] timeTypes = {"Seconds", "Minutes", "Hours", "Days"};
    private String[] volumeTypes = {"Milliliters", "Liters", "Cups", "Pints", "Gallons"};

    //initialized user input variables
    private String unitType = "Temperature";
    private double inputUnits = 100.0;
    private String inputUnitIndex = "Celcius";
    private String outputUnitIndex = "Fahrenheit";

    //calculate results depending on conversion type
    



}
