package vu.ql_vdv.Repository;

import org.springframework.data.repository.CrudRepository;
import vu.ql_vdv.Entity.User;

public interface UserRepository extends CrudRepository<User, String> {
}
