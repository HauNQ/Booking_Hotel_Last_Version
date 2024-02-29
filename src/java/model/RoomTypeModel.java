/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;

/**
 *
 * @author Nguyen Quang Hau
 */
public class RoomTypeModel {
   private long id;
   private String roomType;
   private java.math.BigDecimal money;
   private String roomDesc;

    public RoomTypeModel() {
    }

    public RoomTypeModel(long id, String roomType, BigDecimal money, String roomDesc) {
        this.id = id;
        this.roomType = roomType;
        this.money = money;
        this.roomDesc = roomDesc;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getRoomDesc() {
        return roomDesc;
    }

    public void setRoomDesc(String roomDesc) {
        this.roomDesc = roomDesc;
    }

    @Override
    public String toString() {
        return "RoomTypeModel{" + "id=" + id + ", roomType=" + roomType + ", money=" + money + ", roomDesc=" + roomDesc + '}';
    }
}
