package com.rwc.symptomtracker.frontendjava;

import static com.rwc.symptomtracker.Constants.GLOBAL_TAG;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.rwc.symptomtracker.R;

public class DiagnosisActivity extends AppCompatActivity {
    private static final String TAG = GLOBAL_TAG + "DiagnosisActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_diagnosis);
        Log.d(TAG, "Started......");
    }
}
