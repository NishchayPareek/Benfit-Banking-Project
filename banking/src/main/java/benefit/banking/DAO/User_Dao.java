package benefit.banking.DAO;

import benefit.banking.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Map;

@Repository
public class User_Dao
{
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public int read(User u)
    {
        String name=u.getName();
        String commitid=u.getCommitId();
        int user=jdbcTemplate.queryForObject("SELECT RoleId FROM User WHERE commitId=?",new Object[]{commitid},Integer.class);

 // System.out.println(roleid);
      // System.out.println(name+commitid);
        return user;
    }
    public List<Map<String, Object>> read()
    {
//        List<Beer> beers = jdbcTemplate.query("SELECT * FROM beers",
//                (resultSet, rowNum) -> new Beer(resultSet.getString("name")));
        List<Map<String, Object>> user=jdbcTemplate.queryForList("SELECT *FROM User");
        return user;
    }
}
