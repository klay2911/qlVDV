package vu.ql_vdv.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import vu.ql_vdv.Entity.Athlete;
import vu.ql_vdv.Repository.AthleteRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/Athlete")
public class AthleteController {
       /* static List<Athlete> athleteList = new ArrayList<>();

        //khởi tạo dữ liệu cho list
        static {
            athleteList.add(new Athlete(2, "Hoang", "", ));
            athleteList.add(new Athlete(3, "Le", "Station", 250));
            athleteList.add(new Athlete(4, "Thanh", "BOD", 700));
        }

        @GetMapping()
        public List<Athlete> getAllAthlete() {
            return athleteList;
        }*/
    /*@RequestMapping(value="/athlete",method = RequestMethod.GET)
    public String showForm(){
        return "athlete/form";
    }*/

    @Autowired
    private AthleteRepository athleteRepository;

    @GetMapping(value = {"newOrEdit"})
    public String newOrEdit(ModelMap athlete){
        return "athlete/newOrEdit";
    }
    }

