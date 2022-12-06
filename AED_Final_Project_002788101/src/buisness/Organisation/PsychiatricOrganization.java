/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buisness.Organisation;

import java.util.ArrayList;
import javax.management.relation.Role;

/**
 *
 * @author vishwa
 */
public class PsychiatricOrganization extends Organization{
     public PsychiatricOrganization() {
        super(Organization.type.PsychiatricOrganization.getValue());
               
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PsychiatristRole());
        return roles;
    }
}
