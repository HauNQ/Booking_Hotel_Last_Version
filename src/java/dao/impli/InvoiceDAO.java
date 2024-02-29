/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impli;

import dao.IInvoiceDAO;
import java.util.List;
import mapping.impli.InvoiceMapping;
import model.InvoiceModel;

/**
 *
 * @author Nguyen Quang Hau
 */
public class InvoiceDAO extends AbstractModel implements IInvoiceDAO{

    @Override
    public InvoiceModel findBy(long id) {
         String sql = "SELECT * FROM Invoice WHERE id = ?";
         List<InvoiceModel> list =  query(sql, new InvoiceMapping(), id);
        return  (list.isEmpty())?null:list.get(0);
    }
    
    
}
