package com.rwc.symptomtracker.frontendjava;

import static com.rwc.symptomtracker.Constants.GLOBAL_TAG;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.rwc.symptomtracker.R;
import com.rwc.symptomtracker.doctor.Symptoms;

public class SymptomsActivity extends AppCompatActivity {
    private static final String TAG = GLOBAL_TAG + "SymptomsActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_symptoms);
        Log.d(TAG, "Started......");
    }

    public void onClickButtonDiagnose(View view) {
        Log.d(TAG, "Diagnose button clicked");

        Symptoms symptoms = new Symptoms(((CheckBox)findViewById(R.id.checkboxFever)).isChecked(),
                ((CheckBox)findViewById(R.id.checkboxLongLastingCough)).isChecked(),
                ((CheckBox)findViewById(R.id.checkboxSneezing)).isChecked(),
                ((CheckBox)findViewById(R.id.checkboxBodypain)).isChecked(),
                ((CheckBox)findViewById(R.id.checkboxLossOfAppetite)).isChecked(),
                ((CheckBox)findViewById(R.id.checkboxNightSweats)).isChecked(),
                ((CheckBox)findViewById(R.id.checkboxShakingChills)).isChecked(),
                ((CheckBox)findViewById(R.id.checkboxShortnessOfBreath)).isChecked(),
                ((CheckBox)findViewById(R.id.checkboxFatigue)).isChecked(),
                ((CheckBox)findViewById(R.id.checkMucus)).isChecked(),
                ((CheckBox)findViewById(R.id.checkboxChestPains)).isChecked(),
                ((CheckBox)findViewById(R.id.checkboxFastHeartrate)).isChecked(),
                ((CheckBox)findViewById(R.id.checkboxHeadache)).isChecked(),
                ((CheckBox)findViewById(R.id.checkboxStomachache)).isChecked(),
                ((CheckBox)findViewById(R.id.checkboxLossOfTaste)).isChecked(),
                ((CheckBox)findViewById(R.id.checkboxSwollenLymph)).isChecked(),
                ((CheckBox)findViewById(R.id.checkboxLossOfSmell)).isChecked());
        Log.d(TAG, "Symptoms created = "+symptoms);

        Gson gson = new Gson();
        String symptomsAsAString = gson.toJson(symptoms);
        Log.d(TAG, "Symptoms As String = "+symptomsAsAString);

        Intent intent = new Intent(this, DiagnosisActivity.class);
        intent.putExtra("PassedSymptoms", symptomsAsAString);
        startActivity(intent);

    }
}
