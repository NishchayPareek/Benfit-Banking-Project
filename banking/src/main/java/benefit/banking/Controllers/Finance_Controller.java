package benefit.banking.Controllers;

import benefit.banking.DAO.Finance_DAO;
import benefit.banking.DAO.GDN_DAO;
import benefit.banking.Entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Finance")
public class Finance_Controller {
    @Autowired
    private Finance_DAO finance_dao;
    @PutMapping(value="/update/{id}")
    public String update(@RequestBody Transaction t, @PathVariable int id)
    {
        finance_dao.update(t,id);
        return "updated";
    }
    @PutMapping(value="/reject/{id}")
    public String reject(@PathVariable int id)
    {
        finance_dao.reject(id);
        return "rejected";
    }
    @GetMapping("/read")
    public List<Map<String, Object>> read()
    {
        return finance_dao.read();
    }
}
