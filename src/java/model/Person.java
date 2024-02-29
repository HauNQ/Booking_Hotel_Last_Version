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
public abstract class Person {
     private long id;
    private String fullname;
    private Date dob;
    private RoleModel roleModel;
    private String email;
    private String phone;
    private short status;
    private String address;
    private long modifiedBy;
    private Timestamp modifiedDate;
    private Timestamp createdDate;

    public Person() {
    }

    public Person(long id, String fullname, Date dob, RoleModel roleModel, String email, String phone, short status, String address, long modifiedBy, Timestamp modifiedDate, Timestamp createdDate) {
        this.id = id;
        this.fullname = fullname;
        this.dob = dob;
        this.roleModel = roleModel;
        this.email = email;
        this.phone = phone;
        this.status = status;
        this.address = address;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
        this.createdDate = createdDate;
    }

    

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public RoleModel getRoleModel() {
        return roleModel;
    }

    public void setRoleModel(RoleModel roleModel) {
        this.roleModel = roleModel;
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

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", fullname=" + fullname + ", dob=" + dob + ", roleModel=" + roleModel + ", email=" + email + ", phone=" + phone + ", status=" + status + ", address=" + address + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + ", createdDate=" + createdDate + '}';
    }
    
}