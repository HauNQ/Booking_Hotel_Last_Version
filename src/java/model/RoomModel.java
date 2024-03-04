/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nguyen Quang Hau
 */
public class RoomModel {
    private long roomNo;
    private long hotelId;
    private String hotelName;
    private RoomTypeModel roomTypeModel;
    private int occupancy;
    private String priceIncludes;
    private short status;
    private String avatar;
    
    public RoomModel() {
    }

    public RoomModel(long roomNo, long hotelId, String hotelName, RoomTypeModel roomTypeModel, int occupancy, String priceIncludes, short status, String avatar) {
        this.roomNo = roomNo;
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.roomTypeModel = roomTypeModel;
        this.occupancy = occupancy;
        this.priceIncludes = priceIncludes;
        this.status = status;
        this.avatar = avatar;
    }
    
    

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    
    
    

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    

    
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

    

    public RoomTypeModel getRoomTypeModel() {
        return roomTypeModel;
    }

    public void setRoomTypeModel(RoomTypeModel roomTypeModel) {
        this.roomTypeModel = roomTypeModel;
    }

    public int getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(int occupancy) {
        this.occupancy = occupancy;
    }

    public String getPriceIncludes() {
        return priceIncludes;
    }

    public void setPriceIncludes(String priceIncludes) {
        this.priceIncludes = priceIncludes;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RoomModel{" + "roomNo=" + roomNo + ", hotelId=" + hotelId + ", hotelName=" + hotelName + ", roomTypeModel=" + roomTypeModel + ", occupancy=" + occupancy + ", priceIncludes=" + priceIncludes + ", status=" + status + ", avatar=" + avatar + '}';
    }

}
