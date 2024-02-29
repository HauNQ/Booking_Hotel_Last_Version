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
    private HotelModel hotelModel;
    private RoomTypeModel roomTypeModel;
    private int occupancy;
    private String priceIncludes;
    private short status;

    public RoomModel() {
    }

    public RoomModel(long roomNo, HotelModel hotelModel, RoomTypeModel roomTypeModel, int occupancy, String priceIncludes, short status) {
        this.roomNo = roomNo;
        this.hotelModel = hotelModel;
        this.roomTypeModel = roomTypeModel;
        this.occupancy = occupancy;
        this.priceIncludes = priceIncludes;
        this.status = status;
    }

    public long getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(long roomNo) {
        this.roomNo = roomNo;
    }

    public HotelModel getHotelModel() {
        return hotelModel;
    }

    public void setHotelModel(HotelModel hotelModel) {
        this.hotelModel = hotelModel;
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
        return "RoomModel{" + "roomNo=" + roomNo + ", hotelModel=" + hotelModel + ", roomTypeModel=" + roomTypeModel + ", occupancy=" + occupancy + ", priceIncludes=" + priceIncludes + ", status=" + status + '}';
    }
    
    
    
}
