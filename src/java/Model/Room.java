/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author HI
 */
public class Room {

    private long roomNo;
    private long hotelId;
    private RoomType roomType;
    private int occupancy;
    private float priceIncludes;
    private int status;
    private String priceIncludesText;

    public Room() {
    }

    public Room(long roomNo, long hotelId, RoomType roomType, int occupancy, float priceIncludes, int status, String priceIncludesText) {
        this.roomNo = roomNo;
        this.hotelId = hotelId;
        this.roomType = roomType;
        this.occupancy = occupancy;
        this.priceIncludes = priceIncludes;
        this.status = status;
        this.priceIncludesText = priceIncludesText;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    // Getters and setters
    public long getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(long roomNo) {
        this.roomNo = roomNo;
    }

    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    public int getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(int occupancy) {
        this.occupancy = occupancy;
    }

    public float getPriceIncludes() {
        return priceIncludes;
    }

    public void setPriceIncludes(float priceIncludes) {
        this.priceIncludes = priceIncludes;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getPriceIncludesText() {
        return priceIncludesText;
    }

    public void setPriceIncludesText(String priceIncludesText) {
        this.priceIncludesText = priceIncludesText;
    }

}
