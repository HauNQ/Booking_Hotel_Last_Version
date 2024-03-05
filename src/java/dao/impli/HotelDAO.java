/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impli;

import dao.IHotelDAO;
import dao.IRoomDAO;
import java.util.List;
import mapping.impli.HotelMapping;
import model.HotelModel;

/**
 *
 * @author Nguyen Quang Hau
 */
public class HotelDAO extends AbstractModel implements IHotelDAO {

    private IRoomDAO roomDAO = new RoomDAO();

    @Override

    public HotelModel findBy(long id) {
        HotelModel hotelModel = getHotel(id);
        if (hotelModel != null) {
            hotelModel.setRooms(roomDAO.getRoomsListFromHotel(id));
        }
        return hotelModel;

    }

    @Override
    // using for roomDAO, use findBy instead of this function
    public HotelModel getHotel(long id) {
        String sql = "SELECT * FROM Hotel WHERE id = ?";
        List<HotelModel> list = query(sql, new HotelMapping(), id);
        return (list.isEmpty()) ? null : list.get(0);
    }

//    public static void main(String[] args) {
//        HotelDAO hotel = new HotelDAO();
//        System.out.println(hotel.findBy(1));
//    }

}
