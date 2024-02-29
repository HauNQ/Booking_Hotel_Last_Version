/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impli;

import dao.ICancelBookingDAO;
import java.util.List;
import mapping.impli.CancelBookingMapping;
import model.CancelBookingModel;

/**
 *
 * @author Nguyen Quang Hau
 */
public class CancelBookingDAO extends AbstractModel implements ICancelBookingDAO{

    @Override
    public CancelBookingModel findBy(long id) {
         String sql = "SELECT * FROM CancelBooking WHERE id = ?";
         List<CancelBookingModel> list =  query(sql, new CancelBookingMapping(), id);
        return  (list.isEmpty())?null:list.get(0);
    }
    
}
