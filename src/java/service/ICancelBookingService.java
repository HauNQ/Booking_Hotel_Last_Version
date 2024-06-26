/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.CancelBookingModel;
import java.sql.*;
/**
 *
 * @author Nguyen Quang Hau
 */
public interface ICancelBookingService {
    Integer countCancelBooking(long customerId);
    List<CancelBookingModel> findCancelBooking(long customerId, int offset, int fetch);
    void insert(long cusId, long bookingId, String content);
}
