package com.teachmeskills.lesson8.task1.runner;

import com.teachmeskills.lesson8.task1.patient.Patient;
import com.teachmeskills.lesson8.task1.staff.Therapist;
import java.util.Scanner;
/*
This class starts the project
 */
public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scan = sc.nextInt();
        Patient patient1 = new Patient("Кирилл", 24,scan);

        Therapist therapist = new Therapist();

        therapist.therapy(patient1);
    }
}