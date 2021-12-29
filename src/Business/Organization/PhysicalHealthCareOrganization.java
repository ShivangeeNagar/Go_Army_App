/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PermHousingRole;
import Business.Role.PhysicalHealthCareRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author dgoda
 */
public class PhysicalHealthCareOrganization extends Organization{
  
    public PhysicalHealthCareOrganization() {
        super(Organization.Type.PhysicalHealthCare.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PhysicalHealthCareRole());
        return roles;
    }
}
