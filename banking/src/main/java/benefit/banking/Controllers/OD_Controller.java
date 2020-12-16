package benefit.banking.Controllers;

import benefit.banking.DAO.OD_DAO;
import benefit.banking.Entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/OD")
public class OD_Controller
{
 @Autowired
private OD_DAO od_dao;
    @PutMapping(value="/update/{id}")
    public String update(@RequestBody Transaction t, @PathVariable int id)
    {
        od_dao.update(t,id);
        return "updated";
    }
    @GetMapping("/read")
    public List<Map<String, Object>> read()
    {
        return od_dao.read();
    }
    @GetMapping("/gread")
    public List<Map<String, Object>> gread()
    {
        return od_dao.grpread();
    }
    @PutMapping(value="/reject/{id}")
    public String reject(@PathVariable int id)
    {
        od_dao.reject(id);
        return "rejected";
    }
}
