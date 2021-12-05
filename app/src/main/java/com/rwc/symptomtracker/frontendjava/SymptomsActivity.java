package com.rwc.symptomtracker.frontendjava;

import static com.rwc.symptomtracker.Constants.GLOBAL_TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import com.rwc.symptomtracker.R;

public class SymptomsActivity extends AppCompatActivity {
    private static final String TAG = GLOBAL_TAG + "SymptomsActivity";

    CheckBox checkboxFever;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_symptoms);
        Log.d(TAG, "Started......");
    }

    public void onClickButtonDiagnose(View view) {
        Log.d(TAG, "Diagnose button clicked");
        checkboxFever = (CheckBox) findViewById(R.id.checkboxFever);

        Intent intent = new Intent(this, DiagnosisActivity.class);
        startActivity(intent);
    }
}
