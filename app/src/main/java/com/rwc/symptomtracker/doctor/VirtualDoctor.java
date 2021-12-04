package com.rwc.symptomtracker.doctor;

public class VirtualDoctor {
    public static String DIAGNOSIS_COVID = "COVID 19";
    public static String DIAGNOSIS_COMMON_COLD = "COMMON COLD";
    public static String DIAGNOSIS_PNEUMONIA = "PNEUMONIA";
    public static String DIAGNOSIS_TUBERCULOSIS = "TUBERCULOSIS";
    public static String DIAGNOSIS_UNKNOWN = "UNKNOWN";
    public static String DIAGNOSIS_CHAGAS = "CHAGAS DISEASE";

    public static String diagnose(Boolean fever,
                                  Boolean long_lasting_cough,
                                  Boolean sneezing ,
                                  Boolean bodypain,
                                  Boolean loss_of_appetite,
                                  Boolean night_sweats,
                                  Boolean shaking_chills,
                                  Boolean shortness_of_breath,
                                  Boolean fatigue,
                                  Boolean green_bloody_mucus,
                                  Boolean chest_pains,
                                  Boolean fast_heartrate,
                                  Boolean headache,
                                  Boolean stomachache,
                                  Boolean loss_of_taste,
                                  Boolean swollenlymph,
                                  Boolean loss_of_smell){

        if (fever && long_lasting_cough && loss_of_taste && loss_of_smell)
            return DIAGNOSIS_COVID;
        if (!fever && sneezing)
            return DIAGNOSIS_COMMON_COLD;
        if(green_bloody_mucus && shortness_of_breath && fatigue && fast_heartrate && chest_pains)
            return DIAGNOSIS_PNEUMONIA;
        if (fever && night_sweats && loss_of_appetite && long_lasting_cough)
            return DIAGNOSIS_TUBERCULOSIS;
        if (bodypain && fever && headache && stomachache && swollenlymph)
            return DIAGNOSIS_CHAGAS;


        return DIAGNOSIS_UNKNOWN;
    }


    /***
     * MAIN won't work on Android

          public static void main(String[] args) {
              System.out.println(VirtualDoctor.diagnose(true, false, true, false, false));
              System.out.println(VirtualDoctor.diagnose(false, false, true, false, false));
         }
    */
}
