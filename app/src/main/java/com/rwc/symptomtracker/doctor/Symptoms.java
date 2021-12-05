package com.rwc.symptomtracker.doctor;

public class Symptoms{
    public Boolean fever;
    public Boolean long_lasting_cough;
    public Boolean sneezing;
    public Boolean bodypain;
    public Boolean loss_of_appetite;
    public Boolean night_sweats;
    public Boolean shaking_chills;
    public Boolean shortness_of_breath;
    public Boolean fatigue;
    public Boolean green_bloody_mucus;
    public Boolean chest_pains;
    public Boolean fast_heartrate;
    public Boolean headache;
    public Boolean stomachache;
    public Boolean loss_of_taste;
    public Boolean swollenlymph;
    public Boolean loss_of_smell;
    public Boolean vomiting;
    public Boolean diarrhea;

    public Symptoms(Boolean fever,
                    Boolean long_lasting_cough,
                    Boolean sneezing,
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
                    Boolean diarrhea) {
        this.fever = fever;
        this.long_lasting_cough = long_lasting_cough;
        this.sneezing = sneezing;
        this.bodypain = bodypain;
        this.loss_of_appetite = loss_of_appetite;
        this.night_sweats = night_sweats;
        this.shaking_chills = shaking_chills;
        this.shortness_of_breath = shortness_of_breath;
        this.fatigue = fatigue;
        this.green_bloody_mucus = green_bloody_mucus;
        this.chest_pains = chest_pains;
        this.fast_heartrate = fast_heartrate;
        this.headache = headache;
        this.stomachache = stomachache;
        this.loss_of_taste = loss_of_taste;
        this.swollenlymph = swollenlymph;
        this.loss_of_smell = loss_of_smell;
        this.vomiting = vomiting;
        this.diarrhea = diarrhea;
    }
}
