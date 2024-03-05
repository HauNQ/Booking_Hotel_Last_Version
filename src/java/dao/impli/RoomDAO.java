/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impli;

import dao.IRoomDAO;
import java.util.List;
import mapping.impli.RoomMapping;
import model.RoomModel;

/**
 *
 * @author Nguyen Quang Hau
 */
public class RoomDAO extends AbstractModel implements IRoomDAO {

    @Override
    public RoomModel findBy(long roomNo) {
        String sql = "SELECT * FROM Room WHERE roomNo = ?";
        List<RoomModel> list = query(sql, new RoomMapping(), roomNo);
        return (list.isEmpty()) ? null : list.get(0);
    }

    @Override
    public List<RoomModel> getRoomsListFromHotel(long hotelId) {
        String sql = "SELECT * FROM Room WHERE hotelID = ?";
        return query(sql, new RoomMapping(), hotelId);
    }

//    public static void main(String[] args) {
//        RoomDAO roomDAo = new RoomDAO();
//        System.out.println(roomDAo.findBy(1).toString());
//    }

}
