/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author HI
 */
public class Supplier {
    private long id;
    private String fullName;
    private Date dob;
    private String role;
    private String email;
    private String phone;
    private int status;
    private String address;
    private long hotelId;
    private Date modifiedDate;
    private Date createdDate;

    public Supplier() {
    }

    
    public Supplier(long id, String fullName, Date dob, String role, String email, String phone, int status, String address, long hotelId, Date modifiedDate, Date createdDate) {
        this.id = id;
        this.fullName = fullName;
        this.dob = dob;
        this.role = role;
        this.email = email;
        this.phone = phone;
        this.status = status;
        this.address = address;
        this.hotelId = hotelId;
        this.modifiedDate = modifiedDate;
        this.createdDate = createdDate;
    }

    public Supplier(String fullName, Date dob, String role, String email, String phone, int status, String address, long hotelId, Date modifiedDate, Date createdDate) {
        this.fullName = fullName;
        this.dob = dob;
        this.role = role;
        this.email = email;
        this.phone = phone;
        this.status = status;
        this.address = address;
        this.hotelId = hotelId;
        this.modifiedDate = modifiedDate;
        this.createdDate = createdDate;
    }
    
    
    
    // Getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    
}
