package vu.ql_vdv.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
/*@RequestMapping("homepage")
public class HomeController {
    public ModelAndView index(){
        ModelAndView = new ModelAndView("index");
        return new ModelAndView();
    }
}*/
public class HomeController {
    @RequestMapping("home")
    public String index(){
        return "index";
    }
}
