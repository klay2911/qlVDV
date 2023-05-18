package edu.neu.ql_vdvsys.controller.coach;


import edu.neu.ql_vdvsys.entity.Athlete;
import edu.neu.ql_vdvsys.entity.UserDtls;
import edu.neu.ql_vdvsys.repository.UserRepository;
import edu.neu.ql_vdvsys.service.AthleteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/coach")
public class CoachController {
    private final UserRepository userRepo;
    private final AthleteService service;

    public CoachController(UserRepository userRepo, AthleteService service) {
        this.userRepo = userRepo;
        this.service = service;
    }

    @GetMapping("/")
    public String detail() {
        return "coach/infor";
    }
        @ModelAttribute
        private void userDetails(Model m, Principal p) {
            String username = p.getName();
            UserDtls user = userRepo.findByUsername(username);
            m.addAttribute("user", user);
        }

    @GetMapping("/home")
    public String home(Model m) {
        List<Athlete> ath = service.getAllAth();
        m.addAttribute("ath", ath);

        return "coach/home";
    }

    @GetMapping("/addBGround")
    public String addBgroundForm() {
        return "/coach/add_Background";
    }

    @GetMapping("/BGround")
    public String BGroundForm(){return "/coach/Background";}

    @GetMapping("/viewcom/{maVDV}")
    public String viewAthCom(@PathVariable long maVDV, Model m) {
        Athlete ath = service.getAthById(maVDV);
        m.addAttribute("ath", ath);
        return "/coach/viewcom";
    }
/*
    @PostMapping("/assign")
    public String athRegister(@ModelAttribute Athlete a, HttpSession session) {
        System.out.println(a);
        service.addAth(a);
        session.setAttribute("msg", "Athlete added Sucessfully!!");
        return "redirect:/coach/home";
    }

    @GetMapping("/edit/{maVDV}")
    public String edit(@PathVariable long maVDV, Model m) {
        Athlete a = service.getAthById(maVDV);
        m.addAttribute("ath", a);
        return "/coach/edit";
    }

    @PostMapping("/update")
    public String updateAth(@ModelAttribute Athlete a, HttpSession session) {
        service.addAth(a);
        session.setAttribute("msg", "Ath Data Update Sucessfully");
        return "redirect:/coach/home";
    }

    @GetMapping("/delete/{maVDV}")
    public String deleteAth(@PathVariable long maVDV, HttpSession session) {
        service.deleteAth(maVDV);
        session.setAttribute("msg", "Ath Data Delete Successfully");
        return "redirect:/coach/home";
    }*/
}
