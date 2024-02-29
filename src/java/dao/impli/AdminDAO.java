/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impli;

import dao.IAdminDAO;
import java.util.List;
import mapping.impli.AdminMapping;
import model.AdminModel;

/**
 *
 * @author Nguyen Quang Hau
 */
public class AdminDAO extends AbstractModel  implements IAdminDAO {

    @Override
    public AdminModel findBy(long id) {
        String sql = "SELECT * FROM Admin WHERE id = ?";
        List<AdminModel> list = query(sql, new AdminMapping(), id);
        return (list.isEmpty()) ? null : list.get(0);
    }

}
