/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import model.BookingModel;

/**
 *
 * @author Nguyen Quang Hau
 */
public interface IBookingDAO {
    BookingModel findBy(long id);
}