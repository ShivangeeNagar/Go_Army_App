/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import javax.swing.JPanel;

/**
 *
 * @author dgoda
 */
public class MentalHealthCareRequest extends WorkRequest{

    public String getMhc_workRequest() {
        return mhc_workRequest;
    }

    public void setMhc_workRequest(String mhc_workRequest) {
        this.mhc_workRequest = mhc_workRequest;
    }

    public String getMain_Concern() {
        return main_Concern;
    }

    public void setMain_Concern(String main_Concern) {
        this.main_Concern = main_Concern;
    }

    public String getBrain_injury() {
        return brain_injury;
    }

    public void setBrain_injury(String brain_injury) {
        this.brain_injury = brain_injury;
    }

    public String getMental_symptons() {
        return mental_symptons;
    }

    public void setMental_symptons(String mental_symptons) {
        this.mental_symptons = mental_symptons;
    }

   

    public String getDetails_concern() {
        return details_concern;
    }

    public void setDetails_concern(String details_concern) {
        this.details_concern = details_concern;
    }

    public String getMedicalHistory_mental() {
        return medicalHistory_mental;
    }

    public void setMedicalHistory_mental(String medicalHistory_mental) {
        this.medicalHistory_mental = medicalHistory_mental;
    }

    public String getMental_diagnoze_before() {
        return mental_diagnoze_before;
    }

    public void setMental_diagnoze_before(String mental_diagnoze_before) {
        this.mental_diagnoze_before = mental_diagnoze_before;
    }

        

    public String getDoctorAnalysis() {
        return doctorAnalysis;
    }

    public void setDoctorAnalysis(String doctorAnalysis) {
        this.doctorAnalysis = doctorAnalysis;
    }

    public String getDoctorComments() {
        return doctorComments;
    }

    public void setDoctorComments(String doctorComments) {
        this.doctorComments = doctorComments;
    }

   
    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }
        private String details_concern;
        private String medicalHistory_mental;
        private String mental_diagnoze_before;
        private String mhc_workRequest;
        private String main_Concern;
        private String brain_injury;
        private String mental_symptons;
        private String mood;
        private String doctorComments;
        private String doctorAnalysis;
  
   

  
    
}
