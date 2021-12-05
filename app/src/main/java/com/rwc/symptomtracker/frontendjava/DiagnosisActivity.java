package com.rwc.symptomtracker.frontendjava;

import static com.rwc.symptomtracker.Constants.GLOBAL_TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.rwc.symptomtracker.R;
import com.rwc.symptomtracker.doctor.Symptoms;
import com.rwc.symptomtracker.doctor.VirtualDoctor;

public class DiagnosisActivity extends AppCompatActivity {
    private static final String TAG = GLOBAL_TAG + "DiagnosisActivity";

    TextView diagnosisTextView;
    TextView definitionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_diagnosis);
        Log.d(TAG, "Started......");
        getHandles();

        Intent intent = getIntent();
        if(intent != null) {
            String symptomsAsString = intent.getStringExtra("PassedSymptoms");
            Log.d(TAG, "Got symptoms as string = "+symptomsAsString);
            Gson gson = new Gson();
            Symptoms symptoms = gson.fromJson(symptomsAsString, Symptoms.class) ;

            // Call the VirtualDoctor
            VirtualDoctor.FullDiagnosis fullDiagnosis = VirtualDoctor.diagnose(symptoms.fever,
                    symptoms.long_lasting_cough,
                    symptoms.sneezing,
                    symptoms.bodypain,
                    symptoms.loss_of_appetite,
                    symptoms.night_sweats,
                    symptoms.shaking_chills,
                    symptoms.shortness_of_breath,
                    symptoms.fatigue,
                    symptoms.green_bloody_mucus,
                    symptoms.chest_pains,
                    symptoms.fast_heartrate,
                    symptoms.headache,
                    symptoms.stomachache,
                    symptoms.loss_of_taste,
                    symptoms.swollenlymph,
                    symptoms.loss_of_smell,
                    symptoms.vomiting,
                    symptoms.diarrhea);

            diagnosisTextView.setText(fullDiagnosis.diagnosis);
            definitionTextView.setText(fullDiagnosis.definition);
        }
    }

    private void getHandles() {
        diagnosisTextView = (TextView) findViewById(R.id.textViewDiagnosis);
        definitionTextView = (TextView) findViewById(R.id.textViewDefinition);
    }

    public void onClickButtonBack() {
        Intent intent = new Intent(this, SymptomsActivity.class);
        startActivity(intent);
    }
}
