package vu.ql_vdv.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import vu.ql_vdv.Entity.User;
import vu.ql_vdv.Repository.UserRepository;

@Service
public class UserServiceImp implements UserService {
    UserRepository userRepository;
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public User save(User entity) {
        return userRepository.save(entity);
    }
    @Override
    public List<User> saveAll(List<User> entities) {
        return (List<User>) userRepository.saveAll(entities);
    }
    @Override
    public Optional<User> findById(String id) {
        return userRepository.findById(id);
    }
    @Override
    public boolean existsById(String id) {
        return userRepository.existsById(id);
    }
    @Override
    public List<User> findAll() {
        return (List<User>)userRepository.findAll();
    }
    @Override
    public List<User> findAllById(List<String> ids) {
        return (List<User>) userRepository.findAllById(ids);
    }
    @Override
    public long count() {
        return userRepository.count();
    }
    @Override
    public void deleteById(String id) {
        userRepository.deleteById(id);
    }
    @Override
    public void delete(User entity) {
        userRepository.delete(entity);
    }
    @Override
    public void deleteAll(List<User> entities) {
        userRepository.deleteAll(entities);
    }
    @Override
    public void deleteAll() {
        userRepository.deleteAll();
    }
}
