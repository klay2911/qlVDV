package vu.ql_vdv.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vu.ql_vdv.Entity.NationalAthlete;

public interface NationalAthleteRepository extends JpaRepository<NationalAthlete, Integer> {
}
