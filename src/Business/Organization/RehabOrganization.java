/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PhysicalHealthCareRole;
import Business.Role.RehabRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author dgoda
 */
public class RehabOrganization extends Organization{
  
    public RehabOrganization() {
        super(Organization.Type.RehabOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RehabRole());
        return roles;
    }
}
