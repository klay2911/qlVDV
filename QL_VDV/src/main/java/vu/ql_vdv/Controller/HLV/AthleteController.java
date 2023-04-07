package vu.ql_vdv.Controller.HLV;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vu.ql_vdv.Entity.Athlete;
import vu.ql_vdv.Repository.AthleteRepository;
import java.util.Optional;

@Controller
@RequestMapping("/Athlete")
public class AthleteController {
    AthleteRepository athleteRepository;
    public AthleteController(AthleteRepository athleteRepository){
        this.athleteRepository = athleteRepository;
    }

    @RequestMapping(value = { "/athlete-list" })
public String listAthlete(Model model) {
    model.addAttribute("listAthlete", athleteRepository.findAll());
    return "athlete-list";
}
    @RequestMapping("/athlete-save")
    public String insertAthlete(Model model) {
        model.addAttribute("athlete", new Athlete());
        return "athlete-save";
    }
    @RequestMapping("/athlete-view/{maVDV}")
    public String viewAthlete(@PathVariable Long maVDV, Model model) {
        Optional<Athlete> athlete = athleteRepository.findById(maVDV);
        if (athlete.isPresent()) {
            model.addAttribute("athlete", athlete.get());
        }
        return "athlete-view";
    }
    @RequestMapping("/athlete-update/{maVDV}")
    public String updateAthlete(@PathVariable Long maVDV, Model model) {
        Optional<Athlete> athlete = athleteRepository.findById(maVDV);
        if (athlete.isPresent()) {
            model.addAttribute("athlete", athlete.get());
        }
        return "athlete-update";
    }
    @RequestMapping("/saveAthlete")
    public String doSaveAthlete(@ModelAttribute("Athlete") Athlete athlete, Model model) {
        athleteRepository.save(athlete);
        model.addAttribute("listAthlete", athleteRepository.findAll());
        return "athlete-list";
    }
    @RequestMapping("/updateAthlete")
    public String doUpdateAthlete(@ModelAttribute("Athlete") Athlete athlete, Model model) {
        athleteRepository.save(athlete);
        model.addAttribute("listAthlete", athleteRepository.findAll());
        return "athlete-list";
    }
    @RequestMapping("/athleteDelete/{maVDV}")
    public String doDeleteAthlete(@PathVariable Long maVDV, Model model) {
        athleteRepository.deleteById(maVDV);
        model.addAttribute("listAthlete", athleteRepository.findAll());
        return "athlete-list";
    }
    }

