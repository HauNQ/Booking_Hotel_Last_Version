/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impli;

import dao.IHotelDAO;
import java.util.List;
import mapping.impli.HotelMapping;
import model.HotelModel;

/**
 *
 * @author Nguyen Quang Hau
 */
public class HotelDAO extends AbstractModel implements IHotelDAO{

    @Override
    public HotelModel findBy(long id) {
       String sql = "SELECT * FROM Hotel WHERE id = ?";
        List<HotelModel> list = query(sql, new HotelMapping(), id);
        return (list.isEmpty())?null:list.get(0);
    }
  
}
