package benefit.banking.Controllers;


import benefit.banking.DAO.GDN_DAO;
import benefit.banking.DAO.HR_DAO;
import benefit.banking.Entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/GDN")
public class GDN_Controller {
    @Autowired
    private GDN_DAO gdn_dao;
    @PutMapping(value="/update/{id}")
    public String update(@RequestBody Transaction t, @PathVariable int id)
    {
        gdn_dao.update(t,id);
        return "updated";
    }
    @PutMapping(value="/reject/{id}")
    public String reject(@PathVariable int id)
    {
        gdn_dao.reject(id);
        return "rejected";
    }
    @GetMapping("/read")
    public List<Map<String, Object>> read()
    {
        return gdn_dao.read();
    }
}
