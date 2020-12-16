package benefit.banking.Controllers;

import benefit.banking.DAO.HR_DAO;
import benefit.banking.DAO.OD_DAO;
import benefit.banking.Entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/HR")
public class HR_Controller
{
    @Autowired
    private HR_DAO hr_dao;
    @PutMapping(value="/update/{id}")
    public String update(@RequestBody Transaction t, @PathVariable int id)
    {
        hr_dao.update(t,id);
        return "updated";
    }
    @PutMapping(value="/reject/{id}")
    public String reject(@PathVariable int id)
    {
        hr_dao.reject(id);
        return "rejected";
    }
    @GetMapping("/read")
    public List<Map<String, Object>> read()
    {
        return hr_dao.read();
    }
}
