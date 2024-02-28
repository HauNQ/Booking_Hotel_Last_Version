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
public class Invoice {
    private long id;
    private long bookingID;
    private long customerID;
    private float roomCharge;
    private String roomService;
    private Date paymentDate;
    private String paymentMode;
    private String creditCardNo;

    public Invoice(long id, long bookingID, long customerID, float roomCharge, String roomService, Date paymentDate, String paymentMode, String creditCardNo) {
        this.id = id;
        this.bookingID = bookingID;
        this.customerID = customerID;
        this.roomCharge = roomCharge;
        this.roomService = roomService;
        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;
        this.creditCardNo = creditCardNo;
    }

    public Invoice() {
    }

    public Invoice(long bookingID, long customerID, float roomCharge, String roomService, Date paymentDate, String paymentMode, String creditCardNo) {
        this.bookingID = bookingID;
        this.customerID = customerID;
        this.roomCharge = roomCharge;
        this.roomService = roomService;
        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;
        this.creditCardNo = creditCardNo;
    }
    
    
    // Getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBookingID() {
        return bookingID;
    }

    public void setBookingID(long bookingID) {
        this.bookingID = bookingID;
    }

    public long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    public float getRoomCharge() {
        return roomCharge;
    }

    public void setRoomCharge(float roomCharge) {
        this.roomCharge = roomCharge;
    }

    public String getRoomService() {
        return roomService;
    }

    public void setRoomService(String roomService) {
        this.roomService = roomService;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getCreditCardNo() {
        return creditCardNo;
    }

    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }
}
