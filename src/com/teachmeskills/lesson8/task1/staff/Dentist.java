package com.teachmeskills.lesson8.task1.staff;

import com.teachmeskills.lesson8.task1.patient.Patient;

/*
 This class contain pattern for "Dentist" and his methods.
  */
public class Dentist implements ITreatment {

    @Override
    public void treatmentPlan(Patient patient) {
        System.out.println(patient.getName() + ", you need to treat caries.");
    }
}
