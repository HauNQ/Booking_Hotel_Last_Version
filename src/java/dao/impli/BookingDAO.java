/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impli;

import dao.IBookingDAO;
import java.util.List;
import mapping.impli.BookingMapping;
import model.BookingModel;

/**
 *
 * @author Nguyen Quang Hau
 */
public class BookingDAO extends AbstractModel implements IBookingDAO{

    @Override
    public BookingModel findBy(long id) {
         String sql = "SELECT * FROM Booking WHERE id = ?";
         List<BookingModel> list =  query(sql, new BookingMapping(), id);
        return  (list.isEmpty())?null:list.get(0);
    }
    
}
