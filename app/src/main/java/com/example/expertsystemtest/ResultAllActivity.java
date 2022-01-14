package com.example.expertsystemtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.expertsystemtest.databinding.ActivityResultAllBinding;
import com.example.expertsystemtest.databinding.ActivityResultBinding;

public class ResultAllActivity extends AppCompatActivity {

    private float G001, G002, G003, G004, G005, G006, G007, G008, G009, G010, G011, G012, G013, G014, G015, G016, G017, G018, G019;
    private ActivityResultAllBinding binding;

    public static final String strG001 = "G001";
    public static final String strG002 = "G002";
    public static final String strG003 = "G003";
    public static final String strG004 = "G004";
    public static final String strG005 = "G005";
    public static final String strG006 = "G006";
    public static final String strG007 = "G007";
    public static final String strG008 = "G008";
    public static final String strG009 = "G009";
    public static final String strG010 = "G010";
    public static final String strG011 = "G011";
    public static final String strG012 = "G012";
    public static final String strG013 = "G013";
    public static final String strG014 = "G014";
    public static final String strG015 = "G015";
    public static final String strG016 = "G016";
    public static final String strG017 = "G017";
    public static final String strG018 = "G018";
    public static final String strG019 = "G019";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResultAllBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        G001 = getIntent().getFloatExtra(strG001, 0);
        G002 = getIntent().getFloatExtra(strG002, 0);
        G003 = getIntent().getFloatExtra(strG003, 0);
        G004 = getIntent().getFloatExtra(strG004, 0);
        G005 = getIntent().getFloatExtra(strG005, 0);
        G006 = getIntent().getFloatExtra(strG006, 0);
        G007 = getIntent().getFloatExtra(strG007, 0);
        G008 = getIntent().getFloatExtra(strG008, 0);
        G009 = getIntent().getFloatExtra(strG009, 0);
        G010 = getIntent().getFloatExtra(strG010, 0);
        G011 = getIntent().getFloatExtra(strG011, 0);
        G012 = getIntent().getFloatExtra(strG012, 0);
        G013 = getIntent().getFloatExtra(strG013, 0);
        G014 = getIntent().getFloatExtra(strG014, 0);
        G015 = getIntent().getFloatExtra(strG015, 0);
        G016 = getIntent().getFloatExtra(strG016, 0);
        G017 = getIntent().getFloatExtra(strG017, 0);
        G018 = getIntent().getFloatExtra(strG018, 0);
        G019 = getIntent().getFloatExtra(strG019, 0);
    }
}