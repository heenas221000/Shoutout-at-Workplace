/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Enterprise.Enterprise;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author heenashah
 */
public class JusticeEnterprise extends Enterprise {
    
    public JusticeEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Justice);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
