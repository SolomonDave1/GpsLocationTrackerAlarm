package com.paad.whereami;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;

public class Preferences extends PreferenceActivity {

  public static final String MIN_LONGITUDE = "MIN_LONGITUDE";
  public static final String MAX_LONGITUDE = "MAX_LONGITUDE";
  
  public static final String MIN_LATITIDE = "MIN_LATITUDE";
  public static final String MAX_LATITIDE = "MAX_LATITUDE";  
  SharedPreferences prefs;

  @Override
  public void onCreate(Bundle icicle) {
    super.onCreate(icicle);
    addPreferencesFromResource(R.xml.userpreferences);	
  }  
}