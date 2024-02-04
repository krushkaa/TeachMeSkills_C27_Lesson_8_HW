package com.teachmeskills.lesson8.task1.patient;

/*
The class contains data about the clinic patient
 */

import com.teachmeskills.lesson8.task1.staff.ITreatment;

public class Patient {
    public String name;
    public int age;
    public int treatmentPlan;
    private ITreatment doctor;

    public Patient(String name, int age, int treatmentPlan) {
        this.name = name;
        this.age = age;
        this.treatmentPlan = treatmentPlan;
    }
    public String getName() {
        String s = "Patient " + name;
        return s;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public ITreatment getDoctor() {
        return doctor;
    }

    public void setDoctor(ITreatment doctor) {
        this.doctor = doctor;
    }
}
