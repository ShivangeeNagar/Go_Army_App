/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author akshatananjappa
 */
public class TempHousingRequest extends WorkRequest {
    String HousingSociety;
    int NumberOfPeople;
    String Comment;

    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public String getHousingSociety() {
        return HousingSociety;
    }

    public void setHousingSociety(String HousingSociety) {
        this.HousingSociety = HousingSociety;
    }

    public int getNumberOfPeople() {
        return NumberOfPeople;
    }

    public void setNumberOfPeople(int NumberOfPeople) {
        this.NumberOfPeople = NumberOfPeople;
    }
    
}
