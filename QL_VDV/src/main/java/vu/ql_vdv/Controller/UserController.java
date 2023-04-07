package vu.ql_vdv.Controller;
/*
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vu.ql_vdv.Entity.User;
import vu.ql_vdv.Service.UserService;

@Controller
public class UserController {
    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String addOrEdit(ModelMap model) {
        User u = new User();
        model.addAttribute("User", u);
        model.addAttribute("ACTION", "saveOrUpdate");
        return "register-user";
    }
    @PostMapping("/saveOrUpdate")
    public String saveOrUpdate(ModelMap model, @ModelAttribute("USER") User user){
        userService.save(user);
        return "register-user";
    }
    @RequestMapping("list")
    public String list(ModelMap model){
        userService.findAll();
        return "view-user";
    }
}
*/