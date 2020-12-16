package benefit.banking.DAO;

import benefit.banking.Entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class Finance_DAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void update(Transaction t, int id)
    {
        try {
            String sql = "UPDATE Benefit_Data SET Finance_HC_Forecast_Reduction=?,Finance_New_Req_Check=?,Finance_Global_Benefit_Check=?,Finance_Obtain_Approval_From_Global_Finance=?,Finance_Comments=?,Finance_Created_By='Finance_Admin',Benefit_Status='Pending for T&PN Approval',Status='Approved By Finance' WHERE BenefitID=?";
            jdbcTemplate.update(sql,t.getFinance_HC_Forecast_Reduction(),t.getFinance_New_Req_Check(),t.getFinance_Global_Benefit_Check(),t.getFinance_Obtain_Approval_From_Global_Finance(),t.getFinance_Comments(),id);
        } catch (Exception e) {
            System.out.println(e);

        }
    }
    public void reject(int id)
    {
        try {
            String sql = "UPDATE Benefit_Data SET Benefit_Status='Pending for OD Approval',Status='Rejected By Finance' WHERE BenefitID=?";
            jdbcTemplate.update(sql,id);
        } catch (Exception e) {
            System.out.println(e);

        }
    }
    public List<Map<String, Object>> read()
    {
        List<Map<String, Object>> data = jdbcTemplate.queryForList("SELECT * FROM Benefit_Data WHERE Benefit_Status=? GROUP BY BenefitID","Pending for Finance Approval");
        return data;
    }
}
