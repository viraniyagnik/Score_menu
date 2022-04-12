package com.example.yagnik_score_style;
//name: Yagnik Virani
//ID  : A00227162
import android.os.Bundle;
import android.preference.PreferenceFragment;


public class settingsFragment extends PreferenceFragment {


    public settingsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);

    }


}