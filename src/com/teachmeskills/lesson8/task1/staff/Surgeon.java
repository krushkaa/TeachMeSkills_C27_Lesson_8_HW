package com.teachmeskills.lesson8.task1.staff;

import com.teachmeskills.lesson8.task1.patient.Patient;

/*
 This class contain pattern for "Surgeon" and his methods.
  */
public class Surgeon implements ITreatment{
    @Override
    public void treatmentPlan(Patient patient) {
        System.out.println(patient.getName() + ", you need to visit a surgeon.");

    }
}
