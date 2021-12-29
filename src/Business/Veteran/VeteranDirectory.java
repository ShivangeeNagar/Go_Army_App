/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Veteran;

import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;
import userinterface.MainJFrame;

/**
 *
 * @author dgoda
 */

public class VeteranDirectory {
    
    UserAccountDirectory useracc;
   private ArrayList<Veteran> veteran_Dir; 
     private VeteranDirectory veteran_Di;
 MainJFrame main;

      
 
    public VeteranDirectory(){
      veteran_Dir = new ArrayList<Veteran>();
    }

    public ArrayList<Veteran> getVeteran_Dir() {
        return veteran_Dir;
    }

    public void setVeteran_Dir(ArrayList<Veteran> veteran_Dir) {
        this.veteran_Dir = veteran_Dir;
    }
    
     public Veteran addVeteran()
    {
        Veteran v = new Veteran();
        veteran_Dir.add(v);
        return v;
    }
     public VeteranDirectory getVeteranDirectory() {
        VeteranDirectory vd = main.getDir();
        return vd;
    }

    
}
