/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buisness.Role;

import buisness.Enterprise.Enterprise;
import buisness.Network.Network;
import buisness.Organisation.Organization;
import business.EcoSystem;
import javax.swing.JPanel;

/**
 *
 * @author vishwa
 */
public class PsychiatristRole extends Role{
      @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new PsychiatristJPanel(userProcessContainer, account, organization,enterprise,business,network);
    }
    
}
