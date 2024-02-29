/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impli;

import dao.IReportDAO;
import java.util.List;
import mapping.impli.ReportMapping;
import model.ReportModel;

/**
 *
 * @author Nguyen Quang Hau
 */
public class ReportDAO extends AbstractModel implements IReportDAO {

    @Override
    public ReportModel findBy(long id) {
        String sql = "SELECT * FROM Report WHERE id = ?";
        List<ReportModel> list = query(sql, new ReportMapping(), id);
        return (list.isEmpty()) ? null : list.get(0);
    }
    
}
