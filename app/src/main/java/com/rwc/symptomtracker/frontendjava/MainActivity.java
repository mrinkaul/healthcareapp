package com.rwc.symptomtracker;

import static com.rwc.symptomtracker.Constants.GLOBAL_TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = GLOBAL_TAG + "MainActivity";

    Button buttonCheckSymptoms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Started......");
        acquireHandles();
    }

    private void acquireHandles() {
        // Get handles to various views
        buttonCheckSymptoms = (Button) findViewById(R.id.buttonCheckSymptoms);
    }

    public void onClickButtonCheckSymptoms(View view) {
        Log.d(TAG, "Button Check Symptoms");
    }

}