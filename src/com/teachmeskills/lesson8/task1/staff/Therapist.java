package com.teachmeskills.lesson8.task1.staff;

import com.teachmeskills.lesson8.task1.patient.Patient;

/*
 This class contain pattern for "Therapist" and his methods.
  */
public class Therapist implements ITreatment {
    @Override
    public void treatmentPlan(Patient patient) {
        System.out.println(patient.getName() + ", you need to visit a therapist.");
    }

    public void therapy(Patient patient) {
        if (patient.getTreatmentPlan() == 1) {
            patient.setDoctor(new Surgeon());
        } else if (patient.treatmentPlan == 2) {
            patient.setDoctor(new Dentist());
        } else {
            patient.setDoctor(new Therapist());
        }
        patient.getDoctor().treatmentPlan(patient);
    }
}


