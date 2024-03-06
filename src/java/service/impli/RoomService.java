/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impli;

import dao.IRoomDAO;
import dao.impli.RoomDAO;
import java.util.List;
import model.RoomModel;
import service.IRoomService;

/**
 *
 * @author Nguyen Quang Hau
 */
public class RoomService implements IRoomService{
    private IRoomDAO roomDAO = new RoomDAO();
    
    @Override
    public List<RoomModel> findWithLimit(int offset, int fetch) {
        return roomDAO.findWithLimit(offset, fetch);
    }

    @Override
    public Integer countTotal() {
        return roomDAO.countTotal();
    }
    
}
