/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author HI
 */
public class Hotel {
    private long id;
    private String name;
    private String address;
    private String postcode;
    private int numRooms;
    private String phone;
    private float starRating;
    
    
    
    public Hotel() {
    }

    public Hotel(long id, String name, String address, String postcode, int numRooms, String phone, float starRating) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.postcode = postcode;
        this.numRooms = numRooms;
        this.phone = phone;
        this.starRating = starRating;
    }

    public Hotel(String name, String address, String postcode, int numRooms, String phone, float starRating) {
        this.name = name;
        this.address = address;
        this.postcode = postcode;
        this.numRooms = numRooms;
        this.phone = phone;
        this.starRating = starRating;
    }

    // Getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public float getStarRating() {
        return starRating;
    }

    public void setStarRating(float starRating) {
        this.starRating = starRating;
    }
    
}
