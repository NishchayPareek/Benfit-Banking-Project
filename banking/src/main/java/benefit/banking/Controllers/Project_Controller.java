package benefit.banking.Controllers;

import benefit.banking.DAO.Project_DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class Project_Controller
{
    @Autowired
    Project_DAO project_dao;
    @GetMapping("/save")
    public List<Map<String, Object>> Read()
    {
        return project_dao.Read();
    }
}
