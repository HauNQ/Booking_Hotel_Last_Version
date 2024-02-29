/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impli;

import dao.IFeedbackDAO;
import java.util.List;
import mapping.impli.FeedbackMapping;
import model.FeedbackModel;

/**
 *
 * @author Nguyen Quang Hau
 */
public class FeedbackDAO extends AbstractModel implements IFeedbackDAO{

    @Override
    public FeedbackModel findBy(long id) {
         String sql = "SELECT * FROM feedback WHERE id = ?";
         List<FeedbackModel> list =  query(sql, new FeedbackMapping(), id);
        return  (list.isEmpty())?null:list.get(0);
    }
    
   
}
