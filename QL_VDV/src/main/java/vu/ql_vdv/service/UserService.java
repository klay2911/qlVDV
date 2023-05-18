package edu.neu.ql_vdvsys.service;

import edu.neu.ql_vdvsys.entity.UserDtls;

public interface UserService {
     UserDtls createUser(UserDtls user);
    boolean checkUsername(String username);
}
