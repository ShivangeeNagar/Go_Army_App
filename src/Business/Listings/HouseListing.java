/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Listings;

/**
 *
 * @author akshatananjappa
 */
public class HouseListing {
    int listingId;
    String Area;
    String StreetName;
    String DoorNumber;
    String City;
    String PinCode;
    int Availability = 0;

    public int getAvailability() {
        return Availability;
    }

    public void setAvailability(int Availability) {
        this.Availability = Availability;
    }

    public int getListingId() {
        return listingId;
    }

    public void setListingId(int listingId) {
        this.listingId = listingId;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String StreetName) {
        this.StreetName = StreetName;
    }

    public String getDoorNumber() {
        return DoorNumber;
    }

    public void setDoorNumber(String DoorNumber) {
        this.DoorNumber = DoorNumber;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getPinCode() {
        return PinCode;
    }

    public void setPinCode(String PinCode) {
        this.PinCode = PinCode;
    }
    
      @Override
    public String toString() {
        return Area;
    }
}
