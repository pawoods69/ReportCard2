package com.example.android.reportcard;

import java.util.ArrayList;

/**
 * Created by princ on 5/4/2017. This project is only a Java class for the ReportCard project. This
 * will contain variables to track information only to a report card. Will have one constructor.
 * Private variables with getter and setter methods. With String methods.
 */

public class ReportCard {

    /**
     * ArrayList for the school subjects
     */
    private ArrayList<String> mSubjects = new ArrayList<String>();

    /**
     * ArrayList for the values of the grades
     */
    private ArrayList<Double> mGrade = new ArrayList<Double>();

    /**
     * String for value of grades
     */
    private String totalGrades;

    /**
     * Final value of grades
     */
    private double mFinalGrade;


    /**
     * ReportCard object
     *
     * @param englishGrade  value for English
     * @param scienceGrade  value for Science
     * @param languageGrade value for Language
     * @param historyGrade  value for History
     * @param bandGrade     value for Band
     */


    public ReportCard(double englishGrade, double scienceGrade, double languageGrade, double historyGrade, double bandGrade) {

        mSubjects.add(0, "English");
        mSubjects.add(1, "Science");
        mSubjects.add(2, "Language");
        mSubjects.add(3, "History");
        mSubjects.add(4, "Band");

        mGrade.add(0, englishGrade);
        mGrade.add(1, scienceGrade);
        mGrade.add(2, languageGrade);
        mGrade.add(3, historyGrade);
        mGrade.add(4, bandGrade);
    }


/** setters */


    /**
     * setter for English Grade
     */
    public void setmEnglishGrade(double grade) {
        mGrade.set(0, grade);
    }

    /**
     * setter for Science Grade
     */
    public void setmScienceGrade(double grade) {
        mGrade.set(1, grade);
    }

    /**
     * setter for Language Grade
     */
    public void setmLanguageGrade(double grade) {
        mGrade.set(2, grade);
    }

    /**
     * setter for History Grade
     */
    public void setmHistoryGrade(double grade) {
        mGrade.set(3, grade);
    }

    /**
     * setter for Band Grade
     */
    public void setmBandGrade(double grade) {
        mGrade.set(4, grade);
    }

/** getters */


    /**
     * getter for English Grade
     */
    public double getmEnglishGrade() {
        double grade = mGrade.get(0);
        return grade;
    }

    /**
     * getter for Science Grade
     */
    public double getmScienceGrade() {
        double grade = mGrade.get(1);
        return grade;
    }

    /**
     * getter for Language Grade
     */
    public double getmLanguageGrade() {
        double grade = mGrade.get(2);
        return grade;
    }

    /**
     * getter for History Grade
     */
    public double getmHistoryGrade() {
        double grade = mGrade.get(3);
        return grade;
    }

    /**
     * getter for Band Grade
     */
    public double getmBandGrade() {
        double grade = mGrade.get(4);
        return grade;
    }

    /**
     * final grade calculation of all subjects
     */
    public double getmFinalGrade() {
        mFinalGrade = 0.0;
        for (int i = 0; i < mGrade.size(); i++) {
            double grade = mGrade.get(i);
            mFinalGrade = mFinalGrade + grade;
        }
        mFinalGrade = mFinalGrade / mGrade.size();
        return mFinalGrade;
    }

    /**
     * toString method which returns the contents of the class
     */
    @Override
    public String toString() {
        totalGrades = "";
        for (int i = 0; i < mGrade.size(); i++) {
            Double grade = mGrade.get(i);
            String subject = mSubjects.get(i);
            totalGrades = totalGrades + subject + ": " + grade + "\n";
        }
        totalGrades = totalGrades + "Final Grade: " + mFinalGrade;
        return totalGrades;
    }

}

