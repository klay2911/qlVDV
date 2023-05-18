package edu.neu.ql_vdvsys.repository;

import edu.neu.ql_vdvsys.entity.UserDtls;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<UserDtls, Integer> {
    boolean existsByUsername(String username);
    UserDtls findByUsername(String username);
}
