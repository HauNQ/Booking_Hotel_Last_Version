/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impli;

import dao.ISupplierDAO;
import java.util.List;
import mapping.impli.SupplierMapping;
import model.SupplierModel;

/**
 *
 * @author Nguyen Quang Hau
 */
public class SupplierDAO extends AbstractModel implements ISupplierDAO {

    @Override
    public SupplierModel findBy(long id) {
        String sql = "SELECT * FROM Supplier WHERE id = ?";
        List<SupplierModel> list = query(sql, new SupplierMapping(), id);
        return (list.isEmpty()) ? null : list.get(0);
    }
    

}
