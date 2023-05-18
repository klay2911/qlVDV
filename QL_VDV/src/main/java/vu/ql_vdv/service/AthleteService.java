package edu.neu.ql_vdvsys.service;

import edu.neu.ql_vdvsys.entity.Athlete;
import edu.neu.ql_vdvsys.repository.AthleteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AthleteService {
    private final AthleteRepository repo;

    public AthleteService(AthleteRepository repo) {
        this.repo = repo;
    }

    public void addAth(Athlete a) {
        repo.save(a);
    }

    public List<Athlete> getAllAth() {
        return repo.findAll();
    }

    public Athlete getAthById(long maVDV) {
        Optional<Athlete> a = repo.findById(maVDV);
        return a.orElse(null);
    }

    public void deleteAth(long maVDV) {
        repo.deleteById(maVDV);
    }
}