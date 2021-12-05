package com.rwc.symptomtracker.doctor;

public class VirtualDoctor {
    public static String DIAGNOSIS_COVID = "Covid-19";
    public static String DIAGNOSIS_COMMON_COLD = "Common cold";
    public static String DIAGNOSIS_PNEUMONIA = "Pneumonia";
    public static String DIAGNOSIS_TUBERCULOSIS = "Tuberculosis";
    public static String DIAGNOSIS_UNKNOWN = "unknown";
    public static String DIAGNOSIS_CHAGAS = "Chagas disease";
    public static String DIAGNOSIS_MALARIA = "Malaria";

    public static String DEFINITION_COVID = "A mild to severe respiratory illness that is caused by a coronavirus (Severe acute respiratory syndrome coronavirus 2, is transmitted chiefly by contact with infectious material.";
    public static String DEFINITION_COMMON_COLD = "The common cold is a viral infection of your nose and throat (upper respiratory tract). It's usually harmless, although it might not feel that way. Many types of viruses can cause a common cold.";
    public static String DEFINITION_PNEUMONIA = "Pneumonia is an infection that inflames your lungs' air sacs (alveoli). The air sacs may fill up with fluid or pus, causing symptoms such as a cough, fever, chills and trouble breathing.";
    public static String DEFINITION_TUBERCULOSIS = "Tuberculosis (TB) is a contagious infection that usually attacks your lungs. It can also spread to other parts of your body, like your brain and spine. A type of bacteria called Mycobacterium tuberculosis causes it.";
    public static String DEFINITION_CHAGAS = "Chagas (CHAH-gus) disease is an inflammatory, infectious disease caused by the parasite Trypanosoma cruzi. This parasite is found in the feces of the triatomine (reduviid) bug";
    public static String DEFINITION_UNKNOWN = "Unknown disease";
    public static String DEFINITION_MALARIA = "Malaria is a serious disease caused by a parasite that infects a certain type of mosquito which feeds on humans.  The following foods have healing properties that help combat malaria; grapefruit, cinnamon,  holy basil, ginger,  and fever nuts. They should be eaten frequently in the case that a doctor cannot be reached. \n";

    public static FullDiagnosis diagnose(Boolean fever,
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
                                  Boolean loss_of_smell,
                                         Boolean vomiting,
                                         Boolean diarreha ){

        if (fever && long_lasting_cough && loss_of_taste && loss_of_smell)
            return new FullDiagnosis(DIAGNOSIS_COVID, DEFINITION_COVID);
        if (!fever && sneezing)
            return new FullDiagnosis(DIAGNOSIS_COMMON_COLD, DEFINITION_COMMON_COLD);
        if(green_bloody_mucus && shortness_of_breath && fatigue && fast_heartrate && chest_pains)
            return new FullDiagnosis(DIAGNOSIS_PNEUMONIA, DEFINITION_PNEUMONIA);
        if (fever && night_sweats && loss_of_appetite && long_lasting_cough)
            return new FullDiagnosis(DIAGNOSIS_TUBERCULOSIS, DEFINITION_TUBERCULOSIS);
        if (bodypain && fever && headache && stomachache && swollenlymph)
            return new FullDiagnosis(DIAGNOSIS_CHAGAS, DEFINITION_CHAGAS);
        if (shaking_chills && fever && fatigue && fast_heartrate && headache && vomiting && diarreha)
            return new FullDiagnosis(DIAGNOSIS_MALARIA, DEFINITION_MALARIA);

        return new FullDiagnosis(DIAGNOSIS_UNKNOWN, DEFINITION_UNKNOWN);
    }



    public static class FullDiagnosis {
        public String diagnosis;
        public String definition;

        public FullDiagnosis(String diagnosis, String definition) {
            this.diagnosis = diagnosis;
            this.definition = definition;
        }
    }

    /***
     * MAIN won't work on Android

          public static void main(String[] args) {
              System.out.println(VirtualDoctor.diagnose(true, false, true, false, false));
              System.out.println(VirtualDoctor.diagnose(false, false, true, false, false));
         }
    */
}
