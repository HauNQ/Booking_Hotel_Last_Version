/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import model.RoomModel;

/**
 *
 * @author Nguyen Quang Hau
 */
public interface IRoomDAO {
    RoomModel findBy(long roomNo);
    List<RoomModel> getRoomsListFromHotel(long hotelId);
    List<RoomModel> findWithLimit(int offset, int fetch);
    Integer countTotal();
}
