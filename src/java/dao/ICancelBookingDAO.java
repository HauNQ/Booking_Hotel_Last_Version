/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.CancelBookingModel;

/**
 *
 * @author Nguyen Quang Hau
 */
public interface ICancelBookingDAO{
    CancelBookingModel findBy (long id);
}
