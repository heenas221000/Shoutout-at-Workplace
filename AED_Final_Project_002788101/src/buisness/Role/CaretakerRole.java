/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buisness.Role;

import buisness.Enterprise.Enterprise;
import buisness.Network.Network;
import buisness.Organisation.Organization;
import buisness.UserAccount.UserAccount;
import business.EcoSystem;
import javax.swing.JPanel;
import ui.Caretaker.CaretakerJPanel;

/**
 *
 * @author vishwa
 */
public class CaretakerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,EcoSystem business,Network network) {
        return new CaretakerJPanel(userProcessContainer, account, organization ,enterprise,business,network);
    }

    
}
