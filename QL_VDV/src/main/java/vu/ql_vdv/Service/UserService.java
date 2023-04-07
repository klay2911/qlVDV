package vu.ql_vdv.Service;

import vu.ql_vdv.Entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User save(User entity);

    List<User> saveAll(List<User> entities);

    Optional<User> findById(String id);

    boolean existsById(String id);

    List<User> findAll();

    List<User> findAllById(List<String> ids);

    long count();

    void deleteById(String id);

    void delete(User entity);

    void deleteAll(List<User> entities);

    void deleteAll();
}
