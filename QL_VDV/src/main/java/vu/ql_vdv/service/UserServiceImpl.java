package edu.neu.ql_vdvsys.service;

import edu.neu.ql_vdvsys.entity.UserDtls;
import edu.neu.ql_vdvsys.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepo;
    private final BCryptPasswordEncoder passwordEncode;

    public UserServiceImpl(UserRepository userRepo, BCryptPasswordEncoder passwordEncode){
        this.userRepo=userRepo;
        this.passwordEncode = passwordEncode;
    }
    @Override
    public UserDtls createUser(UserDtls user) {

        user.setPassword(passwordEncode.encode(user.getPassword()));
        //user.setRole("ROLE_USER");

        return userRepo.save(user);
    }

    @Override
    public boolean checkUsername(String username) {

        return userRepo.existsByUsername(username);
    }

    public List<UserDtls> getAllUser() {
        return userRepo.findAll();
    }

    public UserDtls getUserById(int id_user) {
        Optional<UserDtls> u = userRepo.findById(id_user);
        return u.orElse(null);
    }

    public void deleteUser(int id_user) {
        userRepo.deleteById(id_user);
    }
}
/*
public class UserServiceImpl implements UserService {

    private final UserRepository userRepo;
    private final BCryptPasswordEncoder passwordEncode;

    public UserServiceImpl(UserRepository userRepo, BCryptPasswordEncoder passwordEncode) {
        this.userRepo = userRepo;
        this.passwordEncode = passwordEncode;
    }

    @Override
    public UserDtls createUser(UserDtls user) {

        user.setPassword(passwordEncode.encode(user.getPassword()));
        user.setRole("ROLE_USER");

        return userRepo.save(user);
    }

    @Override
    public boolean checkEmail(String email) {

        return userRepo.existsByEmail(email);
    }
}*/