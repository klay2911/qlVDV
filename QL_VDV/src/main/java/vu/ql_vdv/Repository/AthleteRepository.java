package vu.ql_vdv.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vu.ql_vdv.Entity.Athlete;

public interface AthleteRepository extends JpaRepository<Athlete, Long> {
}