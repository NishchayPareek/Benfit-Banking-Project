package benefit.banking.DAO;

import benefit.banking.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
@Repository
public class SDL_DAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> read(String id) {
        List<Map<String, Object>> data = jdbcTemplate.queryForList("SELECT * FROM Benefit_Data WHERE Benefit_Status=? AND SDL_Created_By=?  GROUP BY BenefitID","Pending for SDL review",id);
        return data;

    }

   public void create(Transaction t) {
        String mode = t.getMode();
        if (mode.equals("ANB")) {
            try {
                String sql = "INSERT INTO Benefit_Data(BenefitID,HC,Mode,Employee_Name,Req_Type,Req_No,SDL_Created_By,Benefit_Status) VALUES(?,?,?,?,?,?,'SDL_ADMIN','Pending for OD Approval')";
                jdbcTemplate.update(sql, t.getBenefitID(), t.getHc(), t.getMode(), t.getEmployee_Name(), t.getReq_Type(), t.getReq_No());
            } catch (Exception e) {
                System.out.println(e);

            }
        } else if (mode.equals("ORC")) {

            try {
                String sql = "INSERT INTO Benefit_Data(BenefitID,HC,Mode,Req_Type,Req_No,SDL_Created_By,Benefit_Status) VALUES(?,?,?,?,?,'SDL_ADMIN','Pending for OD Approval')";
                jdbcTemplate.update(sql, t.getBenefitID(), t.getHc(), t.getMode(), t.getReq_Type(), t.getReq_No());
            } catch (Exception e) {
                System.out.println(e);

            }

        } else if (mode.equals("IJP")) {

            try {
                String sql = "INSERT INTO Benefit_Data(BenefitID,HC,Mode,OD,LOB,Employee_Name,Target_Req,Source_Req,SDL_Created_By,Benefit_Status) VALUES(?,?,?,?,?,?,?,?,'SDL_ADMIN','Pending for OD Approval')";
                jdbcTemplate.update(sql, t.getBenefitID(), t.getHc(), t.getMode(), t.getOd(), t.getLob(), t.getEmployee_Name(), t.getTarget_Req(), t.getSource_Req());
            } catch (Exception e) {
                System.out.println(e);

            }
        } else if (mode.equals("ATS")) {

            try {
                String sql = "INSERT INTO Benefit_Data(BenefitID,HC,Mode,ATS_Id,GDN_Project_Id,Check_Taleo,SDL_Created_By,Benefit_Status) VALUES(?,?,?,?,?,?,'SDL_ADMIN','Pending for OD Approval')";
                jdbcTemplate.update(sql, t.getBenefitID(), t.getHc(), t.getMode(), t.getAts_Id(), t.getGdn_Project_Id(), t.getCheck_Taleo());
            } catch (Exception e) {
                System.out.println(e);

            }
        }
    }

    public void update(List<Transaction> t, int id) {
        String sqll = "SELECT Mode FROM Benefit_Data WHERE BenefitID ="+id;

      // List<String> t1=(List<String>)jdbcTemplate.queryForObject("SELECT Mode FROM Benefit_Data WHERE BenefitID=?",new Object[]{id},List.class);
        List<String> data = jdbcTemplate.query(sqll, new RowMapper<String>(){
            public String mapRow(ResultSet rs, int rowNum)
                    throws SQLException {
                return rs.getString(1);
            }
        });
       String mode = data.get(0);
System.out.println(data.get(0));


        if (mode.equals("ANB")) {
            String str = "SELECT Employee_Name FROM Benefit_Data WHERE BenefitID ="+id;
            List<String> emp = jdbcTemplate.query(str, new RowMapper<String>(){
                public String mapRow(ResultSet rs, int rowNum)
                        throws SQLException {
                    return rs.getString(1);
                }
            });
            for(int i=0;i<t.size();++i) {
                try {
                    String sql = "UPDATE Benefit_Data SET Employee_Name=?,Req_Type=?,Req_No=?,SDL_Created_By='SDL_ADMIN',Benefit_Status='Pending for OD Approval' WHERE Employee_Name=? AND BenefitID=?";
                    jdbcTemplate.update(sql, t.get(i).getEmployee_Name(), t.get(i).getReq_Type(), t.get(i).getReq_No(), emp.get(i),id);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } else if (mode.equals("ORC")) {
            String str = "SELECT Req_No FROM Benefit_Data WHERE BenefitID ="+id;
            List<String> emp = jdbcTemplate.query(str, new RowMapper<String>(){
                public String mapRow(ResultSet rs, int rowNum)
                        throws SQLException {
                    return rs.getString(1);
                }
            });
            System.out.println(emp.get(0)+emp.get(1));
            for(int i=0;i<t.size();++i)
            {
            try {
                String sql = "UPDATE Benefit_Data SET Req_Type=?,Req_No=?,SDL_Created_By='SDL_ADMIN',Benefit_Status='Pending for OD Approval' WHERE Req_No=? AND BenefitID=?";
                jdbcTemplate.update(sql, t.get(i).getReq_Type(), t.get(i).getReq_No(), emp.get(i),id);
            } catch (Exception e) {
                System.out.println(e);

            }
            }
        } else if (mode.equals("IJP")) {

            String str = "SELECT Employee_Name FROM Benefit_Data WHERE BenefitID ="+id;
            List<String> emp = jdbcTemplate.query(str, new RowMapper<String>(){
                public String mapRow(ResultSet rs, int rowNum)
                        throws SQLException {
                    return rs.getString(1);
                }
            });
            //System.out.println(emp.get(0)+emp.get(1));
         for(int i=0;i<t.size();++i)
         {
            try {
                String sql = "UPDATE Benefit_Data SET OD=?,LOB=?,Employee_Name=?,Target_Req=?,Source_Req=?,SDL_Created_By='SDL_ADMIN',Benefit_Status='Pending for OD Approval'WHERE Employee_Name=?AND BenefitID=?";
                jdbcTemplate.update(sql, t.get(i).getOd(), t.get(i).getLob(), t.get(i).getEmployee_Name(), t.get(i).getTarget_Req(), t.get(i).getSource_Req(),emp.get(i),id);
            } catch (Exception e) {
                System.out.println(e);
            }
            }
        } else if (mode.equals("ATS")) {
            String str = "SELECT ATS_Id FROM Benefit_Data WHERE BenefitID ="+id;
            List<String> emp = jdbcTemplate.query(str, new RowMapper<String>(){
                public String mapRow(ResultSet rs, int rowNum)
                        throws SQLException {
                    return rs.getString(1);
                }
            });
            //System.out.println(emp.get(0)+emp.get(1));
            for(int i=0;i<t.size();++i)
            {
            try {
                String sql = "UPDATE Benefit_Data SET ATS_Id=?,GDN_Project_Id=?,Check_Taleo=?,SDL_Created_By='SDL_ADMIN',Benefit_Status='Pending for OD Approval' WHERE ATS_Id=?AND BenefitID=?";
                jdbcTemplate.update(sql, t.get(i).getAts_Id(), t.get(i).getGdn_Project_Id(), t.get(i).getCheck_Taleo(),emp.get(i),id);
            } catch (Exception e) {
                System.out.println(e);
            }
            }
        }
    }

    public void createANB(List<ANB> anb,int HC,String Mode,String id) {

        int Benefit_Id = (int) jdbcTemplate.queryForObject("SELECT COUNT(*) FROM Benefit_Data", Integer.class);
       for (int i = 0; i < anb.size(); ++i) {
           try {
               String sql = "INSERT INTO Benefit_Data(BenefitID,HC,Mode,Employee_Name,Req_Type,Req_No,SDL_Created_By,Benefit_Status,Status) VALUES(?,?,?,?,?,?,?,'Pending for OD Approval','Requested By SDL')";
               jdbcTemplate.update(sql, Benefit_Id, HC, Mode, anb.get(i).getEmployee_Name(), anb.get(i).getReq_Type(), anb.get(i).getReq_No(),id);
           } catch (Exception e) {
               System.out.println(e);

           }
        }
    }
    public void createORC(List<ORC> orc, int HC, String Mode,String id)
    {

        int Benefit_Id = (int) jdbcTemplate.queryForObject("SELECT COUNT(*) FROM Benefit_Data", Integer.class);
        for (int i = 0; i < orc.size(); ++i) {
            try {
                String sql = "INSERT INTO Benefit_Data(BenefitID,HC,Mode,Req_Type,Req_No,SDL_Created_By,Benefit_Status,Status) VALUES(?,?,?,?,?,?,'Pending for OD Approval','Requested By SDL')";
                jdbcTemplate.update(sql, Benefit_Id, HC, Mode, orc.get(i).getReq_Type(),orc.get(i).getReq_No(),id);
            } catch (Exception e) {
                System.out.println(e);

            }
        }
    }
    public void createIJP(List<IJP> ijp, int HC, String Mode,String id)
    {
        int Benefit_Id = (int) jdbcTemplate.queryForObject("SELECT COUNT(*) FROM Benefit_Data", Integer.class);

        for (int i = 0; i < ijp.size(); ++i) {
            try {
                String sql = "INSERT INTO Benefit_Data(BenefitID,HC,Mode,OD,LOB,Employee_Name,Target_Req,Source_Req,SDL_Created_By,Benefit_Status,Status) VALUES(?,?,?,?,?,?,?,?,?,'Pending for OD Approval','Requested By SDL')";
                jdbcTemplate.update(sql, Benefit_Id, HC, Mode, ijp.get(i).getOd(), ijp.get(i).getLob(), ijp.get(i).getEmployee_Name(),  ijp.get(i).getTarget_Req(),ijp.get(i).getSource_Req(),id);
            } catch (Exception e) {
                System.out.println(e);

            }
        }
    }
    public void createATS(List<ATS> ats,int HC,String Mode,String id)
    {

        int Benefit_Id = (int) jdbcTemplate.queryForObject("SELECT COUNT(*) FROM Benefit_Data", Integer.class);
        for (int i = 0; i < ats.size(); ++i) {
            try {
                String sql = "INSERT INTO Benefit_Data(BenefitID,HC,Mode,ATS_Id,GDN_Project_Id,Check_Taleo,SDL_Created_By,Benefit_Status,Status) VALUES(?,?,?,?,?,?,?,'Pending for OD Approval','Requested By SDL')";
                jdbcTemplate.update(sql, Benefit_Id, HC, Mode, ats.get(i).getAts_Id(), ats.get(i).getGdn_Project_Id(), ats.get(i).getCheck_Taleo(),id);
            } catch (Exception e) {
                System.out.println(e);

            }
        }
    }
    public void delete(int id)
    {
        try {
            String sql = "DELETE FROM  Benefit_Data  WHERE BenefitID=?";
             jdbcTemplate.update(sql,id) ;
        }
        catch(Exception e)
        {
            System.out.println(e);

        }
    }

    public List<Map<String, Object>> Read(int id) {
        List<Map<String, Object>> data = jdbcTemplate.queryForList("SELECT * FROM Benefit_Data WHERE BenefitId=? ",id);
        return data;
    }

    public int search(String name)
    {
        int count=jdbcTemplate.queryForObject("SELECT count(*) FROM Benefit_Data WHERE Employee_Name=?",new Object[]{name},Integer.class);
          return count;
    }
}