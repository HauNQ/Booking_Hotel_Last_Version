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
public class Admin {
    private int id;
    private String fullname;
    private Date dob;
    private String role;
    private String email;
    private String phone;
    private int status;
    private String address;
    private int modifiedBy;
    private Date modifiedDate;
    private Date createdDate;

    public Admin() {
    }

    public Admin(int id, String fullname, Date dob, String role, String email, String phone, int status, String address, int modifiedBy, Date modifiedDate, Date createdDate) {
        this.id = id;
        this.fullname = fullname;
        this.dob = dob;
        this.role = role;
        this.email = email;
        this.phone = phone;
        this.status = status;
        this.address = address;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
        this.createdDate = createdDate;
    }

    public Admin(String fullname, Date dob, String role, String email, String phone, int status, String address, int modifiedBy, Date modifiedDate, Date createdDate) {
        this.fullname = fullname;
        this.dob = dob;
        this.role = role;
        this.email = email;
        this.phone = phone;
        this.status = status;
        this.address = address;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
        this.createdDate = createdDate;
    }
    
    
    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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

    public int getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(int modifiedBy) {
        this.modifiedBy = modifiedBy;
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