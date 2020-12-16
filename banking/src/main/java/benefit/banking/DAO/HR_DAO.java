package benefit.banking.DAO;

import benefit.banking.Entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Repository
@RequestMapping("/HR")
public class HR_DAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void update(Transaction t, int id)
    {
        try {
            String sql = "UPDATE Benefit_Data SET HR_Req_Closure_Check=?,HR_Req_Type_Check=?,HR_Attrition_Check=?,HR_IJP_Check=?,HR_Comments=? ,HR_Created_By='HR_Admin',Benefit_Status='Pending for GDN Approval',Status='Approved By HR' WHERE BenefitID=?";
            jdbcTemplate.update(sql,t.getHr_Req_Closure_Check(),t.getHr_Req_Type_Check(),t.getHr_Attrition_Check(),t.getHr_IJP_Check(),t.getHr_Comments(),id);
        } catch (Exception e) {
            System.out.println(e);

        }
    }
    public void reject(int id)
    {
        try {
            String sql = "UPDATE Benefit_Data SET Benefit_Status='Pending for OD Approval',Status='Rejected By HR' WHERE BenefitID=?";
            jdbcTemplate.update(sql,id);
        } catch (Exception e) {
            System.out.println(e);

        }
    }
    public List<Map<String, Object>>read()
    {
        List<Map<String, Object>> data = jdbcTemplate.queryForList("SELECT * FROM Benefit_Data WHERE Benefit_Status=? GROUP BY BenefitID","Pending for HR Approval");
        return data;
    }
}
