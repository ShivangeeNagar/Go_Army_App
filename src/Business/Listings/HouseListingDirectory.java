/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Listings;

import Business.Employee.Employee;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;
import userinterface.MainJFrame;
import userinterface.PermHousing.AddListingJPanel;

/**
 *
 * @author akshatananjappa
 */
public class HouseListingDirectory {

    private ArrayList<HouseListing> houseList;
    UserAccountDirectory useracc;
    private ArrayList<HouseListing> HouseListing_Dir;
    private HouseListingDirectory HouseLisitng_Di;
    MainJFrame main;
    AddListingJPanel addlisting;
    int Total_count = 0;

    public int getTotal_count() {
        return Total_count;
    }

    public void setTotal_count(int Total_count) {
        this.Total_count = Total_count;
    }

    public HouseListingDirectory() {
        HouseListing_Dir = new ArrayList<HouseListing>();
    }

    public ArrayList<HouseListing> getHouseListing_Dir() {
        return HouseListing_Dir;
    }

    public void setHouseListing_Dir(ArrayList<HouseListing> HouseListing_Dir) {
        this.HouseListing_Dir = HouseListing_Dir;
    }

    public HouseListing addHouseListing() {
        HouseListing h = new HouseListing();
        HouseListing_Dir.add(h);
        Total_count = HouseListing_Dir.size();
        return h;
    }

    public void DeleteHouseListing(HouseListing h) {

        HouseListing_Dir.remove(h);
        Total_count = HouseListing_Dir.size();

    }

    public HouseListingDirectory getHouseListingDirectory() {
        HouseListingDirectory hd = addlisting.getDir();
        return hd;
    }

}
