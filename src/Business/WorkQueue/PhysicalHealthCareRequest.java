/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author dgoda
 */


public class PhysicalHealthCareRequest extends WorkRequest{
        private String phc_workRequest;
 private String medicine;

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }
    public String getMinBP() {
        return minBP;
    }

    public void setMinBP(String minBP) {
        this.minBP = minBP;
    }

    public String getMaxBP() {
        return maxBP;
    }

    public void setMaxBP(String maxBP) {
        this.maxBP = maxBP;
    }

    public String getBloodSugarlevel() {
        return bloodSugarlevel;
    }

    public void setBloodSugarlevel(String bloodSugarlevel) {
        this.bloodSugarlevel = bloodSugarlevel;
    }

        
        private String minBP;
        private String maxBP;
        private String bloodSugarlevel;
      
    public String getDetails_concern() {
        return details_concern;
    }

    public void setDetails_concern(String details_concern) {
        this.details_concern = details_concern;
    }

    public String getMedicalHistory_phyical() {
        return medicalHistory_phyical;
    }

    public void setMedicalHistory_phyical(String medicalHistory_phyical) {
        this.medicalHistory_phyical = medicalHistory_phyical;
    }

    public String getProsthesis_req() {
        return prosthesis_req;
    }

    public void setProsthesis_req(String prosthesis_req) {
        this.prosthesis_req = prosthesis_req;
    }

    public String getMain_Concern() {
        return main_Concern;
    }

    public void setMain_Concern(String main_Concern) {
        this.main_Concern = main_Concern;
    }

    public String getPhysical_injury() {
        return physical_injury;
    }

    public void setPhysical_injury(String physical_injury) {
        this.physical_injury = physical_injury;
    }

    public String getSymptons() {
        return symptons;
    }

    public void setSymptons(String symptons) {
        this.symptons = symptons;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getDoctorComments() {
        return doctorComments;
    }

    public void setDoctorComments(String doctorComments) {
        this.doctorComments = doctorComments;
    }

    public String getDoctorAnalysis() {
        return doctorAnalysis;
    }

    public void setDoctorAnalysis(String doctorAnalysis) {
        this.doctorAnalysis = doctorAnalysis;
    }

    public String getBloodPressure() {
        return BloodPressure;
    }

    public void setBloodPressure(String BloodPressure) {
        this.BloodPressure = BloodPressure;
    }

    public String getHeartDisease() {
        return HeartDisease;
    }

    public void setHeartDisease(String HeartDisease) {
        this.HeartDisease = HeartDisease;
    }

    public String getDiabetic() {
        return Diabetic;
    }

    public void setDiabetic(String Diabetic) {
        this.Diabetic = Diabetic;
    }

    public String getNeural_DisOrders() {
        return Neural_DisOrders;
    }

    public void setNeural_DisOrders(String Neural_DisOrders) {
        this.Neural_DisOrders = Neural_DisOrders;
    }

    public String getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(String pulseRate) {
        this.pulseRate = pulseRate;
    }

    public String getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(String bodyTemp) {
        this.bodyTemp = bodyTemp;
    }
        
        
        private String details_concern;
        private String medicalHistory_phyical;
        private String prosthesis_req;
        private String main_Concern;
        private String physical_injury;
        private String symptons;
        private String mood;
        private String doctorComments;
        private String doctorAnalysis;
        private String BloodPressure;
        private String HeartDisease;
        private String Diabetic;
        private String Neural_DisOrders;
        private String pulseRate;
        private String bodyTemp;
        
        
        
        

    public String getPhc_workRequest() {
        return phc_workRequest;
    }

    public void setPhc_workRequest(String phc_workRequest) {
        this.phc_workRequest = phc_workRequest;
    }
}
