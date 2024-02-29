/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impli;

import dao.ICustomerDAO;
import java.util.List;
import mapping.impli.CustomerMapping;
import model.CustomerModel;

/**
 *
 * @author Nguyen Quang Hau
 */
public class CustomerDAO extends AbstractModel implements ICustomerDAO{

    @Override
    public CustomerModel findBy(long id) {
        String sql = "SELECT * FROM Customer WHERE id = ?";
         List<CustomerModel> list =  query(sql, new CustomerMapping(), id);
        return  (list.isEmpty())?null:list.get(0);
    }
    
    
    
}
