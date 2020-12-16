package benefit.banking.Controllers;

import benefit.banking.DAO.User_Dao;
import benefit.banking.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class User_Controller
{
@Autowired
   private User_Dao user_dao;
@PostMapping("/login")
   public int login(@RequestBody User u)
{
    return user_dao.read(u);
}
//    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping("/read")
    public List<Map<String, Object>> read()
    {
        return user_dao.read();
    }
}
