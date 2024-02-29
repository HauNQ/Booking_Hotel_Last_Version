/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author Nguyen Quang Hau
 */
public class SupplierModel extends Person{
  private HotelModel hotelModel;

    public SupplierModel() {
    }

    public SupplierModel(HotelModel hotelModel, long id, String fullname, String password, Date dob, RoleModel roleModel, String email, String phone, short status, String address, long modifiedBy, Timestamp modifiedDate, Timestamp createdDate) {
        super(id, fullname, password, dob, roleModel, email, phone, status, address, modifiedBy, modifiedDate, createdDate);
        this.hotelModel = hotelModel;
    }


    public HotelModel getHotelModel() {
        return hotelModel;
    }

    public void setHotelModel(HotelModel hotelModel) {
        this.hotelModel = hotelModel;
    }

    @Override
    public String toString() {
        return super.toString()+":-- "+hotelModel.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
