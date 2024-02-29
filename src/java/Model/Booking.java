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
public class Booking {
    private long id;
    private long hotelId;
    private long customerId;
    private long roomNo;
    private Date bookingTime;
    private Date arrivalTime;
    private Date departureTime;
    private int numAdults;
    private int numChilds;
    private String specialReq;
    private int status;

    public Booking() {
    }

    public Booking(long hotelId, long customerId, long roomNo, Date bookingTime, Date arrivalTime, Date departureTime, int numAdults, int numChilds, String specialReq, int status) {
        this.hotelId = hotelId;
        this.customerId = customerId;
        this.roomNo = roomNo;
        this.bookingTime = bookingTime;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.numAdults = numAdults;
        this.numChilds = numChilds;
        this.specialReq = specialReq;
        this.status = status;
    }

    public Booking(long id, long hotelId, long customerId, long roomNo, Date bookingTime, Date arrivalTime, Date departureTime, int numAdults, int numChilds, String specialReq, int status) {
        this.id = id;
        this.hotelId = hotelId;
        this.customerId = customerId;
        this.roomNo = roomNo;
        this.bookingTime = bookingTime;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.numAdults = numAdults;
        this.numChilds = numChilds;
        this.specialReq = specialReq;
        this.status = status;
    }
    
    
    
    // Getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(long roomNo) {
        this.roomNo = roomNo;
    }

    public Date getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public int getNumAdults() {
        return numAdults;
    }

    public void setNumAdults(int numAdults) {
        this.numAdults = numAdults;
    }

    public int getNumChilds() {
        return numChilds;
    }

    public void setNumChilds(int numChilds) {
        this.numChilds = numChilds;
    }

    public String getSpecialReq() {
        return specialReq;
    }

    public void setSpecialReq(String specialReq) {
        this.specialReq = specialReq;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
}
