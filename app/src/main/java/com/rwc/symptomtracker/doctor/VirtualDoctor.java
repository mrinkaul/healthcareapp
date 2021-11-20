package com.rwc.symptomtracker.doctor;

public class VirtualDoctor {
    public static String DIAGNOSIS_COVID = "COVID 19";
    public static String DIAGNOSIS_COMMON_COLD = "COMMON COLD";
    public static String DIAGNOSIS_UNKNOWN = "UNKNOWN";

    public static String diagnose(Boolean fever,
                                  Boolean sneezing,
                                  Boolean coughing,
                                  Boolean vomiting,
                                  Boolean diarriea) {
        if (fever && coughing)
            return DIAGNOSIS_COVID;
        if (!fever && sneezing)
            return DIAGNOSIS_COMMON_COLD;

        return DIAGNOSIS_UNKNOWN;
    }
}
