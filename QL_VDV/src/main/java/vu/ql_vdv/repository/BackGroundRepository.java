package edu.neu.ql_vdvsys.repository;

import edu.neu.ql_vdvsys.entity.BackGround;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BackGroundRepository extends JpaRepository<BackGround, Integer> {
}