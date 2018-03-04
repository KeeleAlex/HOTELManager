/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagment;

/**
 *
 * @author Alex
 */
public class Room {
    int roomID;
    int customerID;
    int capacity;
    boolean disabled;
    double price;
    boolean checkedin;
    String calender;
    
    public Room(){
        
        this.roomID = -1;
        this.customerID = -1;
        this.capacity = -1;
        this.disabled = false;
        this.price = -1;
        this.checkedin = false;
        this.calender = null;
        
    }
    
    public Room(int id, int capacity, boolean disabled, double price){
        this.roomID = id;
        this.customerID = -1;
        this.capacity = capacity;
        this.disabled = disabled;
        this.price = price;
        this.checkedin = false;
        this.calender = null;
    }
    
    
    public int getRoomid(){
        return this.roomID;
    }
    
    public int getCapacity(){
        return this.capacity;
    }
    
    public boolean getDisabled(){
        return this.disabled;
    }
    
    public void setRoomid(int in){
        this.roomID = in;
    }
    
    public void setCustomerid(int in){
        this.customerID = in;
    }
    
    public void setCapacity(int in){
        this.capacity = in;
    }
    
    public void setDisabled(boolean in){
        this.disabled = in;
    }
    
    public void setPrice(double in){
        this.price = in;
    }
    
    public void checkIn(int customerID){
        this.customerID = customerID;
        this.checkedin = true;
    }
    
    public void checkOut(){
        this.customerID = -1;
        this.checkedin = false;
    }
    
    public String toString(){
        return "==============================\nRoom ID: " + String.valueOf(this.roomID) + "\nCustomer ID: " + String.valueOf(this.customerID)
                + "\nCapacity: " + this.capacity + "\nDisabled Access: " + this.disabled + "\nPrice: £" + this.price 
                + "\nCurrently Checked: " + this.checkedin + "\n";
    }
}
