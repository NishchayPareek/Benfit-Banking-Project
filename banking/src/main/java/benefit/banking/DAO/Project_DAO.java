package benefit.banking.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public class Project_DAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> Read() {
        List<Map<String, Object>> data = jdbcTemplate.queryForList("SELECT Name FROM GDN_Project_List ");
        return data;
    }
}
