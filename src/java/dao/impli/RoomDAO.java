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
    
    public static void main(String[] args) {
        RoomDAO r = new RoomDAO();
        System.out.println(r.findWithLimit(0, 4));
    }

//    public static void main(String[] args) {
//        RoomDAO roomDAo = new RoomDAO();

//        System.out.println(roomDAo.findBy(1).toString());
//        for (RoomModel room : roomDAo.findWithLimit(0, 6)) {
//            System.out.println(room.toString());
//        }

//        for (RoomModel room : roomDAo.findWithLimit(0, 6)) {
//            System.out.println(room.toString());
//        }
//    }

    @Override
    public List<RoomModel> findWithLimit(int offset, int fetch) {
        StringBuilder sql = new StringBuilder();
        sql.append("select * from Room ");
        sql.append("where status = 1 ");
        sql.append("order by roomNo asc ");
        sql.append("offset ? rows ");
        sql.append("fetch next ? rows only");
        return query(sql.toString(), new RoomMapping(), offset,fetch);
    }

    @Override
    public Integer countTotal() {
        String sql = "SELECT COUNT(*) from ROOM";
        return countRows(sql);
    }

}
