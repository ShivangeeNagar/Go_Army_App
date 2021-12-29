/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())) {
            organization = new DoctorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Lab.getValue())) {
            organization = new LabOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.VocationalSchool.getValue())) {
            organization = new VocationalSchoolOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.GradSchool.getValue())) {
            organization = new GradSchoolOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.TempHousing.getValue())) {
            organization = new TempHousingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PermHousing.getValue())) {
            organization = new PermHousingOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.PhysicalHealthCare.getValue())) {
            organization = new PhysicalHealthCareOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.MentalHeathCare.getValue())) {
            organization = new MentalHealthCareOrganzition();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.RehabOrganization.getValue())) {
            organization = new RehabOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Job.getValue())) {
            organization = new JobOrganization();
            organizationList.add(organization);
        }

        return organization;
    }
}
