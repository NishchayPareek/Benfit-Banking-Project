package benefit.banking.DAO;

import benefit.banking.Entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class GDN_DAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void update(Transaction t, int id)
    {
        try {
            String sql = "UPDATE Benefit_Data SET GDN_GDN_Project_Id_Check=?,GDN_TFS_Id_Generation=?,GDN_Comments=?,GDN_Created_By='GDN_Admin',Benefit_Status='Pending for Finance Approval',Status='Approved By GDN' WHERE BenefitID=?";
            jdbcTemplate.update(sql,t.getGdn_GDN_Project_Id_Check(),t.getGdn_TFS_Id_Generation(),t.getGdn_Comments(),id);
        } catch (Exception e) {
            System.out.println(e);

        }
    }
    public void reject(int id)
    {
        try {
            String sql = "UPDATE Benefit_Data SET Benefit_Status='Pending for OD Approval',Status='Rejected By GDN' WHERE BenefitID=?";
            jdbcTemplate.update(sql,id);
        } catch (Exception e) {
            System.out.println(e);

        }
    }
    public List<Map<String, Object>> read()
    {
        List<Map<String, Object>> data = jdbcTemplate.queryForList("SELECT * FROM Benefit_Data WHERE Benefit_Status=? GROUP BY BenefitID","Pending for GDN Approval");
        return data;
    }
}
