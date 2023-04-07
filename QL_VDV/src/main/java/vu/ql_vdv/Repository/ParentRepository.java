package vu.ql_vdv.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vu.ql_vdv.Entity.Parent;

public interface ParentRepository extends JpaRepository<Parent,String> {
}
