package vu.ql_vdv.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vu.ql_vdv.Entity.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule,Integer> {
}
