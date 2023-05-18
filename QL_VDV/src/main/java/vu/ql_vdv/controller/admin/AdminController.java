package edu.neu.ql_vdvsys.controller.admin;

import edu.neu.ql_vdvsys.entity.Athlete;
import edu.neu.ql_vdvsys.entity.UserDtls;
import edu.neu.ql_vdvsys.repository.UserRepository;
import edu.neu.ql_vdvsys.service.AthleteService;
import edu.neu.ql_vdvsys.service.UserService;
import edu.neu.ql_vdvsys.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    private final UserRepository userRepo;
    private final AthleteService service;
    private final UserService userService;
    private final UserServiceImpl userServiceImpl;

    public AdminController(UserRepository userRepo, AthleteService service, UserService userService,UserServiceImpl userServiceImpl) {
        this.userRepo = userRepo;
        this.service = service;
        this.userService = userService;
        this.userServiceImpl = userServiceImpl;
    }

    @GetMapping("/")
    public String detail() {
        return "admin/infor";
    }
        @ModelAttribute
        private void userDetails(Model m, Principal p) {
            String username = p.getName();
            UserDtls user = userRepo.findByUsername(username);
            m.addAttribute("user", user);
        }

    @GetMapping("/register")
    public String register() {
        return "/admin/register";
    }
        @PostMapping("/createUser")
        public String createuser(@ModelAttribute UserDtls user, HttpSession session) {
            // System.out.println(user);
            boolean f = userService.checkUsername(user.getUsername());

            if (f) {
                session.setAttribute("msg", "Username alreday exists");
            } else {
                UserDtls userDtls = userService.createUser(user);
            if (userDtls != null) {
                session.setAttribute("msg", "Register Sucessfully");
            } else {
                session.setAttribute("msg", "Something wrong on server");
                }
            }
        return "redirect:/admin/register";
        }

    @GetMapping("/home")
    public String home(Model m) {
        //List<Athlete> ath = service.getAllAth();
        //m.addAttribute("ath", ath);
        List<UserDtls> user = userServiceImpl.getAllUser();
        m.addAttribute("user", user);

        return "admin/home";
    }

    @GetMapping("/addBGround")
    public String addBgroundForm() {
        return "/admin/add_Background";
    }

    @GetMapping("/addath")
    public String addAthForm() {
        return "/admin/add_ath";
    }
    @PostMapping("/assign")
    public String athRegister(@ModelAttribute Athlete a, HttpSession session) {
        System.out.println(a);
        service.addAth(a);
        session.setAttribute("msg", "Athlete added Sucessfully!!");
        return "redirect:/admin/home";
    }

   /* @GetMapping("/edit/{maVDV}")
    public String edit(@PathVariable long maVDV, Model m) {
        Athlete a = service.getAthById(maVDV);
        m.addAttribute("ath", a);
        return "/admin/edit";
    }

    @PostMapping("/update")
    public String updateAth(@ModelAttribute Athlete a, HttpSession session) {
        service.addAth(a);
        session.setAttribute("msg", "Ath Data Update Sucessfully");
        return "redirect:/admin/home";
    }

    @GetMapping("/delete/{maVDV}")
    public String deleteAth(@PathVariable long maVDV, HttpSession session) {
        service.deleteAth(maVDV);
        session.setAttribute("msg", "Ath Data Delete Successfully");
        return "redirect:/admin/home";
    }*/
   @GetMapping("/edit/{id_user}")
   public String editUser0(@PathVariable int id_user, Model m) {
       UserDtls u = userServiceImpl.getUserById(id_user);
       m.addAttribute("user", u);
       return "/admin/edit";
   }

    @PostMapping("/update")
    public String updateUser(@ModelAttribute UserDtls u, HttpSession session) {
        userService.createUser(u);
        session.setAttribute("msg", "User Data Update Sucessfully");
        return "redirect:/admin/home";
    }

    @GetMapping("/delete/{id_user}")
    public String deleteUser(@PathVariable int id_user, HttpSession session) {
        userServiceImpl.deleteUser(id_user);
        session.setAttribute("msg", "User Data Delete Successfully");
        return "redirect:/admin/home";
    }
}