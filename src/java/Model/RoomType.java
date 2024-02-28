/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author HI
 */
public class RoomType {
    private String roomType;
    private float price;
    private String roomDesc;

    public RoomType() {
    }

    public RoomType(String roomType, float price, String roomDesc) {
        this.roomType = roomType;
        this.price = price;
        this.roomDesc = roomDesc;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getRoomDesc() {
        return roomDesc;
    }

    public void setRoomDesc(String roomDesc) {
        this.roomDesc = roomDesc;
    }
    
    
}
