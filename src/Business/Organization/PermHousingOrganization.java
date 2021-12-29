/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PermHousingRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shivanginagar
 */


public class PermHousingOrganization extends Organization{

    public PermHousingOrganization() {
        super(Organization.Type.PermHousing.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PermHousingRole());
        return roles;
    }
     
}