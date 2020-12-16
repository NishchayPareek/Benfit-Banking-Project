package benefit.banking.Controllers;

import benefit.banking.DAO.SDL_DAO;
import benefit.banking.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/SDL")
public class SDL_Controller
{
    @Autowired
    private SDL_DAO sdl_dao;

     private int HC;
     private String Mode;
    @GetMapping("/Read/{id}")
    public List<Map<String, Object>> Read(@PathVariable int id)
    {
        return sdl_dao.Read(id);
    }
    @GetMapping("/read/{id}")
    public List<Map<String, Object>> read(@PathVariable String id)
    {
        return sdl_dao.read(id);
    }
    @PostMapping("/create")
    public String create(@RequestBody Transaction t)
    {
       this.HC=t.getHc();
       this.Mode=t.getMode();
       //return "created";
       return t.toString();
    }
    @PostMapping("/employee-validate")
    public int search(@RequestBody Transaction t )
    {
      return   sdl_dao.search(t.getEmployee_Name());
    }
    @PostMapping("/ANB/{id}")
    public String createANB(@RequestBody List<ANB> anb,@PathVariable String id)
    {
        sdl_dao.createANB(anb,HC,Mode,id);
        return "created";
    }
    @PostMapping("/ORC/{id}")
    public String createORC(@RequestBody List<ORC> orc,@PathVariable String id)
    {
        sdl_dao.createORC(orc,HC,Mode,id);
        return orc.toString();
    }


    @PostMapping("/IJP/{id}")
    public String createIJP(@RequestBody List<IJP> ijp,@PathVariable String id)
    {
        sdl_dao.createIJP(ijp,HC,Mode,id);
        return ijp.toString();
    }

    @PostMapping("/ATS/{id}")
    public String createATS(@RequestBody List<ATS> ats,@PathVariable String id)
    {
        sdl_dao.createATS(ats,HC,Mode,id);
        return "created";
    }
    @PutMapping(value="/update/{id}")
    public String update(@RequestBody List<Transaction> t,@PathVariable int id)
    {
       sdl_dao.update(t,id);
        return t.toString();
    }
   @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id)
   {
       sdl_dao.delete(id);
   }
}
