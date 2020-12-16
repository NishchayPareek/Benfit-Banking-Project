package benefit.banking.DAO;

import benefit.banking.Entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class OD_DAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void update(Transaction t, int id)
    {
        try {
            String sql = "UPDATE Benefit_Data SET OD_Req_Check=?,OD_Conflict_with_Global_Benefit=?,OD_Comments=?,OD_Created_By='OD_Admin',Benefit_Status='Pending for HR Approval',Status='Approved by OD' WHERE BenefitID=?";
            jdbcTemplate.update(sql,t.getOd_Req_Check(),t.getOd_Conflict_with_Global_Benefit(),t.getOd_Comments(),id);
        } catch (Exception e) {
            System.out.println(e);

        }
    }
    public List<Map<String, Object>> read() {
        List<Map<String, Object>> data = jdbcTemplate.queryForList("SELECT * FROM Benefit_Data WHERE Benefit_Status=? ","Pending for OD Approval");
        return data;

    }
    public List<Map<String, Object>> grpread()
    {
        List<Map<String, Object>> data = jdbcTemplate.queryForList("SELECT * FROM Benefit_Data WHERE Benefit_Status=? GROUP BY BenefitID","Pending for OD Approval");
        return data;
    }

    public void reject(int id)
    {
        try {
            String sql = "UPDATE Benefit_Data SET Benefit_Status='Pending for SDL review',Status='Rejected By OD' WHERE BenefitID=?";
            jdbcTemplate.update(sql,id);
        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
