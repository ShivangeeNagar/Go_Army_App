/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author shivanginagar
 */
public class GradSchoolRequest extends WorkRequest {
    
    String hsGrade;
    String highSchool;
    String bachUni;
    String bachGrade;
    String bachDegree;
    String desProgram;
    String desUni;
    String desIntake;
    String additionalInfo;

    public String getHsGrade() {
        return hsGrade;
    }

    public void setHsGrade(String hsGrade) {
        this.hsGrade = hsGrade;
    }

    public String getHighSchool() {
        return highSchool;
    }

    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }

    public String getBachUni() {
        return bachUni;
    }

    public void setBachUni(String bachUni) {
        this.bachUni = bachUni;
    }

    public String getBachGrade() {
        return bachGrade;
    }

    public void setBachGrade(String bachGrade) {
        this.bachGrade = bachGrade;
    }

    public String getBachDegree() {
        return bachDegree;
    }

    public void setBachDegree(String bachDegree) {
        this.bachDegree = bachDegree;
    }

    public String getDesProgram() {
        return desProgram;
    }

    public void setDesProgram(String desProgram) {
        this.desProgram = desProgram;
    }

    public String getDesUni() {
        return desUni;
    }

    public void setDesUni(String desUni) {
        this.desUni = desUni;
    }

    public String getDesIntake() {
        return desIntake;
    }

    public void setDesIntake(String desIntake) {
        this.desIntake = desIntake;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
    
      @Override
    public String toString() {
        return bachUni;
    }
    
    
    
}
