package edu.neu.ql_vdvsys.controller.user;

import edu.neu.ql_vdvsys.entity.Athlete;
import edu.neu.ql_vdvsys.entity.UserDtls;
import edu.neu.ql_vdvsys.repository.UserRepository;
import edu.neu.ql_vdvsys.service.AthleteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController{
    private final UserRepository userRepo;
    private final AthleteService service;
    public UserController (UserRepository userRepo,AthleteService service){
        this.userRepo = userRepo;
        this.service = service;
    }
    @ModelAttribute
    private void userDetails(Model m, Principal p) {
        String username = p.getName();
        UserDtls user = userRepo.findByUsername(username);
        m.addAttribute("user", user);
    }
    @GetMapping("/")
    public String detail() {
        return"/user/infor";
    }
    @GetMapping("/home")
    public String home(Model m) {
        List<Athlete> ath = service.getAllAth();
        m.addAttribute("ath", ath);

        return "user/home";
    }
    //@GetMapping("/addBGround")
    //public String addBgroundForm(){return "add_Background";}
    @GetMapping("/addath")
    public String addAthForm() {
        return "/user/add_ath";
    }

    @PostMapping("/assign")
    public String athRegister(@ModelAttribute Athlete a, HttpSession session) {
        System.out.println(a);
        service.addAth(a);
        session.setAttribute("msg", "Athlete added Sucessfully!!");
        return "redirect:/user/home";
    }

    @GetMapping("/edit/{maVDV}")
    public String edit(@PathVariable long maVDV, Model m) {
        Athlete a = service.getAthById(maVDV);
        m.addAttribute("ath", a);
        return "/user/edit";
    }

    @PostMapping("/update")
    public String updateAth(@ModelAttribute Athlete a, HttpSession session) {
        service.addAth(a);
        session.setAttribute("msg", "Ath Data Update Sucessfully");
        return "redirect:/user/home";
    }

    @GetMapping("/delete/{maVDV}")
    public String deleteAth(@PathVariable long maVDV, HttpSession session) {
        service.deleteAth(maVDV);
        session.setAttribute("msg", "Ath Data Delete Successfully");
        return "redirect:/user/home";
    }
}